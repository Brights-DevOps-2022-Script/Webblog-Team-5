package de.ithoc.backend;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    
    private int postId;
    private String text;
    private String title;
    private String author;
    private Date date;
    private ArrayList<Comment> comments;

    public void setId(int postId){
        this.postId=postId;
    }

    public int getId(){
     return postId;   
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }


    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }


    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor(){
        return author;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public Date getDate(){
        return date;
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public Post(){
        this.comments = new ArrayList<Comment>();
    }



}
