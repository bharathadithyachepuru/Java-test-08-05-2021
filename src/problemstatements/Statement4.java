package problemstatements;

 class Students
{
	private int id;
	private String name;
	private int marks;
	private char grade;
	
	private Students()
	{
		
		
		this.id = 123;
		this.name = "Adithya";
		this.marks = 95;
		this.grade = 'A';
		
	}

	public Students(int id, String name, int marks, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
		
	}
	
	public void displayDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(grade);
	}
	public void calculateGrade()
	{
		if(marks>90)
		{
			System.out.println('A');
		}
		else if(marks>81&&marks<90)
		{
			System.out.println('B');
		}
		else if(marks>71&&marks<80)
		{
			System.out.println('C');
		}
		else if(marks>61&&marks<70)
		{
			System.out.println('D');
		}
		else if(marks<61)
		{
			System.out.println('E');
		}
	}
	
	

}

public class Statement4 {

	public static void main(String[] args) {
		
Students s1 = new Students(123, "John smith", 95, 'C');


		
		s1.calculateGrade();
		s1.displayDetails();
		
		
	}

}
