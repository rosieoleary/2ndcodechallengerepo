package rosieOLeary;

import java.util.ArrayList;

public class Person {
	
	private String firstname;
	private String surname;
	private String dob;
	private String nationality;
	private VisaInformation visainfo;
	//private ArrayList<BoatRole>BoatRoles= new ArrayList<BoatRole>
	private String boatrole;
	public Person(String firstname, String surname, String dob, String nationality) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public VisaInformation getVisainfo() {
		return visainfo;
	}
	public void setVisainfo(VisaInformation visainfo) {
		this.visainfo = visainfo;
		}
	public void setBoatrole(String boatrole ){
		this.boatrole =boatrole;
		}
	public String getBoatrole(){
		return boatrole;
	}
	public void setAnotherBoatRole (String newboatrole){
		if (this.boatrole.equals("Owner")){
			if (!newboatrole.equals("Owner")){
				this.boatrole=boatrole+" and "+newboatrole;
			}
			else{System.out.println("Already allocated role");
			}
		if (this.boatrole.equals("Captain")){
			if (!newboatrole.equals("Captain")&&!newboatrole.equals("Crew")){
					this.boatrole=boatrole+" and "+newboatrole;
				}
				else{System.out.println("Already allocated role or cannot be a crewmember and a captain");
				}
		if (this.boatrole.equals("Crew")){
				if (!newboatrole.equals("Crew")&&!newboatrole.equals("Captain")){
					this.boatrole=boatrole+" and "+newboatrole;
				}
				else{System.out.println("Already allocated role or cannot be crewmember and captain");
				}
	}
}}}}
//	public void addToBoatRoles(BoatRole br){
//		for (int i=0; i<BoatRoles.size(); i++){
//			if (BoatRoles.get(i).getBoatRole().equals("Owner")&& br.getBoatRole().equals("Captain")){
//				BoatRoles.add(br);
//			}
//			else if (BoatRoles.get(i).getBoatRole().equals("Owner")&& br.getBoatRole().equals("Crew")){
//				BoatRoles.add(br);
//			}
//			else if (BoatRoles.get(i).getBoatRole().equals("Owner")&& br.getBoatRole().equals("Owner")){
//				System.out.println("Already allocated this boat role");
//				}
//			else if (BoatRoles.get(i).getBoatRole().equals("Crew")&& br.getBoatRole().equals("Owner")){
//				BoatRoles.add(br);
//			}
//			else if (BoatRoles.get(i).getBoatRole().equals("Crew")&& br.getBoatRole().equals("Crew")){
//				System.out.println("Already allocated this boat role");
//				}
//			else if (BoatRoles.get(i).getBoatRole().equals("Crew")&& br.getBoatRole().equals("Captain")){
//				System.out.println("Cannot be crew and captain");
//			}
//			else if (BoatRoles.get(i).getBoatRole().equals("Captain")&& br.getBoatRole().equals("Owner")){
//				BoatRoles.add(br);
//			}
//			else if (BoatRoles.get(i).getBoatRole().equals("Captain")&& br.getBoatRole().equals("Captain")){
//				System.out.println("Already allocated this boat role");
//				}
//			else if (BoatRoles.get(i).getBoatRole().equals("Crew")&& br.getBoatRole().equals("Captain")){
//				System.out.println("Cannot be crew and captain");
//			}
//			}
//		for ( int j=0; j<BoatRoles.size();j++){
//		System.out.println(BoatRoles.get(j).getBoatRole());
//	
//
//}