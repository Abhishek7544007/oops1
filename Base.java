import java.util.Scanner;

public class Base {

    String name,date_of_travel,visited_place,return_date;

  void customer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Name of Passenger:");
        name=sc.nextLine();
        System.out.print("Date Of Travel(DD-MM-YYYY):");
        date_of_travel=sc.next();
        System.out.print("Visited Place:");
        visited_place=sc.next();
        System.out.print("Date of Return(DD-MM-YYYY):");
        return_date=sc.next();
    }


    void list(Base B[],int n)
    {
      for(int i=0;i<n;i++)
      {
          System.out.println("\n");
          System.out.println("Passenger "+(i+1));

          System.out.println("Name of Passenger:"+ B[i].name);

          System.out.println("Date Of Travel(DD-MM-YYYY):"+ B[i].date_of_travel);
          System.out.println("Visited Place:"+B[i].visited_place);
          System.out.println("Date of Return(DD-MM-YYYY):"+B[i].date_of_travel);
      }

    }
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    derived[] b = new derived[100];
    int i=0;
  while(true) {
      System.out.println("1.Customer Entry 2.list all Passenger 3.List all child passenger 4.exit ");
     int ch=sc.nextInt();
     switch (ch)
     {
         case 1:b[i]=new derived();b[i++].customer();;break;
         case 2:Base obj=new Base();obj.list(b,i);break;
         case 4:System.exit(0);


     }



  }


      }
}

class  derived extends Base
{
    int age;




}