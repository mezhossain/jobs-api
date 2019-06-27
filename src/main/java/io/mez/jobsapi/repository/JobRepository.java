package io.mez.jobsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.mez.jobsapi.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {}
