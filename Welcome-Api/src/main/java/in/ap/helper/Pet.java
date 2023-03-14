package in.ap.helper;


public class Pet {
	
	private Integer id;
	private String type;
	private String price;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", type=" + type + ", price=" + price + "]";
	}
	
	

}
