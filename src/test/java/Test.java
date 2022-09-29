
import org.testng.annotations.*;

public class Test {

		
		@BeforeTest
		public static void setup() {
			System.out.println("==================Before Test==================");

		}	
		@AfterClass
		public static void extReport(){
			System.out.println("==================After Test==================");

		}
		@AfterTest
		private void test(){
			System.out.println("==================Test==================");

		}

}