package com.blog.blog.service.Impl;

import com.blog.blog.entities.Post;
import com.blog.blog.payload.PostDto;
import com.blog.blog.repositories.PostRepo;
import com.blog.blog.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl  implements PostService {

    private PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savedPost= postRepo.save(post);
        PostDto dto=new PostDto();
        dto.setId(savedPost.getId());
        dto.setDescription(savedPost.getDescription());
        dto.setTitle(savedPost.getTitle());
        dto.setContent(savedPost.getContent());


        return dto;
    }
}
