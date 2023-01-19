package de.ithoc.backend;

import java.util.Date;
import java.util.HashMap;

public class Post {
    
    private Integer postId;
    private String text;
    private String title;
    private String author;
    private Date date;
    private HashMap<Integer, Comment> comments;
    private Integer maxCommentId=0;

    public void setId(Integer postId){
        this.postId=postId;
    }

    public Integer getId(){
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

    public Comment saveComment(Comment comment){
        if (comment.getId() != null){
            return comment;
        }
        maxCommentId++;
        comment.setId(maxCommentId);
        comments.put(maxCommentId, comment);
        return comment;
    }
}