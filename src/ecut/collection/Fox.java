package ecut.collection;

public class Fox implements Comparable<Fox> {

	private Integer id ; // 对象标识符 ( Object Identifier )
	private String name ;
	
	public Fox(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Fox o) {
		if( this.id != null && o.id != null ) {
			if( this.id > o.id ){
				return 1 ;
			} else if( this.id == o.id ){
				return 0 ;
			} else {
				return -1 ;
			}
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
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
