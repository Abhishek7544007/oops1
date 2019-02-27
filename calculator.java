public class calculator {

    public int add(int num1,int num2)
    {
        return num1+num2;

    }
    public int sub(int num1,int num2)
    {
        return num1-num2;

    }
    public int mul(int num1,int num2)
    {
        return num1*num2;

    }
    public int divide(int num1,int num2)
    {  int res=0;
        try {
           res=num1 / num2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't be divided by zero"+e);
        }
        return res;
    }


    public static void main(String[] args) {
        
    }

}
