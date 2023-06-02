package com.gdu.app13.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class BlogServiceImpl implements BlogService {

	@Override
	public void loadBlogList(HttpServletRequest request, Model model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBlog(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> imageUpload(MultipartHttpServletRequest multipartRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int increaseHit(int blogNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void loadBlog(int blogNo, Model model) {
		// TODO Auto-generated method stub

	}

}
