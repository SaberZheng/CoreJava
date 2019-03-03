package ecut.innerclass;

public class InnerClassTest3 {

	public static void main(String[] args) {
		
		// 用匿名内部类继承具体类，并重写父类中的方法
		Sinaean h = new Sinaean(){
			@Override
			public void eat(String food) {
				System.out.println( "吃" +food );
			}
		};
		
		h.eat( "粉" );
		
	}

}
