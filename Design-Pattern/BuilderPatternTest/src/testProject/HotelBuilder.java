package testProject;

public class HotelBuilder {

	private int noOfWorkers;
    private int noOfkitchen;
    private int noOfRooms;
    private int noOfPools;
    private int noOfHalls;

	public HotelBuilder setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
		 return this;
	}
	
	public HotelBuilder setNoOfkitchen(int noOfkitchen) {
		this.noOfkitchen = noOfkitchen;
		 return this;
	}

	public HotelBuilder setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
		 return this;
	}

	public HotelBuilder setNoOfPools(int noOfPools) {
		this.noOfPools = noOfPools;
		 return this;
	}
	
	public HotelBuilder setNoOfHalls(int noOfHalls) {
		this.noOfHalls = noOfHalls;
		 return this;
	}
	  public Hotel HotelBuilder(){
	        return new Hotel(noOfWorkers, noOfkitchen, noOfRooms, noOfPools,noOfHalls );
	    }

	
}
