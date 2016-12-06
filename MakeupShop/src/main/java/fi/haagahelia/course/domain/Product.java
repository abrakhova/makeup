package fi.haagahelia.course.domain;

public class Product {
	
	private String name;
	private String brand;
	private String color;
	private double price;
	private String sku;
	private String image;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String brand, String color, double price, String sku, String image) {
		super();
		this.name = name;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.sku = sku;
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", color=" + color + ", price=" + price + ", sku=" + sku
				+ ", image=" + image + "]";
	}

}
