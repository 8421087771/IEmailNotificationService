package com.app.profile.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.IService.INotificationService;

@Component
@Profile("Dev")
// make habbit to write comment kk sirji and try to use not only one methods more than one kk sir

public class DmlNotServiceImpl implements INotificationService {

	@Override
	public void notificate() {

		System.out.println("Dev Profile");

	}

}
