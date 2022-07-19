package prototype;

public class PhoneDetails implements Prototype {
	    private int phoneID;
	    private String phoneversion,phoneCode,phoneModel,phoneCatogary,phoneCapacity;
	    private double phoneCost;

	   public PhoneDetails() {
		   System.out.println("Phone Details");
	        System.out.println("PhoneID" + "\t" + "PhoneVersion" + "\t\t" + "PhoneCode" + "\t\t" + "PhoneModel" + "\t\t" + "PhoneCost");
	    	
	    }
	   public PhoneDetails(int phoneID, String phoneversion, String phoneCode,String phoneCatogary,String phoneCapacity, double phoneCost, String phoneModel) {
	        this();
	        this.phoneID = phoneID;
	        this.phoneversion = phoneversion;
	        this.phoneCode = phoneCode;
	        this.phoneModel = phoneModel;
	        this.phoneCatogary = phoneCatogary;
	        this.phoneCapacity = phoneCapacity;
	        this.phoneCost = phoneCost;
	    }
	   
	   public void showRecord(){
	        System.out.println(phoneID + "\t" + phoneversion + "\t" + phoneCode + "\t" + phoneModel + "\t\t" + phoneCost);
	    }
	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new PhoneDetails(phoneID,phoneversion,phoneversion,phoneCode,phoneCatogary,phoneCost,phoneModel);
	}

}
