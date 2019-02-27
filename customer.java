import java.util.Scanner;

class sbi
{
  double  minimum_intrest_rate;
  double  minimum_balance;
  double  maximum_withdrawal;
  int count=0;
  Account ac[]=new Account[100];
  sbi()
   {
        minimum_balance=2000;
        maximum_withdrawal=10000;
        minimum_intrest_rate=8;
   }
    void create()
    {Scanner sc=new Scanner(System.in);
        System.out.print("Name:");
        String nm=sc.nextLine();
        System.out.print("Account Number:");
        String Ac_no=sc.next();
        ac[count]=new Account(nm,Ac_no);
        count++;
    }

    void withdraw()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Enter Ammount:");
                double am=sc.nextDouble();
                if(am<maximum_withdrawal) {
                    if (ac[i].balance - am < minimum_balance) {
                        System.out.println("Minimum Balance Required(2000)");
                    } else
                        ac[i].balance = ac[i].balance - am;
                }
                else
                    System.out.println("Maximum Withdrawal is "+maximum_withdrawal);
            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");

    }

    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
          int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Enter Ammount:");
                double am=sc.nextDouble();
                if(ac[i].balance+am>minimum_balance)
                    ac[i].balance+=am;
                else
                    System.out.println("Deposit more than "+minimum_balance);

            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");



    }

    void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Name: "+ac[i].name  +"Account Number: "+ac[i].Acc_no+"  Balance: "+ac[i].balance);

            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");


    }


}

class pnb extends sbi
{

    int count=0;
    Account ac_p[]=new Account[100];
    pnb()
    {
        minimum_balance=2200;
        maximum_withdrawal=20000;
        minimum_intrest_rate=8.6;
    }
    @Override
    void create()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        String nm=sc.next();
        System.out.println("Account Number:");
        String Ac_no=sc.next();
        ac_p[count]=new Account(nm,Ac_no);
        count++;
    }
  @Override
    void withdraw()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac_p[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Enter Ammount:");
                double am=sc.nextDouble();
                if(am<maximum_withdrawal) {
                    if (ac_p[i].balance - am < minimum_balance) {
                        System.out.println("Minimum Balance Required(2000)");
                    } else
                        ac_p[i].balance = ac_p[i].balance - am;
                }
                else
                    System.out.println("Maximum Withdrawal is "+maximum_withdrawal);
            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");

    }
@Override
    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac_p[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Enter Ammount:");
                double am=sc.nextDouble();
                if(ac_p[i].balance+am>minimum_balance)
                ac_p[i].balance+=am;
                else
                    System.out.println("Deposit more than "+minimum_balance);
            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");



    }
@Override
    void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac_p[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Name: "+ac_p[i].name  +" Account Number:"+ac_p[i].Acc_no+"  Balance: "+ac_p[i].balance);

            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");


    }


}

class kotak extends sbi
{

    int count=0;
    Account ac_k[]=new Account[100];
    kotak()
    {
        minimum_balance=2500;
        maximum_withdrawal=25000;
        minimum_intrest_rate=9;
    }
    @Override
    void create()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        String nm=sc.nextLine();
        System.out.println("Account Number:");
        String Ac_no=sc.next();
        ac_k[count]=new Account(nm,Ac_no);
        count++;
    }
@Override
    void withdraw()
    {Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac_k[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Enter Ammount:");
                double am=sc.nextDouble();
                if(am<maximum_withdrawal) {
                    if (ac_k[i].balance - am < minimum_balance) {
                        System.out.println("Minimum Balance Required(2000)");
                    } else
                        ac_k[i].balance = ac_k[i].balance - am;
                }
                else
                    System.out.println("Maximum Withdrawal is "+maximum_withdrawal);
            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");

    }
@Override
    void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac_k[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Enter Ammount:");
                double am=sc.nextDouble();
                if(ac_k[i].balance+am>minimum_balance)
                    ac_k[i].balance+=am;
                else
                    System.out.println("Deposit more than "+minimum_balance);

            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");



    }
@Override
    void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Account Number");
        String Ac_no=sc.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(ac_k[i].Acc_no.equals(Ac_no))
            {
                flag=1;
                System.out.println("Name: "+ac_k[i].name +"Account Number:"+ac_k[i].Acc_no+"  Balance: "+ac_k[i].balance);

            }

        }

        if(flag==0)
            System.out.println("Account Does not exist");


    }


}



class Account
{
    String name;
    double balance;
    String Acc_no;

    Account(String nm,String Ac_no)
    {
        name=nm;
        Acc_no=Ac_no;
        balance=0;
    }

}


public class customer {


    public static void main(String[] args) {
 int ch;
 sbi s = new sbi();
 pnb p = new pnb();
 kotak k = new kotak();

        while(true) {

     System.out.println("1.SBI 2.PNB 3.ICICI 4.Exit ");
     Scanner sc = new Scanner(System.in);

     ch = sc.nextInt();

     switch (ch) {
         case 1:

             int flag=0;
             while (true) {
                  if(flag==1)
                      break;
                 System.out.println("1.Create Account 2.Withdraw 3.Deposit 4.Account Details 5.Exit ");

                 ch = sc.nextInt();
                 switch (ch) {
                     case 1:
                         s.create();
                         break;
                     case 2:
                         s.withdraw();
                         break;
                     case 3:
                         s.deposit();
                         break;
                     case 4:
                         s.details();
                         break;
                     case 5:flag=1;
                     break ;
                 }

             }
           break;

         case 2:

             flag=0;
             while (true) {
                 if(flag==1)break;
                 System.out.println("1.Create Account 2.Withdraw 3.Deposit 4.Account Details 5.Exit ");

                 ch = sc.nextInt();
                 switch (ch) {
                     case 1:
                         p.create();
                         break;
                     case 2:
                         p.withdraw();
                         break;
                     case 3:
                         p.deposit();
                         break;
                     case 4:
                         p.details();
                         break;
                     case 5:flag=1;break;
                 }

             }

  break;
         case 3:
             flag=0;
             while (true) {
                 if(flag==1)break;
                 System.out.println("1.Create Account 2.Withdraw 3.Deposit 4.Account Details 5.Exit ");
                 ch = sc.nextInt();
                 switch (ch) {
                     case 1:
                         k.create();
                         break;
                     case 2:
                         k.withdraw();
                         break;
                     case 3:
                         k.deposit();
                         break;
                     case 4:
                         k.details();
                         break;
                     case 5:flag=1;break;
                 }

             }
            break;
         case 4:
             System.exit(0);

     }
       }
      }
   }



