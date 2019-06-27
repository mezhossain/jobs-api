package io.mez.jobsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.mez.jobsapi.controller.ResourceNotFoundException;
import io.mez.jobsapi.entity.Job;
import io.mez.jobsapi.repository.JobRepository;

@Service
public class JobService {
	@Autowired
	JobRepository repo;
	
	public List<Job> listJobs(){
		return repo.findAll();
	}
	
	public Job getJob(Integer id) {
		return repo.findById(id).get();
	}
	
	public void addJob(Job job) {
		repo.save(job);
	}
	
	public Job updateJob(Job job) {
			return repo.saveAndFlush(job);
	}
	
	public void deleteJob(Integer id) {
		repo.deleteById(id);
	}
}
