package de.ithoc.backend;

import java.util.Date;

import org.junit.Test;

public class CommentTest {

// Attributes

    private int commentId;
    private String text;
    private String title;
    private String author;
    private Date date;

// Methods
@Test
public int setId(int commentId){
        
        this.commentId = 0;
        
        for (int i=1; i<=50; i++){
            commentId = commentId + i;
        }
         
        return commentId; // Impelementieren: fortlaufend, also +1       
    }

    public int getId(){

        return commentId;   
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

