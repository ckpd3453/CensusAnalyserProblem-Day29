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
public class CensusAnalyserTest {
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\SHREEKANT\\Desktop\\JavaPracticeProblems\\Census_Analyser_Problem\\CensusAnalyserProblem-Day29\\src\\main\\resources\\IndiaStateCensusData.csv";
   

    /**
	 * method created for given Census CSV File returns correct number of entries
	 * otherwise throws exception....
	 * 
	 * @throws IOException
	 */
    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() throws IOException {
       
            List<StateCensusCSV> users = new ArrayList<StateCensusCSV>();
    		String line = "";
    		BufferedReader reader = new BufferedReader(new FileReader(INDIA_CENSUS_CSV_FILE_PATH));
    		reader.readLine();
    		int count = 0;
    		while ((line = reader.readLine()) != null) {
    			count += 1;
    		}
            Assert.assertEquals(29,count);
       }
}
