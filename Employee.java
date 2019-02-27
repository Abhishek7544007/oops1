public class Employee {
    String name,designation;
    double salary;
}
class Manager extends Employee
{
    String department;

    public Manager(String name,String department,double salary) {
        this.department = department;
        this.name=name;
        this.salary=salary;
    }

    void print()
    {

        System.out.println("Manager Name:"+name+"\n"+"Department:"+department+"\n"+"Salary:"+salary);
    }
    


}

class Executive extends Manager

 {
     Executive(String name,String department,double salary)
     {

         super(name,department,salary);


     }
     @Override
     void print()
     {
         System.out.println("Executive ");
         System.out.println("Manager Name:"+super.name+"\n"+"Department:"+super.department+"\n"+"Salary:"+super.salary);

     }

     public static void main(String[] args) {

         Executive obj=new Executive("Abhsihek","IT",10000);
         obj.print();
         Manager obj1=new Executive("Abhi","Finance",100000);
         obj1.print();


     }

 }