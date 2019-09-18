import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {
		
		House [] houses = new House [3];
		int x;
		
		for(x=0;x<3;x++) {
			House house = new House();
			Photo image = new Photo();
			
			String hID = JOptionPane.showInputDialog("Enter the ID number of the house: ");
			int hid = Integer.parseInt(hID);
			house.setId(hid);
			
			String hP = JOptionPane.showInputDialog("Enter the price of the house: ");
			float hp = Float.parseFloat(hP);
			house.setPrice(hp);
			
			String loc = JOptionPane.showInputDialog("Enter the location of the house: ");
			house.setLocation(loc);
			
			String adv = JOptionPane.showInputDialog("Enter the advertiser of the house: ");
			house.setAdvertiser(adv);

			String URL = JOptionPane.showInputDialog("Enter the url of the house: ");
			image.setUrl(URL);
			
			String type = JOptionPane.showInputDialog("Enter the type of image (png,jpg,etc)");
			image.setType(type);
			
			house.setImage(image);
			
			houses[x] = house;
		
		}
		
		for(House Houses : houses) {
			System.out.println(Houses);
			Houses.StoreHouse(Houses);
		}
		
		

	}

}
