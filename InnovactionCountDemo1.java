package DDFWDemo;

import org.testng.annotations.Test;

public class InnovactionCountDemo1
{
	@Test(invocationCount=5)
	void funA()
	{
		System.out.println("done");
		
	}
}
