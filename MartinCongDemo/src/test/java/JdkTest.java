import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JdkTest {

	@Test
	public void ListTest(){
		List list = Arrays.asList("1");
		list.add("1");
		System.out.println(list.size());
	}

}
