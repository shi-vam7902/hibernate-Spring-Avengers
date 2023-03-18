package com.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;


@Entity
@Table(name="developers")
public class DeveloperEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer devId;
	private String devName;
	
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "developerproject", 
        joinColumns = { @JoinColumn(name = "devId") }, 
        inverseJoinColumns = { @JoinColumn(name = "projectId") }
    )

   private Set<ProjectEntity> projects;
	
	
	
	public Set<ProjectEntity> getProjects() {
		return projects;
	}
	public void setProjects(Set<ProjectEntity> projects) {
		this.projects = projects;
	}
	public Integer getDevId() {
		return devId;
	}
	public void setDevId(Integer devId) {
		this.devId = devId;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	
	
}
