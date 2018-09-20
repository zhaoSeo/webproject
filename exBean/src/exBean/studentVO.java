package exBean;

public class studentVO {
	private String no;
	private String name;
	//캡슐화하기위해 이 class 밖에 참조되지않도록 private 변수를 붙인다.
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//MVC의 M
}
