import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Date;

public class test    {

    public static void main(String[] args) {
        byte b = 127;

        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);
        b++;
        System.out.println(b);

        double d = .012;
        System.out.println(d + d + d);
        double s = d + d + d;
        System.out.println(s);
        String v = Double.toString(d);
        System.out.println(v);
        BigDecimal big = new BigDecimal(v);
        BigDecimal bs = big.add(big).add(big);
        System.out.println(big);
        System.out.println(bs);
        double a = -3.5555;
        long r = Math.round(a);
        System.out.println(r);
        char c = 'a';
        char c1 = '1';
        System.out.println(Character.toUpperCase(c));
        System.out.println(Character.toUpperCase(c1));
        String s1 = "hello";
        String s2 = "hello";
        if ((s1.compareTo(s2)) == 0)
            System.out.println("Matched");
        else
            System.out.println("Not Matched");

        String n1 = s1.replace('h', 'l');
        System.out.println(n1);
        System.out.println(s1);
        long l = 1_00_00_00;
        NumberFormat F = NumberFormat.getNumberInstance();
        String s3 = F.format(l);
        System.out.println(l);
        System.out.println(s3);
        StringBuilder sb = new StringBuilder("hell0")
                .append("new").append("World").append("Old World");
        System.out.println(sb);
        Date dt = new Date();
 int ar[]={1,2,3};
        System.out.println(dt);
        try {
          int store=ar[3];
        } catch (ArrayIndexOutOfBoundsException e)
        {  e.printStackTrace();

            System.out.println("Array out of bound");
        }
    }
}
