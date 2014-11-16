package net.aoisoft.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.aoisoft.pojo.Shop;
import net.aoisoft.pojo.User;
import net.aoisoft.service.IUserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("shows")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping( value="{name}", method=RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {
		
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[] {"mky", "ssss"});
		return shop;
	}
}
