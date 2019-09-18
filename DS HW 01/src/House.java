import java.io.FileWriter;
import java.io.IOException;

public class House extends Photo{
	private int id;
	private float price;
	private String location;
	private String advertiser;
	private Photo image;
	
	public House() {    //default constructor
		this.id = 0;
		this.price = 0.0f;
		this.location = " ";
		this.advertiser = " ";

	}

	public House(int id, float price, String location, String advertiser, Photo image) { //copy constructor
		super();
		this.id = id;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Photo getImage() {
		return image;
	}

	public void setImage(Photo image) {
		this.image = image;
	}

	
	@Override
	public String toString() {
		return "House [id=" + id + ", price=" + price + ", location=" + location + ", advertiser=" + advertiser
				+ ", image url=" + image.url + " , image type = " + image.type + "]";
	}

	public void Display() {
		System.out.println(toString());
	}
	
	public void StoreHouse(House house) {
		
		try {
			FileWriter inFile = new FileWriter("Houses.txt",true);
			
			inFile.write(house.id + " ");
			inFile.write((int) house.price + " ");
			inFile.write(house.location + " ");
			inFile.write(house.advertiser + " ");
			inFile.write(house.image.url + " ");
			inFile.write(house.image.type + " ");
			inFile.write("\n" + " "); 
			inFile.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File could not be opened");
		}
		
	}
	
	
}
