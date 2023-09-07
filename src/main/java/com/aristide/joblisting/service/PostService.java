package com.aristide.joblisting.service;

import com.aristide.joblisting.model.Post;
import com.aristide.joblisting.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository repository;

    public List<Post> readAllPosts(){
        return repository.findAll();
    }

    public Post createPost(Post post){
        return repository.save(post);
    }

}
