import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      //gathering ints
      Scanner input = new Scanner(System.in); 
      int taxRate = input.nextInt();
      int boardNum = input.nextInt();
      double windowNum = input.nextDouble();

       Construction house = new  Construction(8, 11, taxRate);
       double total =(house.lumberCost(boardNum) + house.windowCost(windowNum));
       System.out.println(total);
       System.out.print(house.grandTotal(total));
       




    }
}
