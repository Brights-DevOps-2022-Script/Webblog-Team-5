package de.ithoc.backend;

import java.util.Date;

public class Comment {

// Attributes

    private Integer commentId;
    private String text;
    private String author;
    private Date date;

// Methods

    public void setId(Integer commentId){
        this.commentId = commentId;    
    }

    public Integer getId(){
        return commentId;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
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

    @Override
    public String toString() {
        return "\nID=" + commentId + "\nDate=" + date + "\nAuthor=" + author + "\nText=" + text;
    }

}
