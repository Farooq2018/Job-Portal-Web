package com.farooq.jobportal.services;

import com.farooq.jobportal.entity.JobSeekerProfile;
import com.farooq.jobportal.entity.RecruiterProfile;
import com.farooq.jobportal.entity.Users;
import com.farooq.jobportal.repository.JobSeekerProfileRepository;
import com.farooq.jobportal.repository.RecruiterProfileRepository;
import com.farooq.jobportal.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;
    private final RecruiterProfileRepository recruiterProfileRepository;
    private final JobSeekerProfileRepository jobSeekerProfileRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository, RecruiterProfileRepository recruiterProfileRepository, JobSeekerProfileRepository jobSeekerProfileRepository) {
        this.usersRepository = usersRepository;
        this.recruiterProfileRepository = recruiterProfileRepository;
        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
    }

    public Users addNew(Users users) {
        users.setActive(true);
        users.setRegistrationDate(new Date(System.currentTimeMillis()));
        Users savedUser = usersRepository.save(users);
        int userTpeId = users.getUserTypeId().getUserTypeId();
        if (userTpeId == 1){
            recruiterProfileRepository.save(new RecruiterProfile(savedUser));
        }
        else {
            jobSeekerProfileRepository.save(new JobSeekerProfile(savedUser));
        }
        return savedUser;
    }

    public Optional<Users> getUserByEmail(String email){
        return usersRepository.findByEmail(email);
    }
}
