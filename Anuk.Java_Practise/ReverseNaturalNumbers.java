import java.util.Scanner;
class ReverseNaturalNumbers
  {
    public static void main(String args[])
    {
      int n,i=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();
      while(n>=i)
        {
          System.out.println(n);
          n--;
        }
    }
  }