package com.psl.jenkinscore;

import org.testng.annotations.BeforeClass;

public class BaseClass {


	@BeforeClass(alwaysRun = true)
	public void initializeData(){
		System.out.println("I am inside base initialize class!!!");
	}	
	
	@BeforeClass()
	public void cleanupData(){
		System.out.println("I am inside base cleanup class!!");
	}		
	
}
