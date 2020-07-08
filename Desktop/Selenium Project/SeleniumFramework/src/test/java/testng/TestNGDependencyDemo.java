package testng;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnGroups= {"sanity.*"})
	public void test1() {
		System.out.println("I am inside test1 dependency");
	}
	
	@Test(groups= {"sanity1"})
	public void test2() {
		System.out.println("I am inside test2 dependency");
	}

	@Test(groups= {"sanity2"})
	public void test3() {
		System.out.println("I am inside test3 dependency");
	}
}
