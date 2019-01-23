package cn.joinhealth.springbootdemo;

import cn.joinhealth.model.User;
import cn.joinhealth.service.UserService;
import com.alibaba.fastjson.JSON;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * MybatisCacheTest
 *
 * @author jlin
 * @date 2018/12/12 14:32
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MybatisCacheTest {
	@Autowired
	@Qualifier(value = "userServiceMybatisCache")
	private UserService userService;

	@Test
	public void test001GetUser(){
		System.out.println(JSON.toJSONString(userService.get(2)));
	}

	@Test
	public void test002GetUser1(){
		System.out.println(JSON.toJSONString(userService.get(2)));
	}

	@Test
	public void test003UpdateUser(){
		User user = User.builder().userId(2).userName("user2").phone("phone2").password("password2").build();
		userService.update(user);
	}

	@Test
	public void test004GetUser2(){
		System.out.println(JSON.toJSONString(userService.get(2)));
	}
}
