/*2. Create three classes as per the following specifications:
• Student: Data members are Register Number, Name, Course and Semester.
• Exam (derived from class Student): Data members are the marks scored in three subjects.
• Result (derived from class Exam): Data members are Total Marks and Grade.
Implement get_data() and display() methods using the concept of method overriding.*/

import java.util.Scanner;
class student
{
	int regno,sem;
	String name,course;

	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Regno:");
		regno=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Sem:");
		sem=sc.nextInt();
		System.out.println("Enter Course:");
		course=sc.next();
	}

	void display()
	{
		System.out.println("Reg No="+regno);
		System.out.println("Name="+name);
		System.out.println("Sem="+sem);
		System.out.println("Course="+course);
	}


}

class exam extends student
{
	int m1,m2,m3;

	void getdata()
	{
		super.getdata();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sub 1:");
		m1=sc.nextInt();
		System.out.println("Enter Sub 2:");
		m2=sc.nextInt();
		System.out.println("Enter Sub 3:");
		m3=sc.nextInt();

	}

	void display()
	{
		super.display();
		System.out.println("Sub 1:"+m1);
		System.out.println("Sub 2:"+m2);
		System.out.println("Sub 3:"+m3);

	}
}

class result extends exam
{
	double total;
	double avg;

	void calculate()
	{
		total=m1+m2+m3;
		avg = total/3;
		if(avg>=90)
			System.out.println("A+");

		else if( avg>= 75 && avg <= 89)
			System.out.println("A");

		else if(avg >= 60 && avg <= 74)
			System.out.println("B");

		else if(avg >= 40 && avg <= 59)
			System.out.println("C");

		else
			System.out.println("F");
	}

}

class coll
{
	public static void main(String[] args)
	{
		result obj=new result();
		obj.getdata();
		obj.display();
		obj.calculate();
		System.out.println("Avg:"+obj.avg);

	}
}

