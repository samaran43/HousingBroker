import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {

	SoftAssert sftAst = new SoftAssert();
	
	@Test
	public void tgg_001()
	{
	System.out.println("hard assert test---------- line 1");
		Assert.assertEquals(true, true);	
	System.out.println("hard Assert test------------- line 2");
		
	}
	
	@Test
	public void tgg_002()
	{
	System.out.println("Soft assert test---------- line 1");
		sftAst.assertEquals(true, true);	
	System.out.println("soft Assert test------------- line 2");
		
	}
	
}
