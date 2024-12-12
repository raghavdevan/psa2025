package com.cmr.controller;


import com.cmr.Repository.CommentRepository;
import com.cmr.Repository.PostRepository;
import com.cmr.entity.Post;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    public PostController(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

     @PostMapping
     public String createPost(@RequestBody Post post){
        postRepository.save(post);
        return "saved";




     }




}
