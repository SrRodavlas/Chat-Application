package modelos;

enum Rank{
	USER,
	MANAGER;
};

public class User {
	private String name;
	private Rank privileges;
	
	public User(String name) {
		this.name = name;
		this.privileges = Rank.USER;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Rank getPrivileges() {
		return this.privileges;
	}
	
	public void setPrivileges(Rank privileges) {
		this.privileges = privileges;
	}
}
