package com.example.felix.FashionBlog.Exception;

import lombok.Getter;

@Getter
public class PostNotFoundException extends RuntimeException{
    private String message;

    public PostNotFoundException(String message) {
        this.message = message;
    }
}
