package com.example.felix.FashionBlog.Response;

import com.enwerevincent.restblog.Model.Post;
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
