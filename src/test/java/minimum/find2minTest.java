package minimum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class find2minTest {

	@Test
	public void Testfind1() 
	{
		//Absence of failure is success
		//fail("Not yet implemented");
		find2min fm=new find2min();
		int result=fm.find("0 1 2 3 4 5 6 7 8 9 10");
		//checking result
		assertEquals(1, result);
	}
	@Test
	public void Testfind2() 
	{
		//Absence of failure is success
		//fail("Not yet implemented");
		find2min fm=new find2min();
		int result=fm.find("8 10 5 100 4");
		//checking result
		assertEquals(5, result);
	}
	@Test
	public void Testfind3() 
	{
		//Absence of failure is success
		//fail("Not yet implemented");
		find2min fm=new find2min();
		int result=fm.find("7 8 9 1 5");
		//checking result
		assertEquals(5, result);
	}

}
