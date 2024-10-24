package newpck;

import org.testng.annotations.Test;

public class Prct extends TestCon {

		@Test
		public void test()
		{
		
		Cont ct = new Cont(6);
		int c=6;
		testRun() ;
		
		System.out.println(ct.increment());
		System.out.println(ct.decrement());
		}
		
		

		
		


}
