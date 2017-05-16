import java.util.HashMap;
public class TryStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student marge = new Student("Marge" , "female", 135,21);
		marge.printStudentDetails();
		
		Student Jane = new Student( "Jane", "female", 120, 13);
		
		HashMap studentStore = new HashMap();
		studentStore.put("123", Jane);
	}

}
