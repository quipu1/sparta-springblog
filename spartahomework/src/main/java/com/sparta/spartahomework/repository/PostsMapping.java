package com.sparta.spartahomework.repository;

import java.time.LocalDateTime;

public interface PostsMapping {
    String getAuthor();
    String getTitle();
    String getContent();
    LocalDateTime getCreatedAt();
    LocalDateTime getModifiedAt();
}
