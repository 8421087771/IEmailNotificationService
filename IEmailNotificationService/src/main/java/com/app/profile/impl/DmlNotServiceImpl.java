package com.app.profile.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.IService.INotificationService;

@Component
@Profile("DML")

public class DmlNotServiceImpl implements INotificationService {

	@Override
	public void notificate() {

		System.out.println("DML Profile");

	}

}
