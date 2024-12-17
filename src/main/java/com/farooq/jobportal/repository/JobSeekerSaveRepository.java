package com.farooq.jobportal.repository;

import com.farooq.jobportal.entity.JobPostActivity;
import com.farooq.jobportal.entity.JobSeekerProfile;
import com.farooq.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);
}
