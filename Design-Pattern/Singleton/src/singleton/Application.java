/**
 * 
 */
package singleton;

/**
 * @author Prasadani
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DManager dManager= DManager.getDmanager();
		System.out.println(dManager);
		
		DManager dManager1= DManager.getDmanager();
		System.out.println(dManager1);
		

	}

}
