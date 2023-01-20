package de.ithoc.Persistence;

import java.util.HashMap;
import java.util.Map;

import de.ithoc.backend.Admin;
import de.ithoc.backend.Post;
import de.ithoc.backend.User;

public class DataStorage {

    private HashMap<Integer, Post> postList = new HashMap<>();
    private HashMap<String, User> userList = new HashMap<>();
    private HashMap<String, Admin> adminList = new HashMap<>();

    private Integer maxId = 0;

    public Post savePost(Post post){
        if (post.getId() != null){
            return post;
        }
        maxId++;
        post.setId(maxId);
        postList.put(maxId, post);
        
        return post;
    }

    public User saveUser(User user){
        if (userList.containsKey(user.getUsername())){
            return user;
        }
        userList.put(user.getUsername(), user);
        
        return user;
    }

    // public User saveAdmin(Admin admin){
    //     if (adminList.containsKey(admin.getUsername())){
    //         return admin;
    //     }
    //     adminList.put(admin.getUsername(), admin);
        
    //     return admin;
    // }

    public void printUsers(){
        System.out.println("Users:\n________________");
      for (Map.Entry<String, User> entry : userList.entrySet()){
        System.out.println("Key(username): " + entry.getKey() + "\nValue(user): " + entry.getValue().toString()+"\n");
      }
    }

    public void printPosts(){
        System.out.println("Posts:\n________________");
        for (Map.Entry<Integer, Post> entry : postList.entrySet()){
          System.out.println("Key(ID): " + entry.getKey() + "\nValue(post): " + entry.getValue().toString()+"\n");
        }
      }

      public void printAdmins(){
        System.out.println("Admins:\n________________");
        for (Map.Entry<String, Admin> entry : adminList.entrySet()){
          System.out.println("Key(username): " + entry.getKey() + "\nValue(admin): " + entry.getValue().toString()+"\n");
        }
      }

      public HashMap<Integer, Post> getPostList(){
        return postList;
      }

      public HashMap<String, User> getUserList(){
        return userList;
      }

      public HashMap<String, Admin> getAdminList(){
        return adminList;
      }
}
