package com.aristide.joblisting.controller;

import com.aristide.joblisting.dto.PostDTO;
import com.aristide.joblisting.model.Post;
import com.aristide.joblisting.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService service;

    @PostMapping("/")
    public Post createPost(@RequestBody PostDTO post){
        return service.createPost(Post.builder()
                        .profile(post.getProfile())
                        .description(post.getDescription())
                        .experience(post.getExperience())
                        .technologies(post.getTechnologies())
                .build());
    }

    @GetMapping("/")
    public List<Post> readAllJobs(){
        return service.readAllPosts();
    }

}
