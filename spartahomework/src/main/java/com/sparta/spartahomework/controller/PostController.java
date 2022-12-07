package com.sparta.spartahomework.controller;

import com.sparta.spartahomework.dto.PostRequestDto;
import com.sparta.spartahomework.dto.PostResponseDto;
import com.sparta.spartahomework.entity.Post;
import com.sparta.spartahomework.repository.PostsMapping;
import com.sparta.spartahomework.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // 전체 게시글 조회
    @GetMapping("/api/posts")
    public List<PostsMapping> getPosts() {
        return postService.getPosts();
    }

    // 게시글 작성
    @PostMapping("/api/post")
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    // 선택한 게시글 조회
    @GetMapping("/api/post/{id}")
    public PostResponseDto getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    // 선택한 게시글 수정
    @PutMapping("/api/post/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto postRequestDto) {
        return postService.update(id, postRequestDto);
    }

    // 선택한 게시글 삭제
    @DeleteMapping("/api/post/{id}")
    public Long deletePost(@PathVariable Long id, @RequestBody int password) {
        return postService.deletePost(id, password);
    }
}
