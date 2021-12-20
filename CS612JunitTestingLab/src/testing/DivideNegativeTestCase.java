package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideNegativeTestCase {

	@Test
	void test() {
		JunitTesting Negativetest =new JunitTesting();
		double output1= Negativetest.divide(36, 6);
		assertEquals(6, output1);
	}

}
