package com.example.sweater.domain;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String text;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    public Comment() {
    }

    public Comment(String text, User author){
        this.text = text;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
