import com.opencsv.bean.CsvBindByName;

public class StateCensusCSV1 {
	/**
	 * Seems that the CsvBindByName annotation always converts the column name to
	 * UpperCase based on the OpenCSV source code Specifies a binding between a
	 * column name of the CSV input and a field in a bean.
	 */
	@CsvBindByName(column = "State")
	private String state;

	@CsvBindByName(column = "Population")
	private long pop;

	@CsvBindByName(column = "AreaInSqKm")
	private int area;

	@CsvBindByName(column = "DensityPerSqKm")
	private int density;
	
	//Generating Getters/Setters

	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public long getPop() {
		return pop;
	}



	public void setPop(long pop) {
		this.pop = pop;
	}



	public int getArea() {
		return area;
	}



	public void setArea(int area) {
		this.area = area;
	}



	public int getDensity() {
		return density;
	}



	public void setDensity(int density) {
		this.density = density;
	}



	/**
	 * By overriding the toString() method of the Object class, we can return values
	 * of the object, so we don't need to write much code.
	 */
	@Override
	public String toString() {
		return "IndiaStateCensus [ State = " + state + " , Population = " + pop + " , AreaInSqKm = " + area
				+ " , density = " + density + " ]";
	}
}
