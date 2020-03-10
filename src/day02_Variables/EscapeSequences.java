package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\t\tHello");
                // \t means a pragraph space

        System.out.println("Cybertek School");
        System.out.println("Cybertek\nSchool");
        System.out.println("\n\nMy \nName \nIs \nMuhtar ");
                // \n means new line, starts with new line

        // print: My favrite TV show is "Game of Thrones"
        System.out.println("My Favorite TV show is \"Game Of Thrones\"");
                        // \" means double quote, prints double quote to the console


        System.out.println("\\");
                // \\ prints single slash on console

        System.out.println("/");


        System.out.println("My favorite book is \'Java\' ");  // \' prints the '
        System.out.println("My favorite book is 'Java' "); // prints '


    }

}
