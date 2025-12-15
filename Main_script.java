package student_app;

import java.util.Scanner;
import java.io.PrintStream;

public class Main_script {
	static Scanner usin = new Scanner(System.in);
	static PrintStream so = System.out;
	
	public static void main(String[] args) {
		//Created Variables
		String MFirst, MLast, Mgender, Mheight, Methnicity, Mreligion, MFav_food;
		String MMajor, MClass, Memail;
		int Mage, Mweight, selection, stud_sel;
		
		//Collecting information about the person and student
		so.print("Are you entering someone that is in School(0(no) or 1(yes))? ");stud_sel = usin.nextInt(); 
		so.print("Enter Name(First Last): "); MFirst = usin.next(); MLast = usin.next();
		so.print("Age: ");Mage = usin.nextInt();
		so.print("Weight: ");Mweight = usin.nextInt();
		so.print("Gender: ");Mgender = usin.next();
		so.print("Height: ");Mheight = usin.next();
		so.print("Ethnicity: ");Methnicity = usin.next();
		so.print("Religion: ");Mreligion = usin.next();
		so.print("Favorite Food: ");MFav_food = usin.next();
		
		//(First, Last, age, weight, gender, height, ethnicity, religion, Fav_Food)
		Person Person1 = new Person(MFirst, MLast, Mage, Mweight, Mgender, Mheight, 
				Methnicity, Mreligion, MFav_food);
		Student Student1 = new Student(Person1, " ", " ", " ");
		
		//Creating a Student
		if(stud_sel == 1) {
			so.println("\nAcademic information");
			so.print("Major: ");MMajor = usin.next();
			so.print("Student Email: ");Memail = usin.next();
			so.print("Adademic Year(Freshman - Senior): ");MClass = usin.next();
			//(Major, Class, Email)
			Student1.update(MMajor, MClass, Memail);
		}
		
		//Created a Selection Process
		whileLoop:
		while (true) {
			so.print("\n1. Retrieve Personal Information\n2. Retireve Academic information\n"
					+ "3. Eat Food\n4. Go to Class\n5. Apply to a School or Change Major\n"
					+ "6. Change Person\n7. Quit Program\nSeletion: "); selection = usin.nextInt();
			switch(selection) {
				case(1) : {Person1.getinfo();break;} //Retrieving Person information
				case(2) : {
					if(Student1.Major != " ") {
						Student1.getinfo();
					}
					else {so.print("\nThat person was not a student\n");}
					break;} //Retrieving Student Info
				case(3) : {Person1.eat_food();break;} //Eating food
				case(4) : {if(Student1.Major != " ") {
						Student1.go_to_class();
					}
					else {so.print("\nThat person was not a student\n");}
					break;} //Going to class if a student
				case(5): {if(Student1.Major == " ") {
					so.println("\nAcademic information");
					so.print("Major: ");MMajor = usin.next();
					so.print("Student Email: ");Memail = usin.next();
					so.print("Adademic Year(Freshman - Senior): ");MClass = usin.next();
					//(Major, Class, Email)
					Student1.update(MMajor, MClass, Memail);
					} //If the user wanted to change to student
					else {so.println("\nEnter New Major");
					so.print("Major: ");MMajor = usin.next();
					Student1.change_major(MMajor);} //If the user wanted to change majors
					break;}
				case(6) : {
				so.print("Enter Name(First Last): "); MFirst = usin.next(); MLast = usin.next();
				so.print("Age: ");Mage = usin.nextInt();
				so.print("Weight: ");Mweight = usin.nextInt();
				so.print("Gender: ");Mgender = usin.next();
				so.print("Height: ");Mheight = usin.next();
				so.print("Ethnicity: ");Methnicity = usin.next();
				so.print("Religion: ");Mreligion = usin.next();
				so.print("Favorite Food: ");MFav_food = usin.next();
				Person1.update(MFirst, MLast, Mage, Mweight, Mgender, Mheight, Methnicity, Mreligion, MFav_food);
				break;} //if user wanted to change the person
				default : {break whileLoop;} //exited loop
				}
			}
		}
		
	}

