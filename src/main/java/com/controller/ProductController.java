package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.Entity.ProductEntity;
import com.Repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/addProduct")
	public String newProduct() {
		return "AddProduct";
	}

	@PostMapping("/saveproduct")
	public String addProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
		return "AddProduct";
	}

	@GetMapping("/listProducts")
	public String getAllProducts(ProductEntity product, Model model) {

		List<ProductEntity> products = productRepository.findAll();
		model.addAttribute("products", products);
		return "ListProducts";
	}

	@GetMapping("/deleteProduct/{productId}")
	public String deleteproduct(@PathVariable("productId") Integer productId) {
		productRepository.deleteById(productId);
		return "redirect:/listProducts";
	}

	@GetMapping("/editProduct/{productId}") // 5
	public String editProduct( Model model, @PathVariable("productId") Integer productId) {
		Optional<ProductEntity> products = productRepository.findById(productId);
		ProductEntity entity = null;
		if (products.isPresent()) {
			entity = products.get();
		}
		System.out.println(products.get());
//		model.addAttribute("products",entity);
		model.addAttribute("products", entity);
		entity.getProductId();
		entity.getProductName();
		
		return "EditProducts";
	}

	@GetMapping("/updateProduct")
	public String EditProduct(ProductEntity products) {
		productRepository.save(products);
		return "redirect:/listProducts";
	}
	
	
}
