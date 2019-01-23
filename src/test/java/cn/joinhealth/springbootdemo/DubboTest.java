package cn.joinhealth.springbootdemo;

import cn.joinhealth.hug.common.enums.HealthDeviceTypeEnum;
import cn.joinhealth.hug.model.api.health.HealthDeviceService;
import cn.joinhealth.hug.model.entity.health.HealthDeviceDto;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * DubboTest
 *
 * @author jlin
 * @date 2018/11/9 09:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class DubboTest {
	@Reference(check = false)
	private HealthDeviceService healthDeviceService;

	@Test
	public void dubboTest(){
		HealthDeviceDto healthDeviceDto = new HealthDeviceDto();
		healthDeviceDto.setType(HealthDeviceTypeEnum.BREATH.getType());
		healthDeviceDto.setDeviceCode("21111000020");
		System.out.println(JSON.toJSONString(healthDeviceService.select(healthDeviceDto)));
	}
}
