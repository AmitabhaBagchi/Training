import org.testng.annotations.Test;

public class priority {

	int x = 5;
	int y = 10;

	@Test(priority = 2)
	public void sub() {
		System.out.println(y - x);
	}

	@Test(priority = 3)
	public void div() {
		System.out.println(y / x);
	}

	@Test(priority = 1)
	public void add() {
		System.out.println(y + x);
	}

	@Test(priority = 1)
	public void mul() {
		System.out.println(y * x);
	}
}
