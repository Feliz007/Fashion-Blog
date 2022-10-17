package com.example.felix.FashionBlog.Service;

import com.enwerevincent.restblog.DTO.*;
import com.enwerevincent.restblog.Model.Post;
import com.enwerevincent.restblog.Response.*;

import java.util.List;

public interface UserService {

    RegisterResponse register(UserDto userDto);

    LoginResponse login(LoginDto loginDto);

    CreatePostResponse createPost(PostDto postDto);

    List<Post> viewAllPost();

    DeletePostResponse deletePost(int post_id);

    CommentResponse comment(int user_id , int post_id , CommentDto commentDto);

    LikeResponse like(int user_id , int post_id , LikeDto likeDto);

    SearchCommentResponse searchComment(String keyword);


    SearchPostResponse searchPost(String keyword);

    Post findPostById(int id);

}
