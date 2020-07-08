package testng;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test(priority=1)
	public void one(){
		System.out.println("I am inside testNG1");
	}

	@Test(priority=2)
	public void abc(){
		System.out.println("I am inside testNG2");
	}

	@Test
	public void ade(){
		System.out.println("I am inside testNG3");
	}

}

