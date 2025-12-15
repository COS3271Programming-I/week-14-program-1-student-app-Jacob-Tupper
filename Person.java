package student_app;

import java.io.PrintStream;

public class Person{
	//Created Variables
	PrintStream so = System.out;
	protected String First, Last, gender, height, ethnicity, religion, Fav_food;
	protected int age, weight;
	
	//Create a Constructor
	public Person(	String First, String Last, int age, int weight, String gender, 
					String height, String ethnicity, String religion, String Fav_food) {
		this.First = First; this.Last = Last; this.age = age; this.gender = gender;
		this.height = height; this.ethnicity = ethnicity; this.religion = religion;
		this.Fav_food = Fav_food; this.weight = weight;
	}
	//Another constructor to fix problems
	public Person() {
		
	}
	
	//updating information
	public void update(String First, String Last, int age, int weight, String gender, 
		String height, String ethnicity, String religion, String Fav_food) {
		this.First = First; this.Last = Last; this.age = age; this.gender = gender;
		this.height = height; this.ethnicity = ethnicity; this.religion = religion;
		this.Fav_food = Fav_food; this.weight = weight;
	}
	
	//Display information
	public void getinfo() {
		so.printf("\nName: %s %s\nAge: %d\nGender: %s\nHeight: %s\nWeight: %d\n"
				+ "Ethnicity: %s\nReligion: %s\n", this.First, this.Last, this.age,
				this.gender, this.height, this.weight, this.ethnicity, this.religion);
	}
	//Eating Food
	public void eat_food() {
		so.print(this.First + " ate " + this.Fav_food);
	}
}
//Created Subclass
class Student extends Person {
	
	//Created variables
	protected String Major, Class, email, Name, Food;
	
	//Created Constructed and Sending Values to the SuperClass
	public Student(Person p, String Major, String Class, String email){
		super(p.First, p.Last, p.age, p.weight, p.gender, p.height, p.ethnicity, p.religion, p.Fav_food);
		this.Major = Major;this.Class = Class;this.email = email;
	}
	
	//updating information
	public void update(String Major, String Class, String email) {
		this.Major = Major;this.Class = Class;this.email = email;
	}
	//Have a Get info Method
	@Override
	public void getinfo() {
		so.printf("\nName: %s %s\nAge: %s\nGender: %s\nMajor: %s\nClass: %s\nEmail: %s\n", 
				this.First, this.Last, this.age, this.gender, this.Major, this.Class, this.email);
	}
	//Go to Class
	public void go_to_class() {
		so.print(First + " went to class\n");
	}
	//Changing Major
	public void change_major(String CMajor) {
		this.Major = CMajor;
	}
}