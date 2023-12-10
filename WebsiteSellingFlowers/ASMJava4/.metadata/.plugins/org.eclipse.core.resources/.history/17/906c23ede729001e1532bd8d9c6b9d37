package com.poly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.service.VideoService;
import com.poly.service.impl.VideoServiceImpl;
import com.poly.entity.Video;

@WebServlet(urlPatterns = {"/index"})
public class HomeController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private VideoService videoService = new VideoServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		List<Video> videos = videoService.findAll();
		req.setAttribute("videos", videos);
		
		req.getRequestDispatcher("/views/user/index.jsp").forward(req, resp);
	}

}
