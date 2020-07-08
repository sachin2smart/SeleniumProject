package testng;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1 retry");
	}
	
	@Test
	public void tes2() {
		System.out.println("I am inside test 2 retry");
		int i=1/0;
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer.class)
	public void test3() {
		System.out.println("I am inside test 3 retry");
		Assert.assertTrue(0>1);
	}
}
