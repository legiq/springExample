package com.example.sweater.repos;

import com.example.sweater.domain.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment, Integer> {
}
