package singleton;

public class DManager {

private static volatile DManager dManager= new DManager();

private DManager() {
	
}
public static DManager getDmanager() {
	return dManager;
}

}
