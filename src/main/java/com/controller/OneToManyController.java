package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.ProductEntity;
import com.Entity.RoleEntity;
import com.Entity.UserEntity;
import com.Repository.RoleRepository;
import com.Repository.UserRepository;

@Controller
public class OneToManyController {

	@Autowired
	RoleRepository roleRepo;

	@Autowired
	UserRepository userRepo;

// adding role
	@GetMapping("/addrole")
	public String addRole() {
		return "AddRole";
	}
//saving role

	@PostMapping("/saverole")
	public String saveRole(RoleEntity entity) {
		roleRepo.save(entity);
		return "redirect:/addrole";
	}

// getting inputs from users
	@GetMapping("/signup")
	public String signUp(Model model) {
		List<RoleEntity> roles = roleRepo.findAll();
		model.addAttribute("roles", roles);

		return "NewSignup";
	}

//saving user and redirected to list 
	@PostMapping("/saveuser")
	public String saveUser(UserEntity user) {
		userRepo.save(user);
		return "redirect:/users";
	}

//listing users
	@GetMapping("/users")
	public String getAllUsers(UserEntity user, Model model) {
		List<UserEntity> users = userRepo.findAll();
		model.addAttribute("users", users);
		return "ListingUsers";
	}

//delete the user
	@GetMapping("/deleteuser/{userId}")
	public String deleteUser(@PathVariable("userId") Integer userId) {
		userRepo.deleteById(userId);
		return "redirect:/users";
	}

// edit Users
	@GetMapping("/edituser/{userId}") // 5
	public String editProduct( Model model, @PathVariable("userId") Integer userId) {
		Optional<UserEntity> u = userRepo.findById(userId);
		UserEntity ue = null;
		if (u.isPresent()) {
			ue = u.get();
		}
		
		System.out.println(ue.getUserId());
		System.out.println(ue.getEmail());
		System.out.println(ue.getPassword());
		System.out.println(ue.getLastName());
		System.out.println(ue.getUserId());
//		model.addAttribute("products",entity);
		model.addAttribute("users", ue);

		return "EditUsers";
	}
// update users
	@GetMapping("/updateuser")
	public String Edituser(UserEntity users) {
		userRepo.save(users);
		return "redirect:/listProducts";
	}
// listing Roles
	@GetMapping("/listroles")
	public String getAllProducts(RoleEntity roles, Model model) {

		List<RoleEntity> role = roleRepo.findAll();
		model.addAttribute("roles", role);
		return "ListRoles";
	}

}
