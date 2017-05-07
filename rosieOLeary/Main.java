package rosieOLeary;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException{
		ReadingInInformation ri = new ReadingInInformation();
		
		//System.out.println(ri.bufferedCopy("stage_5_input.txt"));
		String MarinaInformation = ri.bufferedCopy("stage_5_input.txt").replace("Boats", "&");
		String MI2 = MarinaInformation.replace("People", "&");
		//System.out.println(ri.bufferedCopy("stage_5_input.txt"));
		
		String[] MarinaBoatPersonArray = MI2.split("&");//text file edited
		//System.out.println(MarinaBoatPersonArray[0]);
		
		String[] MarinaArray=MarinaBoatPersonArray[0].split("\n");
		//System.out.println(MarinaArray[2]);
		
		//String[] MarinaArray1=MarinaArray[0].split("\n");
		//System.out.println(MarinaArray1[1]);
		
		int boatcap1= Integer.parseInt(MarinaArray[4]);
		Marina m1 = new Marina(MarinaArray[2],MarinaArray[3],boatcap1);
		
		//String[] MarinaArray2=MarinaArray[1].split("\n");
		//System.out.println(MarinaArray1[1]);
		
		int boatcap2= Integer.parseInt(MarinaArray[8]);
		Marina m2 = new Marina(MarinaArray[6],MarinaArray[7],boatcap1);
		//System.out.print(MarinaArray[7]);
		
		String[] BoatArray=MarinaBoatPersonArray[1].split("\n");
		System.out.println(BoatArray[0]);
		
		//String[] Boat1Array=BoatArray[0].split("\n");
		//System.out.println(BoatArray[2]);
		
		float boatsize1 = Float.parseFloat(BoatArray[4]);
		Boat b1 = new Boat(BoatArray[2],BoatArray[3],boatsize1);
		
		//String[] Boat2Array=BoatArray[1].split("\n");
		
		float boatsize2 = Float.parseFloat(BoatArray[8]);
		Boat b2 = new Boat(BoatArray[6],BoatArray[7],boatsize2);
		
		//String[] Boat3Array=BoatArray[2].split("\n");
		
		float boatsize3 = Float.parseFloat(BoatArray[12]);
		Boat b3 = new Boat(BoatArray[10],BoatArray[11],boatsize3);
		
		//String[] Boat4Array=BoatArray[3].split("\n");
		
		float boatsize4 = Float.parseFloat(BoatArray[16]);
		Boat b4 = new Boat(BoatArray[14],BoatArray[15],boatsize4);
		
		String[] PersonArray=MarinaBoatPersonArray[2].split("\n");
		//System.out.println(PersonArray[2]);
		
		//String[] Person1Array=PersonArray[0].split("\n");
		
		String[] Person1NameArray = PersonArray[2].split(" ");
		Person p1 = new Person (Person1NameArray[0],Person1NameArray[1],PersonArray[3],PersonArray[4]);
		//System.out.println(Person1NameArray[0]);
		//String[] Person2Array=PersonArray[1].split("\n");
		
		String[] Person2NameArray = PersonArray[6].split(" ");
		Person p2 = new Person (Person2NameArray[0],Person2NameArray[1],PersonArray[7],PersonArray[8]);
		
		//String[] Person3Array=PersonArray[2].split("\n");
		
		String[] Person3NameArray = PersonArray[10].split(" ");
		Person p3 = new Person (Person3NameArray[0],Person3NameArray[1],PersonArray[11],PersonArray[12]);
		
		VisaInformation vi3= new VisaInformation(PersonArray[13]);
		p3.setVisainfo(vi3);
		
		//String[] Person4Array=PersonArray[3].split("\n");
		
		String[] Person4NameArray = PersonArray[15].split(" ");
		Person p4 = new Person (Person4NameArray[0],Person4NameArray[1],PersonArray[16],PersonArray[17]);
		VisaInformation vi4= new VisaInformation(PersonArray[18]);
		p4.setVisainfo(vi4);
		//String[] Person5Array=PersonArray[4].split("\n");
		
		String[] Person5NameArray = PersonArray[20].split(" ");
		Person p5 = new Person (Person5NameArray[0],Person5NameArray[1],PersonArray[21],PersonArray[22]);
		//System.out.println(PersonArray[22]);
		//String[] Person6Array=PersonArray[5].split("\n");
		//System.out.println(PersonArray[23]);
		String[] Person6NameArray = PersonArray[24].split(" ");
		Person p6 = new Person (Person6NameArray[0],Person6NameArray[1],PersonArray[25],PersonArray[26]);
		VisaInformation vi6 = new VisaInformation(PersonArray[27]);
		p6.setVisainfo(vi6);
		
		//String[] Person7Array=PersonArray[6].split("\n");
		
		String[] Person7NameArray = PersonArray[29].split(" ");
		Person p7 = new Person (Person7NameArray[0],Person7NameArray[1],PersonArray[30],PersonArray[31]);
		VisaInformation vi7 = new VisaInformation(PersonArray[32]);
		p7.setVisainfo(vi7);
		
		//String[] Person8Array=PersonArray[7].split("\n");
		
		//String[] Person8NameArray = PersonArray[34].split(" ");
		Person p8 = new Person (PersonArray[34],null,PersonArray[35],PersonArray[36]);
		
		//String[] Person9Array=PersonArray[8].split("\n");
		
		String[] Person9NameArray = PersonArray[38].split(" ");
		Person p9 = new Person (Person9NameArray[0],Person9NameArray[1],PersonArray[39],PersonArray[40]);
		//System.out.println(PersonArray[38]);
		//String[] Person10Array=PersonArray[9].split("\n");
		
		String[] Person10NameArray = PersonArray[42].split(" ");
		Person p10 = new Person (Person10NameArray[0],Person10NameArray[1],PersonArray[43],PersonArray[44]);
	
	}


}