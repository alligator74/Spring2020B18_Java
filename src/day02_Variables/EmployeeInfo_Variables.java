package day02_Variables;

public class EmployeeInfo_Variables {
    /*
     create a class called EmployeeInfo_Variables:
            print:
                companyName
                EmployeeName
                EmployeeId
                JobTitle
                Salary
                SSN
     */


    public static void main(String[] args) {
        String employeeName = "Fatih";
        String companyName = "Oracle";
        int employeeId = 9;
        String jobTitle = "SDET";
        double salary = 120000.5;
        int ssn = 123456789;

        /*
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Company Name: "+companyName );
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("Social Security number: "+ssn);
    */
        System.out.println("Employee Name: " + employeeName + "\nCompany Name: " + companyName + "\nEmployee ID: " + employeeId + "\nJob Title: " + jobTitle + "\nSalary: " + salary + "\nSSN: " + ssn);



    }



}
