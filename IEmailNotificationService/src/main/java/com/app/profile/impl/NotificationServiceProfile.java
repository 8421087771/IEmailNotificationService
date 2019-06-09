package com.app.profile.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.IService.INotificationService;

@Component
@Profile("default")

public class NotificationServiceProfile implements INotificationService {

	@Override
	public void notificate() {

		System.out.println("common for all");

	}

}
