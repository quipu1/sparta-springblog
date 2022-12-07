package com.sparta.spartahomework.service;

import com.sparta.spartahomework.dto.PostRequestDto;
import com.sparta.spartahomework.dto.PostResponseDto;
import com.sparta.spartahomework.entity.Post;
import com.sparta.spartahomework.repository.PostRepository;
import com.sparta.spartahomework.repository.PostsMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional(readOnly = true)
    public List<PostsMapping> getPosts() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }

    @Transactional
    public Post createPost(PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        postRepository.save(post);
        return post;
    }
    @Transactional(readOnly = true)
    public PostResponseDto getPost(Long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        PostResponseDto postResponseDto = new PostResponseDto(post);
        return postResponseDto;
    }
    @Transactional
    public PostResponseDto update(Long id, PostRequestDto postRequestDto) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        // 비밀번호 확인
        if (post.getPassword() == postRequestDto.getPassword()) {
            post.update(postRequestDto);
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
        PostResponseDto postResponseDto = new PostResponseDto(post);
        return postResponseDto;
    }
    @Transactional
    public Long deletePost(Long id, int password) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("게시글이 존재하지 않습니다.")
        );
        if (post.getPassword() == password) {
            postRepository.deleteById(id);
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }
        return id;
    }
}
