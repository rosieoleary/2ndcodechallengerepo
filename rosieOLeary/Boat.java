package rosieOLeary;
import java.util.ArrayList;
public class Boat implements Vehicle {
	private String name;
	private String countryoforigin;
	private float size;
	public int speed;
	private ArrayList<Person>PersonList=new ArrayList<Person>();
	
	public Boat(String name, String countryoforigin, float size) {
		super();
		this.name = name;
		this.countryoforigin = countryoforigin;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryoforigin() {
		return countryoforigin;
	}
	public void setCountryoforigin(String countryoforigin) {
		this.countryoforigin = countryoforigin;
	}
	public double getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	@Override
	public int getSpeed() {
		return speed;
	}
	@Override
	public void accelerate() {//addtest
		speed= speed+1;
		
	}
	@Override
	public void deccelerate() {
		speed=speed-1;
		
	}
	//public void addMemberofCrew(Person p){
	//	if ()
	//}
	public ArrayList<Person> getPersonList(){
		return PersonList;
	}
	public void addtoPersonList(Person p){
		if (!p.getBoatrole().equals("Captain"))
				{
				PersonList.add(p);
				}
		else {
			for (int i=0; i<PersonList.size();i++){
				if(PersonList.get(i).getBoatrole().equals("Captain")){
					System.out.println("This boat already has a captain.");
				}
				else{
					PersonList.add(p);
					System.out.println(PersonList.get(i).getSurname()+PersonList.get(i).getBoatrole());
				}
				}
			}
	}
	
	

}