package com.blog.blog.repositories;

import com.blog.blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo  extends JpaRepository<Post,Long> {


}
