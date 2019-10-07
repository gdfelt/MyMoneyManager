package swing.api;

public enum DeductionType {
	RENT("Rent"), MED("Medical"), Food("Food"), UTIL("Utility"),
	CAR("Car"), OTHER("Other"), SAVING("Savings");

	private String type;

	private DeductionType(String type) {
		this.type = type;
	
	}

	public String getType() {
		return type;
	}
	
	
	
	
	

}