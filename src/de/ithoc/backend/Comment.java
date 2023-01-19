package de.ithoc.backend;

import java.util.Date;

public class Comment {

// Attributes

    private int commentId;
    private String text;
    private String title;
    private String author;
    private Date date;

// Methods

    public int setId(int commentId){
        
        this.commentId = 0;
        
        for (int i=1; i<=50; i++){
            commentId = commentId + i;
        }
         
        return commentId; // Impelementieren: fortlaufend, also +1       
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

}
