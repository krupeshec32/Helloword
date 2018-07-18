import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//this is test case of junit

class HellowordTest {

	@Test
	void test() {
		Helloword hello = new Helloword();
	        Assertions.assertEquals(2, hello.addvalues(1, 1), "1 + 1 = 2");
		
	}

}
