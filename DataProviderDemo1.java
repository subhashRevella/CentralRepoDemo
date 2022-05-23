package DDFWDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1
{

	@Test(dataProvider="setdata")
	void funA(int a)
	{
		System.out.println(a);
	}
	@DataProvider
	public Object[][] setdata()
	{
		Object o1[][]=new Object[3][1];
		o1[0][0]=10;
		o1[1][0]=20;
		o1[2][0]=30;
		return o1;
	}
	@Test(dataProvider="setdata1")
	void funB(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	@DataProvider
	public Object[][] setdata1()
	{
		Object o1[][]=new Object[3][2];
		o1[0][0]=10;
		o1[0][1]=20;
		o1[1][0]=30;
		o1[1][1]=40;
		o1[2][0]=50;
		o1[2][1]=60;
		return o1;
	}
	
	
	
	
}
