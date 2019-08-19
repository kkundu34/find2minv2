package minimum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class find2minDAOtest {

	@Test
	public void Testfind1() 
	{
		//Absence of failure is success
		//fail("Not yet implemented");
		find2minDAO fm=new find2minDAO();
		String result=fm.updateAndFetch(2, "1 2 3 4 5 6 7");
		//checking result
		assertNotNull(result);
	}

}
