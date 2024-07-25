package com.Sands_Derek_CaseStudy_Blog.service;

import com.Sands_Derek_CaseStudy_Blog.model.ContactSubmission;
import com.Sands_Derek_CaseStudy_Blog.repository.ContactSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactSubmissionService {

    @Autowired
    private ContactSubmissionRepository contactSubmissionRepository;

    public ContactSubmission saveContactSubmission(ContactSubmission contactSubmission) {
        return contactSubmissionRepository.save(contactSubmission);
    }

    public Optional<ContactSubmission> findById(Long id) {
        return contactSubmissionRepository.findById(id);
    }

    public List<ContactSubmission> findAll() {
        return contactSubmissionRepository.findAll();
    }

    public void deleteContactSubmission(Long id) {
        contactSubmissionRepository.deleteById(id);
    }
}