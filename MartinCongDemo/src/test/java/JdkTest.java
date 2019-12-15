public class JdkTest {

	public JdkTest() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	static JdkTest test2 = new JdkTest();
	static int b = 100;
	int a = 10;
	static JdkTest test = new JdkTest();
	public static void main(String[] args) {

	}





//	@Test
//	public void ListTest(){
//		List list = Arrays.asList("1");
//		list.add("1");
//		System.out.println(list.size());
//	}

}
