import java.util.Scanner;

public class product
{
    private String Itemname;
    private float unitPrice;

    public product(String itemname, float unitPrice) {
        Itemname = itemname;
        this.unitPrice = unitPrice;
    }

    public product() {
        Itemname="no name";
        unitPrice=0;
    }

    public String toString() {
        return String.format("%s@%s/-", Itemname, unitPrice);
    }

    public float getPrice() {
        return unitPrice;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        product p[]=new product[100];
        int count =0;

        while(true)
        {
            System.out.println("1.counted Product 2.Weighted Product 3.exit");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Item Name Unitprice Quantity ");
                    p[count]=new CountedProduct(sc.next(),sc.nextFloat(),sc.nextInt());
                    System.out.println(p[count].toString());
                    count++;
                    break;
                case 2:
                    System.out.println("Item Name Unitprice Weight ");
                    p[count]=new weightedProduct(sc.next(),sc.nextFloat(),sc.nextFloat());
                    System.out.println(p[count].toString());
                    count++;

                    break;
                case 3:System.exit(0);

            }
        }




    }
}
class weightedProduct extends  product
{
    private float weight;

    public weightedProduct(String itemname, float unitPrice, float weight) {
        super(itemname, unitPrice);
        this.weight = weight;
    }

    @Override
    public float getPrice()
    {
        return  weight*super.getPrice();
    }


    @Override
    public String toString() {
        return String.format("%s %s kg $%s/- ",super.toString(),weight ,getPrice());
    }



}
class CountedProduct extends  product
{
    private int quantity;

    public CountedProduct(String itemname, float unitPrice, int quantity) {
        super(itemname, unitPrice);
        this.quantity = quantity;
    }


    @Override
    public float getPrice()
    {
        return quantity*super.getPrice();
    }
     @Override
    public String toString() {
        return String.format("%s %s units  $%s/- ",super.toString(),quantity ,getPrice());
    }


}