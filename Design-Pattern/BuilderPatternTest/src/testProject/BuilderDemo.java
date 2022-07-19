package testProject;

public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Build House 1
////			private int noOfWorkers;
//	    private int noOfkitchen;
//	    private int noOfRooms;
//	    private int noOfPools;
//	    private int noOfHalls;
		
        Hotel hotel = new HotelBuilder().setNoOfWorkers(3).setNoOfkitchen(10).setNoOfRooms(4).setNoOfPools(2).setNoOfHalls(1).HotelBuilder();
        System.out.println(hotel);

        //Build House 2
        Hotel hotelNew = new HotelBuilder().setNoOfWorkers(2).setNoOfkitchen(8).setNoOfRooms(3).setNoOfPools(1).setNoOfHalls(1).HotelBuilder();
        System.out.println(hotelNew);


	}

}
