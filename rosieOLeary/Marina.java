package rosieOLeary;
import java.util.ArrayList;
public class Marina {
	
	private String name;
	private String address;
	private int numOfBoats;
	private ArrayList<Boat>BoatList=new ArrayList<Boat>();
	public Marina(String name, String address, int numOfBoats) {
		super();
		this.name = name;
		this.address = address;
		this.numOfBoats = numOfBoats;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumOfBoats() {
		return numOfBoats;
	}
	public void setNumOfBoats(int numOfBoats) {
		this.numOfBoats = numOfBoats;
	}
	public ArrayList<Boat> getBoatList() {
		return BoatList;
	}
	public void addToBoatList(Boat b){
		boolean isBoatEmpty=b.getPersonList().isEmpty();
		
		if (isBoatEmpty=true){
			System.out.println("Boat must have at least one person associated with it.");
		}
		else 
		{BoatList.add(b);}
		
	}
	
	
	
	

}