package com.example.felix.FashionBlog.Repository;

import com.enwerevincent.restblog.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
  //  @Query(value = "SELECT * FROM posts WHERE  title LIKE '%keyword%' " , nativeQuery = true)
    List<Post> findByTitleContainingIgnoreCase(String keyword);
}
