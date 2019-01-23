package cn.joinhealth.controller;

import cn.joinhealth.model.User;
import cn.joinhealth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserController
 *
 * @author linjian
 * @date 2018/7/27 上午11:23
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping(value = "/save")
	@ResponseBody
	public User save(@RequestBody User user) {
		log.info("save user");
		return userService.save(user);
	}

	@GetMapping(value = "/list")
	@ResponseBody
	public List<User> list() {
		log.info("list user");
		return userService.list();
	}

	@GetMapping(value = "/get/{id}")
	@ResponseBody
	public User get(@PathVariable Integer id) {
		log.info("get user: " + id);
		return userService.get(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	@ResponseBody
	public void delete(@PathVariable Integer id) {
		log.info("delete user: " + id);
		userService.delete(id);
	}

	@PutMapping(value = "/update")
	@ResponseBody
	public void update(@RequestBody User user) {
		log.info("update user");
		userService.update(user);
	}
}
