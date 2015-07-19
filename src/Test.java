import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
    
	private static Scanner i;

	public static void showMenu(){
		System.out.println("");
	    System.out.println("0. Quit");
		System.out.println("1. Add Student");
		System.out.println("2. Add Instructors");
		System.out.println("3. Remove Student");
		System.out.println("4. Remove Instructors");
		System.out.println("5. List Student");
		System.out.println("6. List Instructors");
		System.out.println("7. List all University People");
		System.out.println("");
		System.out.println("Please enter your choice :");
	}
	
	public static void main(String[] args) {

		ArrayList<Human> myArr = new ArrayList<Human>();
		Scanner scan = new Scanner(System.in);
		
		while(true){
			showMenu();
			int choice;
			i = new Scanner(System.in);
			choice = i.nextInt();
			
			switch(choice){	
			
		   case 0 :
				System.out.println("Do you want to exit ? (Y/N)");
				String ex = scan.nextLine();
				if (ex.equals("Y") || ex.equals("y"))
				{
					i.close();
					scan.close();
					System.exit(0);
				}
				break;    
			    
		   case 1 :
			    System.out.println("Please enter the student name :");
				String a = scan.nextLine();
				System.out.println("Please enter the student age :");
				String b = scan.nextLine();
				System.out.println("Please enter the student city :");
				String c = scan.nextLine();
				System.out.println("Please enter the student id :");
				String d = scan.nextLine();
				System.out.println("Please enter the courses grades :");
				String e = scan.nextLine();
				Double doubleE = Double.valueOf(e);
				Student y = new Student(a,b,c,d,doubleE);
				myArr.add(y);
				System.out.println("Student added successfully.");
			    break;
			    
		   case 2 :
				System.out.println("Please enter the instructor name :");
				String aa = scan.nextLine();
				System.out.println("Please enter the instructor age :");
				String bb = scan.nextLine();
				System.out.println("Please enter the instructor city :");
				String cc = scan.nextLine();
				System.out.println("Please enter the instructor courses :");
				String dd = scan.nextLine();
				System.out.println("Please enter the salary :");
				String ee = scan.nextLine();
				Double doubleEE = Double.valueOf(ee);
				Instructor x = new Instructor(aa,bb,cc,dd,doubleEE);
				myArr.add(x);
				System.out.println("Instructor added successfully.");
				break;
			    
		  case 3 :
				System.out.println("Please enter the student id :");
				String searchString = scan.nextLine();
				for( Iterator<Human> it = myArr.iterator() ; it.hasNext();)
				{
					Student z = (Student) it.next();
					if((z.getId().equals(searchString)))
					{
						if(z instanceof Student)
						{
							it.remove();
							System.out.println("Student removed successfully.");
							break;
						}
				}
				}
				break;
				
		   case 4 :
		        System.out.println("Please enter the instructors name :");
				String searchStringI = scan.nextLine();
				for( Iterator<Human> it = myArr.iterator() ; it.hasNext();)
				{
					Human zz = (Human) it.next();
					if(zz.getName().equals(searchStringI))
					{
						if(zz instanceof Instructor)
						{
							it.remove();
							System.out.println("Instructor removed successfully.");
							break;
						}
				}
				}
				break;
			    
		   case 5 :  
				System.out.println("");
				System.out.println("**List of Students**");	
				for(Human q : myArr) {
					if (q instanceof Student) {
		             System.out.println(q);
					}
		        }
 			    break;
			    
		   case 6 :  
				System.out.println("");
				System.out.println("**List of Instructors**");	
				for(Human qq : myArr) {
					if (qq instanceof Instructor) {
		             System.out.println(qq);
					}
		        }
			    break;
			    
		   case 7 :
		        System.out.println("");
				System.out.println("**List of All University People**");	
				for(Human qqq : myArr) {
		            System.out.println(qqq);
		        }
			    break;
	}
			    if (choice != 0) continue;
		}
	}
}
