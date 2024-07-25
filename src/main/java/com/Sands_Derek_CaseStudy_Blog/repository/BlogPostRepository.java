package com.Sands_Derek_CaseStudy_Blog.repository;

import com.Sands_Derek_CaseStudy_Blog.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
