package com.gdu.prd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gdu.prd.domain.ProductDTO;
import com.gdu.prd.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/list.do")
	public String list(Model model) {		// model은 jsp로 forward할 때 쓴다.
		productService.loadProductList(model);
		return "product/list";	// forward
	}
	@PostMapping("/add.do")
	public String add(ProductDTO productDTO, RedirectAttributes redirectAttributes) {
		int addResult = productService.addProduct(productDTO);
		redirectAttributes.addFlashAttribute("addResult", addResult);
		return "redirect:/product/list.do";
	}
	
	@GetMapping("/detail.do")
	public String detail(@RequestParam(value="prodNo", required=false, defaultValue="0") int prodNo, Model model) {
		productService.loadProduct(prodNo, model);
		return "product/detail";
	}
	
	@PostMapping("/edit.do")
	public String edit(ProductDTO product) {	// 객체(DTO)로 받으면 자동으로 forward된다.
		return "product/edit";
	}
	
	

	
}
