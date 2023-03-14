package in.ap.helper;

public class Response {
	
	private String welcome;
	private String greet;
	private  Pet pet;
	public String getWelcome() {
		return welcome;
	}
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}
	public String getGreet() {
		return greet;
	}
	public void setGreet(String greet) {
		this.greet = greet;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	@Override
	public String toString() {
		return "Response [welcome=" + welcome + ", greet=" + greet + ", pet=" + pet + "]";
	}
	
	

}
