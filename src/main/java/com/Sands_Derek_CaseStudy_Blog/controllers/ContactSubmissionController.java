package com.Sands_Derek_CaseStudy_Blog.controllers;

import com.Sands_Derek_CaseStudy_Blog.model.ContactSubmission;
import com.Sands_Derek_CaseStudy_Blog.service.ContactSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contact")
public class ContactSubmissionController {

    @Autowired
    private ContactSubmissionService contactSubmissionService;

    @PostMapping
    public ContactSubmission createContactSubmission(@RequestBody ContactSubmission contactSubmission) {
        return contactSubmissionService.saveContactSubmission(contactSubmission);
    }

    @GetMapping("/{id}")
    public Optional<ContactSubmission> getContactSubmissionById(@PathVariable Long id) {
        return contactSubmissionService.findById(id);
    }

    @GetMapping
    public List<ContactSubmission> getAllContactSubmissions() {
        return contactSubmissionService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteContactSubmission(@PathVariable Long id) {
        contactSubmissionService.deleteContactSubmission(id);
    }
}
