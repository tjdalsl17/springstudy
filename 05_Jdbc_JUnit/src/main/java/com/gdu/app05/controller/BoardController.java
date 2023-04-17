package com.gdu.app05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gdu.app05.service.BoardService;

@RequestMapping("/")
@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;

}
