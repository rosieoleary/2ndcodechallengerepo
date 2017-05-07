package rosieOLeary;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ReadingInInformationTest {
	
	ReadingInInformation ri = new ReadingInInformation();
	@Test
	public void testbufferedcopy() throws IOException {
		
		assertEquals(ri.bufferedCopy("Testfile.txt"),"This is a test file!");
	}
}
