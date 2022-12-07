package com.sparta.spartahomework.repository;

import com.sparta.spartahomework.dto.PostResponseDto;
import com.sparta.spartahomework.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<PostsMapping> findAllByOrderByModifiedAtDesc();

}
