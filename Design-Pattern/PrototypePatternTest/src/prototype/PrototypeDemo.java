package prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {

	public static void main(String[] args) throws IOException {
		
//		 private int phoneID;
//	    private String phoneversion,phoneCode,phoneModel,phoneCatogary,phoneCapacity;
//	    private double phoneCost;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Phone Id: ");
        int phoneId = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Phone Version : ");
        String phoneVer = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Phone Code : ");
        String phoneCode = br.readLine();
        System.out.print("\n");
        
        System.out.print("Enter Phone Model : ");
        String phoneModel = br.readLine();
        System.out.print("\n");
        
        System.out.print("Enter Phone Catogary : ");
        String phoneCato = br.readLine();
        System.out.print("\n");
        
        System.out.print("Enter Phone Capacity : ");
        String phoneCapacity = br.readLine();
        System.out.print("\n");
        

        System.out.print("Enter Phone Cost : ");
        double phoneCost = Double.parseDouble(br.readLine());
        System.out.print("\n");


        PhoneDetails e1 = new PhoneDetails(phoneId,phoneVer,phoneCode,phoneModel, phoneCato, phoneCost,phoneCapacity);

        e1.showRecord();
        System.out.println("\n");
        PhoneDetails e2 = (PhoneDetails) e1.getClone();
        e2.showRecord();
    }

}
