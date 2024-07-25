package com.Sands_Derek_CaseStudy_Blog.repository;

import com.Sands_Derek_CaseStudy_Blog.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}