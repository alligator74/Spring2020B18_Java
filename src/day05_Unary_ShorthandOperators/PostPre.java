package day05_Unary_ShorthandOperators;

public class PostPre {

    public static void main(String[] args) {
        // pre: changes the value of the varaible immediately

                int a = 100;
                System.out.println( ++ a ); //101
                System.out.println(a);  //101

                int b = 100;
                System.out.println( --b ); //99
                System.out.println(b);  //99

        // Post: first passes the current value, then eventually changes the variable' value
                int A = 100;
                System.out.println(A++); // at line 18, A' values is still 100
                System.out.println(A); //101

                int B = 100;
                System.out.println(B--); // 100
                System.out.println(B); //99


        // post & pre examples:



    }

}
