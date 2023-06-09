package com.gdu.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdu.staff.domain.StaffDTO;
import com.gdu.staff.service.StaffService;

@Controller
public class StaffController {

	@Autowired
	private StaffService staffService;
	
	@ResponseBody
	@GetMapping(value="/list.json", produces="application/json")
	public List<StaffDTO> list() {
		return staffService.getStaffList();
	}
	
	@PostMapping(value="/add.do", produces="text/plain; charset=UTF-8")
	public ResponseEntity<String> add(StaffDTO staff) {
		return staffService.addStaff(staff);
	}
	
	@ResponseBody
	@GetMapping(value="/query.json", produces="application/json")
	public StaffDTO query(String query) {
		return staffService.findStaff(query);
	}
	
}
