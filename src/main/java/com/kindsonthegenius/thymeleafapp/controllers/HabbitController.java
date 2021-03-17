package com.kindsonthegenius.thymeleafapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.thymeleafapp.models.Jsons;
import com.kindsonthegenius.thymeleafapp.models.LfcContinue;
import com.kindsonthegenius.thymeleafapp.models.Student;
import com.kindsonthegenius.thymeleafapp.models.VigSaveSubmit;
import com.kindsonthegenius.thymeleafapp.services.StudentService;




@Controller
@RequestMapping("/hab")
public class HabbitController {
	
	
	@RequestMapping("/dash")
	public String dash() {
		return "dash";
	}
	
	@RequestMapping("/home")
	public String test() {
		return "index";
	}
	
	@RequestMapping(value="/getTodayList")
	@ResponseBody
	public String getAdvTypeList() {
		return new Jsons().advtypelist();
	}
	
	
}
