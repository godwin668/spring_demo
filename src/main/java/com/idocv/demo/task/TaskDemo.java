package com.idocv.demo.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TaskDemo {

	@Scheduled(cron = "0/30 * * * * ?")
	public void doSomething() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("hello, task is running - " + df.format(new Date()));
	}

}