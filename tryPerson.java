// Cate Z
public class tryPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add person
		person p1 = new person ("Bob", "410 Harvard Lane", "267-857-8304","bob12@gmail.com");
		
		// add employee
		employee e1 = new employee ("Jim", "29 Stanford Place", "610-364-3749","jimbo183@gmail.com","Department of Defense", 73000, "2/26/04");
		
		// add student
		student s1 = new student("Gianna", "287 Columbia Drive", "284-485-2948","giannalovespuppies@gmail.com", "Senior");
		
		// add faculty
		faculty f1 = new faculty("Helen", "4783 Penn Road", "234-124-4670","helenisawesome@gmail.com","Computer Science Admissions", 24000, "1/9/02", "11am-8pm", "Senior Officer");
		
		// add staff
		Staff staff1 = new Staff("Miranda", "14 Princeton Circle", "423-783-9274","miranda183@gmail.com","Secratary of President", 100000, "09/30/98", "Secratary");
		
		// to string for person
		System.out.println(p1.toString());
		
		// to string for employee
		System.out.println(e1.toString());
		
		// to string for student
		System.out.println(s1.toString());
		
		// to string for faculty
		System.out.println(f1.toString());
		
		// to string for staff
		System.out.println(staff1.toString());
		
		// print number of people
		System.out.println("There are "+person.getNumberOfPeople() + " people here.");
	}

}
