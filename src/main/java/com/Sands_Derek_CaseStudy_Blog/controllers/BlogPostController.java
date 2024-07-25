package com.Sands_Derek_CaseStudy_Blog.controllers;

import com.Sands_Derek_CaseStudy_Blog.model.BlogPost;
import com.Sands_Derek_CaseStudy_Blog.model.User;
import com.Sands_Derek_CaseStudy_Blog.service.BlogPostService;
import com.Sands_Derek_CaseStudy_Blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @Autowired
    private UserService userService;

    @GetMapping("/user/home")
    public String userHome() {
        return "user_home";
    }

    @PostMapping("/user/createPost")
    public String createUserPost(@RequestParam String title, @RequestParam String summary, Authentication authentication) {
        User user = userService.findByUsername(authentication.getName());
        BlogPost blogPost = new BlogPost();
        blogPost.setTitle(title);
        blogPost.setSummary(summary);
        blogPost.setCreatedAt(new Date());
        blogPost.setAuthor(user);
        blogPost.setCategory("All News");
        blogPostService.saveBlogPost(blogPost);
        return "redirect:/news"; // Redirect to the news page
    }

    @GetMapping("/admin/home")
    public String adminHome() {
        return "admin_home";
    }

    @PostMapping("/admin/createPost")
    public String createAdminPost(@RequestParam String title, @RequestParam String summary, Authentication authentication) {
        User admin = userService.findByUsername(authentication.getName());
        BlogPost blogPost = new BlogPost();
        blogPost.setTitle(title);
        blogPost.setSummary(summary);
        blogPost.setCreatedAt(new Date());
        blogPost.setAuthor(admin);
        blogPost.setCategory("Latest News");
        blogPostService.saveBlogPost(blogPost);
        return "redirect:/"; // Redirect to the index page
    }
}