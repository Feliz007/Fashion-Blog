package com.example.felix.FashionBlog.Response;

import com.example.felix.FashionBlog.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CreatePostResponse {

    private String message;
    private LocalDateTime timeStamp;
    private Post post;
}
