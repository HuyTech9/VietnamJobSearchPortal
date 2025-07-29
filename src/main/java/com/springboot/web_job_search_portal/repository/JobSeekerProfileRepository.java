package com.springboot.web_job_search_portal.repository;

import com.springboot.web_job_search_portal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}
