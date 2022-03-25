import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class StateCensusAnalyser1 {
	private final String CSV_PATH = "C:\\Users\\SHREEKANT\\Desktop\\JavaPracticeProblems\\Census_Analyser_Problem\\CensusAnalyserProblem-Day29\\src\\main\\resources\\IndiaStateCensusData.csv";

	public static void main(String[] args) throws IOException {

		StateCensusAnalyser1 read = new StateCensusAnalyser1();
		read.readCSVData();

	}

	/**
	 * create method readCSVData that reads the data from csv file
	 * 
	 * @throws IOException -throws exception
	 */
	public void readCSVData() throws IOException {

		/**
		 * taking try and Catch block to handle the catch exceptions
		 */
		List<StateCensusCSV1> users = new ArrayList<StateCensusCSV1>();
		String line = "";
		BufferedReader reader = new BufferedReader(new FileReader(CSV_PATH));
		reader.readLine();
		int count = 0;
		while ((line = reader.readLine()) != null) {
			count += 1;
			String[] fields = line.split(",");

			if (fields.length > 0) {
				StateCensusCSV1 user = new StateCensusCSV1();
				user.setState(fields[0]);
				user.setPop(Integer.parseInt(fields[1]));
				user.setArea(Integer.parseInt(fields[2]));
				user.setDensity(Integer.parseInt(fields[3]));
				users.add(user);
			}
		}

		for (StateCensusCSV1 u : users) {
			System.out.printf("[state=%s, population=%d, area=%d, density=%d]\n", u.getState(), u.getPop(), u.getArea(),
					u.getDensity());
		}

	}
}
