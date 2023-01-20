package de.ithoc.frontend;

import java.util.Scanner;
import java.util.Date;
import java.util.HashMap;

import de.ithoc.Persistence.DataStorage;
import de.ithoc.backend.Comment;
import de.ithoc.backend.Post;
import de.ithoc.backend.User;

public class UserInterface {

    Scanner scan = new Scanner(System.in);
    DataStorage data = new DataStorage();
    private String username;

    public void init() {

        System.out.println("Hi, welcome to our blog! What would you like to do?");
        int scanned = 0;
        while (scanned != 3) {
            System.out.println("These are your options:\n1. create new user\n2. login \n3. exit");
            scanned = scan.nextInt();
            if (scanned == 1) {
                newUser();
            } else if (scanned == 2) {
                login();
            }
        }
    }

    public User newUser() {
        System.out.println("Enter your username: ");
        String key = scan.nextLine();
        key = scan.nextLine();

        System.out.println("Enter your password: ");
        String pwd = scan.nextLine();

        User user = newUserSave(key, pwd);
        return user;
    }

    public User newUserSave(String key, String pwd) {
        HashMap<String, User> userList = data.getUserList();
        User user = new User();
        if (userList.containsKey(key)) {
            System.out.println("This user already exists. Please log in or choose a different username.");
            return user;
        }
        user.setUsername(key);
        user.setPassword(pwd);
        data.saveUser(user);
        return user;
    }

    public void login() {
        HashMap<String, User> userList = data.getUserList();
        System.out.println("Please enter your username: ");
        scan.nextLine();
        this.username = scan.nextLine();
        if (userList.containsKey(username)) {
            User user = userList.get(username);
            System.out.println("Please enter your password: ");
            String pwd = scan.nextLine();
            if (user.getPasswort().equals(pwd)) {
                System.out.println("Welcome " + username + " what would you like to do?");
                int options = 0;
                while (options != 8) {
                    System.out.println(
                            "These are your options:\n1. create post\n2. comment on post\n3. edit post\n4. delete post\n5. edit comment\n6. delete comment\n7. view users and posts\n8. logout");
                    options = scan.nextInt();
                    if (options == 1) {
                        newPost();
                    } else if (options == 2) {
                        newComment();
                    } else if (options == 3) {
                        editPost();
                    }
                    else if (options == 4){
                    deletePost();
                    }
                    // else if (options == 5){
                    // editComment();
                    // }
                    // else if (options == 6){
                    // deleteComment();
                    // }
                    else if (options == 7) {
                        data.printPosts();
                        data.printUsers();
                    }
                }
                System.out.println("Goodbye!");
            } else {
                System.out.println("Sorry, wrong password.");
            }
        } else {
            System.out.println("User does not exist!");
        }
        ;
    }

    public void newComment() {

        Comment comment = new Comment();

        data.printPosts();

        System.out.println("Enter the post id: ");

        Integer postId = scan.nextInt();

        scan.nextLine();

        Post post = data.getPostList().get(postId);

        if (post == null) {

            System.out.println("Invalid post id. Please try again.");

            return;

        }

        System.out.println("Enter your comment: ");

        comment.setText(scan.nextLine());

        comment.setAuthor(username);

        comment.setDate(new Date());

        post.saveComment(comment);

    }

    public Post editPost() {
        HashMap<Integer, Post> postList = data.getPostList();
        System.out.println("These are all available posts. Please enter the ID of the post you would like to edit.");
        data.printPosts();
        Integer id = scan.nextInt();
        Post post = postList.get(id);
        if (post.getAuthor().equals(username)) {
            System.out.println(post.getText());
            System.out.println("Enter new post: ");
            post.setText(scan.nextLine());
            return post;
        } else {
            System.out.println("You're not the author of this post!");
        }
        return post;
    }

    // public Comment editComment() {
    // data.printPosts();

    // System.out.println("Enter the post id: ");

    // Integer postId = scan.nextInt();

    // scan.nextLine();

    // Post post = data.getPostList().get(postId);
    // HashMap<Integer, Comment> commentList = post.getCommentList();
    // Comment comment = //hier fehlt was

    // if (post == null) {

    // System.out.println("Invalid post id. Please try again.");

    // return comment;

    // }

    // System.out.println("These are all available posts. Please enter the ID of the
    // post you would like to edit.");
    // Integer id = scan.nextInt();
    // Post post = postList.get(id); // muss noch bearbeitet werden
    // if (post.getAuthor().equals(username)){
    // System.out.println(post.getText());
    // System.out.println("Enter new post: ");
    // post.setText(scan.nextLine());
    // return post;
    // }
    // else{System.out.println("You're not the author of this post!");}
    // return post;
    // }

    public Post newPost() {
        Post post = new Post();
        post.setAuthor(username);
        System.out.println("Enter your title: ");
        scan.nextLine();
        post.setTitle(scan.nextLine());
        System.out.println("Enter your post below: ");
        post.setText(scan.nextLine());

        data.savePost(post);
        return post;
    }

    public void deletePost() {
        HashMap<Integer, Post> postList = data.getPostList();
        System.out.println("These are all available posts. Please enter the ID of the post you would like to delete.");
        data.printPosts();
        Integer id = scan.nextInt();
        Post post = postList.get(id);
        if (post.getAuthor().equals(username)) {
            System.out.println("Are you sure you want to delete your post?\nY/N");
            String answer = scan.nextLine();
            answer = scan.nextLine();
            if (answer.equals("Y")){
                postList.remove(id);
                System.out.println("Your post was deleted.");
            }
            else{System.out.println("Your post was not deleted!");
            }
        }
    }
}
