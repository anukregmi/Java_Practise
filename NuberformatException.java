class NuberformatException
  {
    public static void main(String args[])
    {
      String str="Hi";
      int x=Integer.parseInt(str);
      try 
      {
        System.out.println(x);
      }
     catch(Exception e)
        {
          System.out.println(e);
        }
          System.out.println("Exception handeled");
    }
  }

