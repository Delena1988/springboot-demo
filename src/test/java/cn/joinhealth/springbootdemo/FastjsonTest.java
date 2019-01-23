package cn.joinhealth.springbootdemo;

import cn.joinhealth.model.User;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FastjsonTest
 *
 * @author jlin
 * @date 2018/12/4 14:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FastjsonTest {
	@Test
	public void serializationTest() {
		User user = User.builder()
				.userId(1)
				.userName("林剑")
				.phone("15067172995")
				.password("123456")
				.build();
		System.out.println(JSON.toJSONString(user));
	}

	@Test
	public void deserializationTest() {
		String userStr = "{\"password\":\"123456\",\"phone\":\"15067172995\",\"userId\":1,\"userName\":\"林剑\"}";
		User user = JSON.parseObject(userStr, User.class);
	}


}
