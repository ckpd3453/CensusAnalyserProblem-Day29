import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * TC1.1:- Given the States Census CSV file, Check to ensure the Number of Record matches
 */
public class CensusAnalyserTest1 {
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\SHREEKANT\\Desktop\\JavaPracticeProblems\\Census_Analyser_Problem\\CensusAnalyserProblem-Day29\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String WRONG_CSV_FILE_PATH = "C:\\Users\\SHREEKANT\\Desktop\\JavaPracticeProblems\\Census_Analyser_Problem\\CensusAnalyserProblem-Day29\\src\\main\\resources\\IndiaStateCode";

    /**
	 * method created for given Census CSV File returns correct number of entries
	 * otherwise throws exception....
	 * 
	 * @throws IOException
	 */
    
    //Correct CSV FILE Path
    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() throws IOException {
       
            List<StateCensusCSV1> users = new ArrayList<StateCensusCSV1>();
    		String line = "";
    		BufferedReader reader = new BufferedReader(new FileReader(INDIA_CENSUS_CSV_FILE_PATH));
    		reader.readLine();
    		int count = 0;
    		while ((line = reader.readLine()) != null) {
    			count += 1;
    		}
            Assert.assertEquals(29,count);
       }

    //Wrong CSV
    @Test
    public void givenIndiaCensusData_WithWrongFile_ShouldThrowException() {
    	List<StateCensusCSV1> users = new ArrayList<StateCensusCSV1>();
		String line = "";
		BufferedReader reader;
		int count1 = 0;
		try {
			reader = new BufferedReader(new FileReader(WRONG_CSV_FILE_PATH));
			reader.readLine();
			while ((line = reader.readLine()) != null) {
				count1 += 1;
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
		}
		Assert.assertEquals(29,count1);
		
    }
}
