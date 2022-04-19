import java.util.Scanner;
class Multiple
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter Number for Table");
      n=sc.nextInt();
      int i=1;
      while(i<=10)
        {
          System.out.println(n+ " * " + i +" =" +(n*i));
          i++;
        }
    }
  }
  