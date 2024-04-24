package com.ForHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	@Before
	public void launchSite()
	{
		System.out.println("Launching the site");
	}
	@After
	public void closeSite()
	{
		System.out.println("Closing the Site");
	}
}
