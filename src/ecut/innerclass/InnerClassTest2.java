package ecut.innerclass;

public class InnerClassTest2 {

	public static void main(String[] args) {
		
		// 用匿名内部类继承抽象类，并实现抽象方法
		Human h = new Human(){
			@Override
			public void eat(String food) {
				System.out.println( "吃" +food );
			}
		};
		
		h.eat( "粉" );
		
	}

}
