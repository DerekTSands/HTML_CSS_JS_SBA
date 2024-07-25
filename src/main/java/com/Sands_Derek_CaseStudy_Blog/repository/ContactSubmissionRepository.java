package com.Sands_Derek_CaseStudy_Blog.repository;

import com.Sands_Derek_CaseStudy_Blog.model.ContactSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactSubmissionRepository extends JpaRepository<ContactSubmission, Long> {
}