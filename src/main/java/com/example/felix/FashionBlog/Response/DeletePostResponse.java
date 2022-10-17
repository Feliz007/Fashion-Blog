package com.example.felix.FashionBlog.Response;

import com.example.felix.FashionBlog.Model.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeletePostResponse {
    private String message;
    private LocalDateTime timeStamp;
    private Post post;
}
