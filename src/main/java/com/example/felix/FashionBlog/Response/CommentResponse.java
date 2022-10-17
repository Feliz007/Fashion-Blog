package com.example.felix.FashionBlog.Response;

import com.example.felix.FashionBlog.Model.Comment;
import com.example.felix.FashionBlog.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CommentResponse {
    private String message;
    private LocalDateTime timeStamp;
    private Comment comment;
    private  Post post;

}
