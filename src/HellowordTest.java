import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HellowordTest {

	@Test
	void test() {
		Helloword hello = new Helloword();
	        Assertions.assertEquals(2, hello.addvalues(1, 1), "1 + 1 = 2");
		
	}

}
