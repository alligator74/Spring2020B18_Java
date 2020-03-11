package OfficeHours.Practice_03_11_2020;

public class Practice_Variables {
     /*
        brand
        year
        price
        model
        Maximummiles
         */


    public static void main(String[] args) {

        String brand = "Toyota";
        short year = 2020;
        float price = 30000.25f;
        String model = "Camry";
        long maximumMiles = 1000000;

        System.out.println( brand );
        System.out.println( "brand" );
                // variables that are decleared ina block, must be initialized before use

     /*
     output:
        The vehicle 2020 BMW X6, has 32767 miles, price is 50000.5 USD
      */

    System.out.println("The vehicle " + year + " "+brand+" "+model+", has "+maximumMiles
                + " miles, price is " +price + " USD" );



      /*
      addition vs concatenation:
        System.out.println( 9 + 10); // 19, addition: both left and right side of the + vaules are numbers
        System.out.println( "9" + "10"); //910
        System.out.println( "9" + 10 ); //910
    */



    }

}
