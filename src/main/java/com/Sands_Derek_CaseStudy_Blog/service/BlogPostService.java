package com.Sands_Derek_CaseStudy_Blog.service;

import com.Sands_Derek_CaseStudy_Blog.model.BlogPost;
import com.Sands_Derek_CaseStudy_Blog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    public BlogPost saveBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public Optional<BlogPost> findById(Long id) {
        return blogPostRepository.findById(id);
    }

    public List<BlogPost> findAll() {
        return blogPostRepository.findAll();
    }

    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
