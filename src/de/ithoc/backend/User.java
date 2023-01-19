package de.ithoc.backend;
//import java.util.ArrayList;

public class User {

    private String userName;
    private String passwort;
    
    User user = new User();

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getUsername() {
        return userName;
    }

    public void setPassword(String passwort) {
        this.passwort = passwort;
    }

    public String getPasswort() {
        return passwort;
    }
    public void editOwnPost(int postId, String newContent) {
        
        Post post = dataStorage.getPost(postId);
        if(post.getAuthor().equals(this.username)) {
            post.methodToChangeTheContent(newContent);
            dataStorage.updatePost(post);
        }


    
}
