package kr.co.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ecommerce.dao.table.User;
import kr.co.ecommerce.service.LoginService;

@RestController
@RequestMapping("/login/json")
public class LoginRestController {
	private final Logger log = LoggerFactory.getLogger(IndexRestController.class);

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public User getLoginInfo(HttpSession session, Model model) {
		log.info("------ getLoginInfo start");
		return loginService.getLoginState(1L);
	}

}
