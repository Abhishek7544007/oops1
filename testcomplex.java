import java.util.Scanner;

public class testcomplex {
    float real;
    float imaginary;
    testcomplex()
    {}

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImaginary() {
        return imaginary;
    }

    public void setImaginary(float imaginary) {
        this.imaginary = imaginary;
    }

    public testcomplex(float real, float imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }


    public static testcomplex  add (testcomplex c1,testcomplex c2)
    {
        return(new testcomplex(c1.real + c2.real, c1.imaginary + c2.imaginary));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        testcomplex c1=new testcomplex();
        testcomplex c2=new testcomplex();

        System.out.println("comlex number 1:\n Real part=");
        c1.setReal(sc.nextFloat());
        System.out.println("Imaginary Part=");
        c1.setImaginary(sc.nextFloat());
        System.out.println("comlex number 2:\n Real part=");
        c2.setReal(sc.nextFloat());
        System.out.println("Imaginary Part=");
        c2.setImaginary(sc.nextFloat());
        testcomplex c3=add(c1,c2);

        System.out.println("complex Number="+c3.getReal()+"+"+c3.getImaginary()+"j");

    }

}
