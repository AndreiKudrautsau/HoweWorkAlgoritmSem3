public class Example <T>{
	private String name1;
	private Integer name2;
	Example (String name1, Integer name2){
		this.name1 = name1;
		this.name2 = name2;
	}
	public String toString(){
		return String.format("%s : %d", name1, name2);
	}

}
