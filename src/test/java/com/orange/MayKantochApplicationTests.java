package com.orange;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.orange.maykantoch.MayKantochApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MayKantochApplication.class)
@WebAppConfiguration
public class MayKantochApplicationTests {

	@Test
	public void contextLoads() {
	}

}
