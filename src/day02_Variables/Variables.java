package day02_Variables;

public class Variables {

    public static void main(String[] args) {
        /*
        decleare variables:
			DataType  variableName = Data;
         */

        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

       //   byte num = 2.5;   byte, short, int, long they only accept whole numbers
      //  byte num1 = 130;    exceeds the range of byte

       // short num2 = 3.5;

        short num3 = 1000;
     //   short num4 = 40000;  exceeds the range of short

        System.out.println(num3);  // 1000

        System.out.println( 12345 );  // by default compiler takes it as int primitive

        int n1 = 20000;
        int n2 =1000000000;
        System.out.println(n2);

       // long n3 = 9999999999;  // out of int' range. compiler by default takes it as int
        long n4 = 9999999999L; // forcefully telling the compiler that this is long data number, not int

        System.out.println( n4 );

       System.out.println( 9999999999999L );
        long n5 = 19;

       // int num = 7L;  larger one cannot be asisgned to smaller one

        // double > float > long > int > short > byte

        short s1 = 10;
      //  byte b1 = s1;  // short is larger than byte

        int i1 = s1;

     //   byte b2 = i1;  larger one cannot be asisgned to smaller one


    }

}
