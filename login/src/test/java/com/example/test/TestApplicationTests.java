package com.example.test;

import com.example.test.bean.UserBean;
import com.example.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by babywaiting on 2020/7/2 3:43 PM.
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {
		UserBean userBean = userService.loginIn("admin","111");
		System.out.println("该用户ID为：");
		System.out.println(userBean.getId());
	}

}
