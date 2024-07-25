package com.Sands_Derek_CaseStudy_Blog.config;

import com.Sands_Derek_CaseStudy_Blog.model.Role;
import com.Sands_Derek_CaseStudy_Blog.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        // Check if roles already exist
        if (roleRepository.findByName("USER") == null) {
            roleRepository.save(new Role("USER"));
        }
        if (roleRepository.findByName("ADMIN") == null) {
            roleRepository.save(new Role("ADMIN"));
        }
    }
}