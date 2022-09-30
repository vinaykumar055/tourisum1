package GithubPackage;

import org.testng.annotations.Test;

public class CreateTest {
	

	@Test(groups="smoke")
	public void createnewTest() {
		System.out.println("created");
	}
	@Test
	public void update()
	{
		System.out.println("updated");
	}
	@Test
public void newupdate() {
	System.out.println("new update");
}
}
