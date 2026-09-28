public class YearlyCosts
{

    static void main()
    {
        double spring = 340.78;
        double fall = 245.34;
        double winter = 560.34;
        double summer = 670.25;
        double totalCost = 0;

        totalCost = spring + summer + fall + winter;

        IO.println("The total cost is " + totalCost);
    }

}