package com.example.tao_ung_dung_blog.model.service;

import com.example.tao_ung_dung_blog.model.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);
}
