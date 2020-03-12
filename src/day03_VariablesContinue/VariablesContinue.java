package day03_VariablesContinue;

public class VariablesContinue {
    /*
    comparision operators:
            >: greater
            >=: greater or equal
            <: less
            <=: less or equal
            == : equal
            != : not equal
     */

    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9;  // true
        System.out.println( result3 );

        System.out.println(  true == false );

        System.out.println(  "Muhtar" == "Good Guy"); // totally false
        //                  Bad Guy == Good Guy ==> false

        System.out.println(  "Muhtar" != "Good Guy"); // true
        //                      Bd Guy != Good Guy ==. true

        boolean r1 = true != true;  // false
        System.out.println( r1 );  // false

        boolean r2  =  "Batch 17" == "Batch 18"; // false
        System.out.println( r2 );

        System.out.println("=================================================");

        char ch1 = 'A';
        System.out.println(ch1);  //A

        char ch2 = 45000;
        System.out.println(ch2);

        char ch3 = 25000;
        System.out.println(ch3);

        char ch4 = 100; // d
        System.out.println(ch4);

        char ch5 = 'D'; // 68
        System.out.println(ch5); //D

        int num1  = 'D'; // number,
        System.out.println(num1);

        char a1 = 'z';



    }

}
