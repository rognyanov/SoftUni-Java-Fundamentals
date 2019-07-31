import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peopleCount = Integer.parseInt(sc.nextLine());
		int elevatorCapacity = Integer.parseInt(sc.nextLine());

		sc.close();
		
		int fullCourses = peopleCount/elevatorCapacity;
		int partialCoursePeopleCount = peopleCount%elevatorCapacity;
		
		if(partialCoursePeopleCount>0)
			fullCourses++;
		
		System.out.println(fullCourses);
	}

}
