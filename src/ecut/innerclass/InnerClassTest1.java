package ecut.innerclass;

public class InnerClassTest1 {

	public static void main(String[] args) {
		// 用匿名内部类实现接口，并实现接口中的方法
		USB u = new USB() {
			@Override
			public void charge() {
				System.out.println( "充电" );
			} 
		};
		
		u.charge();
		
	}

}
