package com.songs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songs.module.UserModule;
import com.songs.repo.SongRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class SongsController {

	@Autowired
	SongRepo sr;

	@RequestMapping("index")
	public String homepage(ModelMap mm, String emailornumber, String password) {

		UserModule um = sr.login(emailornumber, emailornumber);
		if (um instanceof UserModule) {
			if (um.getPassword().equals(password)) {
				return "GanaSongs.jsp";
			}
		} else {
			mm.put("message", "Please provide valid email or number and passoword");
			return "index.jsp";
		}
		return "addUser.jsp";

	}

	@RequestMapping("addUser")
	public String addUser(UserModule u, HttpSession s) {

		sr.save(u);

		return "index.jsp";
	}

	@RequestMapping("forgotPassword")
	public String forgotPassword(ModelMap mm, String email, String number) {

		UserModule um = sr.login(number, email);
		if (um instanceof UserModule) {

			mm.put("message", "Your password is " + um.getPassword() + "\nPlease note down it will get destoryed");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return "forgotPassword.jsp";
		}
		mm.put("message", "Please provide valid email or Phnoe number");
		return "index.jsp";

	}

	@RequestMapping("delet")
	public String delet(ModelMap mm, String email, String password) {

		UserModule um = sr.login(email, email);
		if (um instanceof UserModule) {
			if (um.getPassword().equals(password)) {
				mm.put("message", um.getName() + " is deleted");

				sr.deleteById(um.getId());
			}
			return "delete.jsp";
		} else {
			mm.put("message", "Enter valid Email or number and password");
			return "delete.jsp";
		}

	}
	
	
	@RequestMapping("loginToUpdate")
	public String loginToUpdate(ModelMap mm, String number, String password) {

		UserModule umModule=sr.update(number, number);
		if (umModule instanceof UserModule) {
//			if (um.getPassword().equals(password)) {
				
				return "update.jsp";
			
		} else {
			mm.put("message", "Please provide valid email or number and passoword1");
			return "logintoupdate.jsp";
		}
//		return "index.jsp";

	}

	
	
	@RequestMapping("update")
	public String update(ModelMap mm,UserModule um,String email,String password,String number) {
		
		UserModule umModule=sr.login(number, email);
		if(umModule instanceof UserModule) {
			
				if(um.getAge()>0)
				umModule.setAge(um.getAge());
				if(um.getName()!=null)
					umModule.setName(um.getName());
				if(um.getEmail()!=null)
					umModule.setEmail(um.getEmail());
				if(um.getGender()!=null)
					umModule.setGender(um.getGender());
				if(um.getNumber()>0)
					umModule.setNumber(um.getNumber());
				if(um.getPassword()!=null)
					umModule.setPassword(um.getPassword());
				
				sr.save(umModule);
			
			mm.put("message", "Update successfull");
			return "index.jsp";
		}
		mm.put("message", "Enter valid Email or number and password");
		return "index.jsp";
	}
}

















