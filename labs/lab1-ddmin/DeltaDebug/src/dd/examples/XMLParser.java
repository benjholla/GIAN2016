package dd.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dd.DeltaDebug;
import dd.TestHarness;

/**
 * An example use of the ddmin algorithm to minimize failing input of an XML Parser
 * 
 * @author Ben Holland
 */
public class XMLParser {

	// TODO: edit these paths to be updated for your system
	private static final String XPCMD = "~/Desktop/xmlproc/xpcmd.py";
	private static final String XML_FILE = "~/Desktop/xmlproc/demo/urls.xml";
	
	private static TestHarness<Object> harness = new TestHarness<Object>(){
		@Override
		public int run(List<Object> input) {
			int result = PASS;
			File inputFile = null;
			try {
				// TODO: write out a temp file of the test input
				
				// TODO: run parser over input
				// command: python <path to xpcmd.py> <input file>
				
				// TODO: check the python program output for the error message,
				// if test failed, set result to FAIL
			} catch (Throwable t){
				// unknown failures set result to UNRESOLVED
			} finally {
				if(inputFile != null){
					// delete the test input file
					inputFile.delete();
				}
			}
			return result;
		}
	};
	
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		String content = new Scanner(new File(XML_FILE)).useDelimiter("\\Z").next();
		
		// chunk the input string into testable units (ex: Character or String)
		LinkedList<Object> input = new LinkedList<Object>();
		// TODO: implement
		
		// minimize test input
		List<Object> minimizedInput = DeltaDebug.ddmin(input, harness);
		
		// print the minimized test input
		System.out.println(input.toString());
	}
	
}
