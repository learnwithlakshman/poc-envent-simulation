package com.heraizen.es;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.heraizen.es.config.ServiceUtil;
import com.heraizen.es.domain.Service;

@SpringBootTest
class PocEventSimulationApplicationTests {

	@Autowired
	private ServiceUtil ServiceUtil;
	@Test
	void contextLoads() {
	}
	
	@Test
	void loadUtilData() {
			Service service = ServiceUtil.getService();
			System.out.println(service);
	}

}
