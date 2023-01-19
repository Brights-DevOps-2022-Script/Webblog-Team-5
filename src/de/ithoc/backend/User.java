package de.ithoc.backend;
//import java.util.ArrayList;

public class User {

    private String userName;
    private String passwort;

     
    /*public User(String userName, String passwort) {
        this.userName = userName;
        this.passwort = passwort;
    }/* */ 
    
    //User user = new User(userName, passwort);

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

    @Override
    public String toString() {
        return "Username=" + userName + ", Password=" + passwort;
    }
    /*public void editOwnPost(int noPost, String newContent) {
        
        Post post = dataStorage.getPost(noPost);
        if(post.getAuthor().equals(this.userName)) {
            post.setText(newContent);
            dataStorage.updatePost(post);
        }

    public void editOwnComment(int noComment, String newContent2 )/* */


    
}
