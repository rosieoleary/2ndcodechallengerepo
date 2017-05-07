package rosieOLeary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingInInformation {
public String bufferedCopy(String inFile) throws IOException {
	BufferedReader bfrIn = new BufferedReader(new FileReader(inFile));
	String line ="";
	String totalcontents="";
	
	while ((line = bfrIn.readLine())!=null){
		totalcontents += line + "\n";
	}
	return totalcontents;
	
}
}