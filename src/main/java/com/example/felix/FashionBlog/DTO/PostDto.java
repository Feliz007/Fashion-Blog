package com.example.felix.FashionBlog.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private String title ;
    private String description;
    private String featuredImage;
    private int user_id;
}
