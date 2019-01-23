package cn.joinhealth.kafka;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * KafkaConsumer
 *
 * @author jlin
 * @date 2018/12/4 20:29
 */
@Component
@Slf4j
public class KafkaConsumer {

	@KafkaListener(topics = "myTopic")
	public void listen(ConsumerRecord<?, String> record) {
		String value = record.value();
		log.info(value);
		log.info(JSON.toJSONString(record));
	}
}
