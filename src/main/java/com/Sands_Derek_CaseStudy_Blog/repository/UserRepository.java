package com.Sands_Derek_CaseStudy_Blog.repository;



import com.Sands_Derek_CaseStudy_Blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
