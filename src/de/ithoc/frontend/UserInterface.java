package de.ithoc.frontend;
import java.util.Scanner;
import java.util.HashMap;

import de.ithoc.Persistence.DataStorage;
import de.ithoc.backend.Comment;
import de.ithoc.backend.Post;
import de.ithoc.backend.User;

public class UserInterface {

    
    Scanner scan = new Scanner(System.in);
    DataStorage data = new DataStorage();

    public void init(){
        System.out.println("Hi, welcome to our blog! What would you like to do?");
        System.out.println("These are your options:\n1. create new user\n2. login\n3. new post\n4. show users and posts\n6. write comment\n6. exit");
        int scanned = 0;
       while (scanned != 6) {
        scanned = scan.nextInt();
        if (scanned == 1){
            newUser();
            System.out.println("These are your options:\n1. create new user\n2. login\n3. new post\n4. show users and posts\n6. write comment\n6. exit");
        }
        else if (scanned == 2) {
            login();
            System.out.println("These are your options:\n1. create new user\n2. login\n3. new post\n4. show users and posts\n6. write comment\n6. exit");
        }
        else if (scanned == 3) {
            newPost();
            System.out.println("These are your options:\n1. create new user\n2. login\n3. new post\n4. show users and posts\n6. write comment\n6. exit");
        }
        else if (scanned == 4){
            data.printPosts();
            data.printUsers();
            System.out.println("These are your options:\n1. create new user\n2. login\n3. new post\n4. show users and posts\n6. write comment\n6. exit");
        }
    }
    }

    public User newUser(){ 
        HashMap<String, User> userList = data.getUserList();
        
        System.out.println("Enter your username: ");
        String key = scan.nextLine();
        key = scan.nextLine();
        
        if (userList.containsKey(key)) {
            System.out.println("This user already exists. Please log in or choose a different username.");
        }
        User user = new User();
        user.setUsername(key);
        System.out.println("Enter your password: ");
        String pwd = scan.nextLine();
        //System.out.println("Please enter your password again to confirm: ");
        //if (...)
        user.setPassword(pwd);
        data.saveUser(user);
        return user;
    }

    public void login(){

    }

    public Comment newComment(){
        Comment comment = new Comment();

        return comment;
    }

    public Post newPost(){ 
        Post post = new Post();
        System.out.println("Enter your title: ");
        scan.nextLine();
        post.setTitle(scan.nextLine());
        System.out.println("Enter your post below: ");
        post.setText(scan.nextLine());

        data.savePost(post);
            return post;
        }
    }
    
