import java.util.*;
class Student
  {
    int rollno;
    String name;
    Student(int rollno,String name)
    {
      this.rollno=rollno;
      this.name=name;
    }
  }
class Book
  {
    public static void main(String args[])
    {
      ArrayList<Student>al=new ArrayList<Student>();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student details:");
      for(int i=0;i<5;i++)
        {
          al.add(new Student(sc.nextInt(),sc.next()));
        }
      for(Student s:al)
            {
              System.out.println(s.rollno+" "+s.name);
            }
    }
  }
