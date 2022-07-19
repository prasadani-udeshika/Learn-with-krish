package testProject;

public class Hotel {
	    private int noOfWorkers;
	    private int noOfkitchen;
	    private int noOfRooms;
	    private int noOfPools;
	    private int noOfHalls;

	    public Hotel(int noOfWorkers, int noOfkitchen, int noOfRooms, int noOfPools, int noOfHalls) {
	        super();
	        this.noOfWorkers = noOfWorkers;
	        this.noOfkitchen = noOfkitchen;
	        this.noOfRooms = noOfRooms;
	        this.noOfPools = noOfPools;
	        this.noOfHalls = noOfHalls;
	    }

	    @Override
	    public String toString() {
	        return "Hotel{" +
	                "noOfWorks=" + noOfWorkers +
	                ", noOfkitchen=" + noOfkitchen +
	                ", noOfRooms=" + noOfRooms +
	                ", noOfPools=" + noOfPools +
	                ", noOfHalls=" + noOfHalls +
	                '}';
	    }
	

}
