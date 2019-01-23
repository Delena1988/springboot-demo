package cn.joinhealth.springbootdemo;

import cn.joinhealth.model.User;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * RedisTest
 *
 * @author jlin
 * @date 2018/11/9 09:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
	@Autowired
	private RedisTemplate redisTemplate;
	@Test
	public void setRedis() {
		redisTemplate.opsForValue().set("name", "林剑");
		redisTemplate.opsForValue().set("sex", "男");
		User user1 = new User();
		user1.setUserId(1);
		user1.setUserName("张三");
		user1.setPassword("123");
		User user2 = new User();
		user2.setUserId(2);
		user2.setUserName("李四");
		user2.setPassword("456");
		redisTemplate.opsForHash().put("user", String.valueOf(user1.getUserId()), user1);
		redisTemplate.opsForHash().put("user", String.valueOf(user2.getUserId()), user2);
	}

	@Test
	public void getRedis() {
		System.out.println(JSON.toJSONString(redisTemplate.opsForHash().get("user", "1")));
		System.out.println(JSON.toJSONString(redisTemplate.opsForHash().get("user", "2")));
	}
}
