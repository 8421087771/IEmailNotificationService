package com.app.profile.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.IService.INotificationService;

@Component
@Profile("HTC")

public class HtcNotProfileService implements INotificationService {

	@Override
	public void notificate() {

		System.out.println("HTC Profile");
	}

}
