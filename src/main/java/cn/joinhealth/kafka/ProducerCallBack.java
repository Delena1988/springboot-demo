package cn.joinhealth.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * ProducerCallBack
 *
 * @author jlin
 * @date 2018/12/5 20:21
 * @Description
 */
@Slf4j
public class ProducerCallBack implements ListenableFutureCallback<SendResult<String, String>> {
	private final String msg;

	public ProducerCallBack(String msg) {
		this.msg = msg;
	}

	@Override
	public void onFailure(Throwable throwable) {
		log.error("send kafka message error!", throwable);
	}

	@Override
	public void onSuccess(SendResult<String, String> result) {
		if (result == null) {
			return;
		}

		RecordMetadata metadata = result.getRecordMetadata();
		if (metadata != null) {
			StringBuilder record = new StringBuilder();
			record.append("message(").append(msg).append(")  ")
					.append("topic(").append(metadata.topic()).append(")  ")
					.append("send to partition(").append(metadata.partition()).append(")  ")
					.append("with offset(").append(metadata.offset()).append(")");
			log.info("record: " + record.toString());
			log.info("result: " + result.toString());
		}
	}
}
