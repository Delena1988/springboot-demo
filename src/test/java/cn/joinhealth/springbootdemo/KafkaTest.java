package cn.joinhealth.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * KafkaTest
 *
 * @author jlin
 * @date 2018/12/4 20:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTest {
	@Resource
	private KafkaTemplate kafkaTemplate;

	@Test
	public void providerTest() {
		kafkaTemplate.send("myTopic", "Test Message!");
	}

}
