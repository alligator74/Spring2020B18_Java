package day03_VariablesContinue;

public class SalaryCalculator {

 /*
  warmup task:
    Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
    ex:
            if:
                rate = 55;
                stateTaxRate = 0.04;
                federalTaxRate =0.22;
                weeklyHours = 40;

    */


    public static void main(String[] args) {
        // DataType  varaibleName = Data ;

       double hourlyRate = 65;
       double stateTaxRate = 0.04;
       double federalTaxRate = 0.22;
       byte weeklyHours = 45;
       byte totalWeeks = 48;

       // salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks ;
                    //salary before tax

        // sateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        // totalTax = stateTax +federalTax
        double totalTax = stateTax + federalTax;

        //salaryAfterTax = salary - stateTax -federalTax ;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your Salary is: $" + salary );  // concatenation
        System.out.println("State Tax is: $" + stateTax );  // concatenation
        System.out.println("Federal Tax is: $"+ federalTax);
        System.out.println("Total Tax is: $" +  totalTax  );
        System.out.println("Salary After Tax is: $"+ salaryAfterTax );

     /*
        System.out.println( "9" + 3 );  // 93, concatenation
        System.out.println( 9 + "3" ); // 93, concatenation
        System.out.println( 9 + 3 ); // 12, addition
    */

    }

}
