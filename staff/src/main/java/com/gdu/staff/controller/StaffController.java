package com.gdu.staff.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdu.staff.domain.StaffDTO;
import com.gdu.staff.service.StaffService;

@Controller
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	//@ResponseBody
	//@GetMapping(value="/list.json", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<StaffDTO> list1() {
		return staffService.getStaffList1();
	}
	@GetMapping("/list.json")
	public ResponseEntity<List<StaffDTO>> list2() {
		return staffService.getStaffList2();
		
	}
	
	@ResponseBody
	@PostMapping(value="/add.do", produces="text/plain; charset=UTF-8")
	public String add1(HttpServletRequest request) {
		return staffService.addStaff1(request);
	}
	
	//@PostMapping("/add.do")
	public ResponseEntity<String> add2(StaffDTO staffDTO) {
		return staffService.addStaff2(staffDTO);
	}
	@ResponseBody
	@GetMapping(value="/search.do", produces="text/plain; charset=UTF-8")
	public String search(HttpServletRequest request, Model model) {
		return staffService.searchStaff(request, model);
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam("dept") String dept, Model model) {
	    if(!dept.matches("^[가-힣]{3,5}$")) {
	        model.addAttribute("error", "부서는 3~5자리 한글로 입력해주세요.");
	        return "error";
	    }
	    return "search_result";
	}


}
