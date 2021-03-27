package com.meijie.progress;

import com.meijie.progress.collection.list.ListDemo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProgressApplicationTests {

	@Test
	void contextLoads() {
		ListDemo listDemo = new ListDemo();
		listDemo.sortList();
	}

}
