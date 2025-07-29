package com.springboot.web_job_search_portal.repository;

import com.springboot.web_job_search_portal.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}
