package GithubPackage;

import org.testng.annotations.Test;

public class DemoTest 
{
	@Test(groups = "regression")
public void regression()
{
	System.out.println("regression test case passed");
}
	@Test
public void systemttest() {
	System.out.println("systemtest passed");
}
}
