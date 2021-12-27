package labs;

public class Lab2 {
    public static void main(String[] args) {
	//Create a Student
	Student stu1 = new Student("John", "444444444");
	stu1.enroll("Math155");
	stu1.enroll("English101");
	stu1.enroll("History211");

//	stu1.showCourse();
//	stu1.checkBalance();
	stu1.payTuition(600);
//	stu1.checkBalance();
	System.out.println(stu1.toString());
    }
}

class Student {
    // Properties
    private static int iD = 1000;
    private static String userId;
    private String name;
    private String ssn;
    private String email;
    private String courses = "";
    private static final int costOfCourse = 800;
    private int balance = 0;
    private String city;
    private String state;
    private String phone;


    public Student(String name, String snn) {
	iD++;
	this.name = name;
	this.ssn = snn;
	setUserID();
	setEmail();
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getState() {
	return state;
    }

    public void setState(String state) {
	this.state = state;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    private void setEmail() {
	email = name.toLowerCase() + "." + iD + "@sdeuniversity.com";
	System.out.println("Your email: " + email);
    }

    private void setUserID() {
	int max = 9000;
	int min = 1000;
	int randNum = (int) (Math.random() * ((max - min)));
	randNum = randNum + min;
	userId = iD + "" + randNum + ssn.substring(5);
	System.out.println("Your User Id: " + userId);
    }

    public void enroll(String course) {
	this.courses = this.courses  + " " + course;
	this.balance = this.balance + costOfCourse;
    }

    public void payTuition(int amount) {
	balance = balance - amount;
	System.out.println("Payment: $" + amount);
    }

    public void checkBalance() {
	System.out.println("Balance: $" + balance);
    }

    public void showCourse() {
	System.out.println(courses);
    }

    public String toString() {
	return "[Name: " + name + "]\n[Courses: " + courses + "]\n[Balance: $" + balance + "]";
    }
}
