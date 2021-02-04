package com.cleancode.homework.phan2.bai5.model;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;

@Data
public class Post {

    private long id;
    private String title;
    private String content;
    private User author;
    private ArrayList<Comment> comments;

    public void save() {
        savePost();
        saveComments();
    }
    private void savePost() {
        System.out.println(String.format("save post %s successful.", this.title));
    }
    private void saveComments() {
        if(!CollectionUtils.isEmpty(this.comments)) {
            this.comments.forEach(comment -> comment.save());
            System.out.println("save comments of post successful.");
        } else {
            System.out.println("this post has not comments to save.");
        }
    }

    public void delete() {
        deleteComments();
        deletePost();
    }
    private void deletePost() {
        System.out.println(String.format("delete post %s successful.", this.title));
    }
    private void deleteComments() {
        if(!CollectionUtils.isEmpty(this.comments)) {
            this.comments.forEach(comment -> comment.delete());
            System.out.println("delete comments of post successful.");
        } else {
            System.out.println("this post has not comments to delete.");
        }
    }
}
