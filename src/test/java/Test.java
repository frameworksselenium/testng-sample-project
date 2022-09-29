
import org.testng.Assert;
import org.testng.annotations.*;

public class Test {

		
		@BeforeTest
		public static void setup() {
			System.out.println("==================Before Test==================");
			Assert.assertEquals("r", "r");
		}	
		@AfterClass
		public static void extReport(){
			System.out.println("==================After Test==================");
			Assert.assertEquals("r", "r");
		}
		@AfterTest
		private void test(){
			System.out.println("==================Test==================");
			Assert.assertEquals("r", "tt");
		}

}