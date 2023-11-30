import java.util.Scanner;
class StudentManagement
{
long Id = 100000L;
Scanner s = new Scanner(System.in);
Student studentList[ ]= new Student[5];
int count=0;
void addStudentDetails( )
{
  if(count<30)
  {
 Student st = new Student( );
System.out.println("eneter student name");
 String n = s.nextLine( );
 s.nextLine();
System.out.println("enter a Student age");
int a = s.nextInt( );
System.out.println("enter a student gender");
String g =s.nextLine( );
System.out.println("enter opted course");
String o = s.nextLine();
System.out.println("enter student qualification");
String q = s.nextLine( );
System.out.println("enter a student emailid");
String e = s.nextLine();
System.out.println("eneter a student phone number");
long p = s.nextLong( );
s.nextLine( );
st.id=Id;
st.name=n;
st.age=a;
st.gender=g;
st.optedCourse=o;
st.qualification=q;
st.emailId =e;
st.phoneNumber=p;
studentList[count]=st;
count++;
Id++;
}
else
{
	System.out.println("sorry the seats are unavaliable");
}
}
void displayStudentDetails( )
{
if(count>0){
 for(int i=0;i<count;i++)
{
studentList[i].show( );
}
}
else{
	System.out.println("there are no seats");
}




}
void menu()
{
while(true)
{
 System.out.println("press one to add student details");
System.out.println("press 2 to display student details");
System.out.println("press 9 to exit");
int choice =s.nextInt(); 
switch(choice)
{
case 1:addStudentDetails( );break;
case 2: displayStudentDetails( );break;
case 9:System.exit(0);
default:System.out.println("sorrry");
}
}
}
}
