import java.util.HashMap;
public class School {
	
	// properties
	HashMap studentStore = new HashMap();
	
	
	//methods
	public boolean addStudent(Student newStudent){
		studentStore.put(newStudent.adminNo, newStudent);
		return true;
	}
	
	public boolean removeStudentWithAdminNo(String adminNo){
		if (studentStore.containsKey(adminNo)){
			studentStore.remove(adminNo);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void printStudents(){
		Student temp;
		for(Object key: studentStore.keySet()){
			temp= (Student)studentStore.get(key);
			temp.printStudentDetails();
		}
	}
}
