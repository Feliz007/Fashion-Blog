package com.example.felix.FashionBlog.Response;

import com.example.felix.FashionBlog.Model.Like;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class LikeResponse {
    private String message;
    private LocalDateTime timeStamp;
    private Like like;
    private int totalLikes;
}
