package cn.joinhealth.springbootdemo;

import cn.joinhealth.model.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/**
 * GsonTest
 *
 * @author jlin
 * @date 2018/12/4 14:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GsonTest {
	@Test
	public void serializationTest() {
		User user = User.builder()
				.userId(1)
				.userName("林剑")
				.phone("15067172995")
				.password("123456")
				.build();
		Gson gson = new Gson();
		System.out.println(gson.toJson(user));
	}

	@Test
	public void deserializationTest() {
		String userStr = "{\"password\":\"123456\",\"phone\":\"15067172995\",\"userId\":1,\"userName\":\"林剑\"}";
		Gson gson = new Gson();
		User user = gson.fromJson(userStr, User.class);
	}

	@Test
	public void collectionTest() {
		Gson gson = new Gson();
		Integer[] a = {1, 2, 3, 4, 5};
		Collection<Integer> ints = Arrays.asList(a);
		// Serialization
		String json = gson.toJson(ints);  // ==> json is [1,2,3,4,5]
		System.out.println(json);
		// Deserialization
		Type collectionType = new TypeToken<Collection<Integer>>() {}.getType();
		Collection<Integer> ints2 = gson.fromJson(json, collectionType);
		System.out.println(ints);
		// ==> ints2 is same as ints
	}
}
