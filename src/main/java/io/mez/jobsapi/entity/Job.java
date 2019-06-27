package io.mez.jobsapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mez_jobs")
public class Job {
	int jobId;
	String title;
	String type;
	String category;
	String location;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Job() {}
	public Job(int jobId, String title, String type, String category, String location) {
		this.jobId = jobId;
		this.title = title;
		this.type = type;
		this.category = category;
		this.location = location;
	}
	
	
}
