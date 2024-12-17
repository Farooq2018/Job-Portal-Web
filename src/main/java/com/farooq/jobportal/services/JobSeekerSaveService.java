package com.farooq.jobportal.services;

import com.farooq.jobportal.entity.JobPostActivity;
import com.farooq.jobportal.entity.JobSeekerProfile;
import com.farooq.jobportal.entity.JobSeekerSave;
import com.farooq.jobportal.repository.JobSeekerSaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJobs(JobSeekerProfile userAccountId) {
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getCandidatesJobs(JobPostActivity job) {
        return jobSeekerSaveRepository.findByJob(job);
    }


    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepository.save(jobSeekerSave);
    }
}
