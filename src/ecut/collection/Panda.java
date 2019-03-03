package ecut.collection;

// 声明 java.lang.Comparable 接口时，<T> 表示类型参数 ( "形参")
// 在 实现接口 时，<Panda> 也是类型参数 ( "实参" )
public class Panda implements Comparable<Panda>{

	private Integer id;
	private String name;

	public Panda(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo( Panda another ) {
		if( this.id != null && another.id != null ) {
			return  this.id - another.id ; // this.id  和 another.id 不能是负数
			/*
			if( this.id < another.id ){
				return -1 ;
			} else if( this.id.equals(  another.id ) ) {
				return 0 ;
			} else {
				return 1 ;
			}
			*/
		}
		return 0;
	}

	@Override
	public String toString() {
		return "(id=" + id + ", name=" + name + ")";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
