package com.cleancode.homework.phan1.bai5.model;

import lombok.Data;

@Data
public class Comment {

    private long id;
    private String title;
    private Post post;
    private User author;

    public void save() {
        System.out.println(String.format("save comment %s successful.", this.title));
    }
    public void delete() {
        System.out.println(String.format("delete comment %s successful.", this.title));
    }
}
