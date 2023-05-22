package com.blog.blog.service;

import com.blog.blog.entities.Post;
import com.blog.blog.payload.PostDto;

public interface PostService {
   PostDto createPost(PostDto postDto);
}
