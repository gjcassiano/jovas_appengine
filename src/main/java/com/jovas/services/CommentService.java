package com.jovas.services;

import com.jovas.models.Comment;

import java.util.Date;

public class CommentService {

    public Comment add(String message) {
        Comment comment = new Comment();
        comment.setMessage(message);
        comment.setCreated(new Date());

        return comment;
    }
}
