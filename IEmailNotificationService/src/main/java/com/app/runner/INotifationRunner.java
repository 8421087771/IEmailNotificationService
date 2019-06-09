package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.IService.INotificationService;

@Component   
public class INotifationRunner implements CommandLineRunner {
@Autowired
private INotificationService service;


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		service.notificate();
	}

}
