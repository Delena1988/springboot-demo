package cn.joinhealth.controller;

import cn.joinhealth.kafka.ProducerCallBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * KafkaController
 *
 * @author jlin
 * @date 2018/12/4 20:16
 */
@Controller
@RequestMapping("/kafka")
public class KafkaController {
	@Autowired
	private KafkaTemplate kafkaTemplate;

	@GetMapping("/send")
	@ResponseBody
	public String send(@RequestParam String msg) {
		ListenableFuture<SendResult<String, String>> futureCallback = kafkaTemplate.send("mytopic", msg);
		futureCallback.addCallback(new ProducerCallBack(msg));
		return msg;
	}


}
