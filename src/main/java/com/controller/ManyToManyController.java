package com.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.DeveloperEntity;
import com.Entity.DeveloperProjectEntity;
import com.Entity.ProjectEntity;
import com.Entity.UserEntity;
import com.Repository.DeveloperProjectRepository;
import com.Repository.DeveloperRepository;
import com.Repository.ProjectRepository;

@Controller
public class ManyToManyController {

	@Autowired
	DeveloperRepository devRepo;

	@Autowired
	ProjectRepository proRepo;

	@Autowired
	DeveloperProjectRepository devProRepo;

//1-Add Developer
	@GetMapping("/adddev")
	public String addDev() {
		return "AddDeveloper";
	}

//2- Saving Developer
	@PostMapping("/savedev")
	public String saveDeveloper(DeveloperEntity developer) {
		devRepo.save(developer);
		return "AddDeveloper";
	}

//3-Listing Developers
	@GetMapping("/listdevs")
	public String listDevelopers(DeveloperEntity devlopers, Model model) {
		List<DeveloperEntity> developers = devRepo.findAll();
		model.addAttribute("devs", developers);
		return "ListDevelopers";
	}

//4- Delete Developer
	@GetMapping("/deletedev/{devId}")
	public String deleteDeveloper(@PathVariable("devId") Integer devId) {
		devRepo.deleteById(devId);
		return "redirect:/listdevs";
	}

	@GetMapping("/editdev/{devId}")
	public String editDeveloper(@PathVariable("devId") Integer devId, Model model) {
		Optional<DeveloperEntity> developers = devRepo.findById(devId);
		DeveloperEntity developerEntity = null;
		if (developers.isPresent()) {
			developerEntity = developers.get();
		}
		model.addAttribute("devs", developerEntity);
		return "EditDevelopers";
	}

// update and save developers
	@PostMapping("/updatedev")
	public String EditDevelopers(DeveloperEntity developers) {
		devRepo.save(developers);
		System.out.println(developers.getDevName());
		return "redirect:/listdevs";
	}

//5-Add projects
	@GetMapping("/addpro")
	public String addProjects() {
		return "AddProjects";
	}

//6- Saving projects
	@PostMapping("/savepro")
	public String saveProjects(ProjectEntity project) {
		proRepo.save(project);
		return "AddDeveloper";
	}

//7-Listing projects
	@GetMapping("/listpros")
	public String listProjects(ProjectEntity projects, Model model) {
		List<ProjectEntity> project = proRepo.findAll();
		model.addAttribute("pros", project);
		return "ListProjects";
	}

//8- delete pro
	@GetMapping("/deletepro/{projectId}")
	public String deleteProject(@PathVariable("projectId") Integer projectId) {
		proRepo.deleteById(projectId);
		return "redirect:/listpros";
	}
	

	@GetMapping("/editpro/{projectId}")
	public String editProject(@PathVariable("projectId") Integer projectId, Model model) {
		Optional<ProjectEntity> projects = proRepo.findById(projectId);
		ProjectEntity projectEntity = null;
		if (projects.isPresent()) {
			projectEntity = projects.get();
		}
		model.addAttribute("pros", projectEntity);
		return "EditProjects";
	}

// update and save developers
	@PostMapping("/updatepro")
	public String UpdateProject(ProjectEntity projects) {
		proRepo.save(projects);
		System.out.println(projects.getProjectName());
		System.out.println(projects.getTechName());
		return "redirect:/listpros";
	}

	@GetMapping("/assdevpro")
	public String AllDevPro(Model model) {
		List<DeveloperEntity> developers = devRepo.findAll();
		List<ProjectEntity> projects = proRepo.findAll();
		model.addAttribute("pros", projects);
		model.addAttribute("devs", developers);
		return "AllDevPro";
	}

	@PostMapping("/saveass")
	public String AssignDevPro(DeveloperProjectEntity devPros) {
		devProRepo.save(devPros);
		return "redirect:/assdevpro";
	}
	@GetMapping("/listdevspros")
	public String listDevsPros(DeveloperProjectEntity devpros,DeveloperEntity devloperEntity,ProjectEntity projectEntity, Model model) {
		List<DeveloperProjectEntity> devpros1 = devProRepo.findAll();
		model.addAttribute("devpros", devpros1);
		
//		List<DeveloperEntity> developerEntities = devRepo.findAll();
//		model.addAttribute("devpros", developerEntities);
//		
//		List<ProjectEntity> projectEntities = proRepo.findAll();
//		model.addAttribute("devpros", projectEntities);
		
		return "ListAllDevPro";
	}
}
