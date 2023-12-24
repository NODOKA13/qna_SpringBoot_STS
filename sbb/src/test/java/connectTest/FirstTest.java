package connectTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

	@Test
	public void test1() {
		int v1 = 10;
		int v2 = 10;
		
		Assertions.assertEquals(v1, v2);
	}
}
