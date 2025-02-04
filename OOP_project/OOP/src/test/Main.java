package test;

import Examples.MyMath;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] employess = getEmployees();
        for(String employee : employess){
            System.out.println(employee);
        }
    }

    private static String[] getEmployees(){
        String[] employees = new String[5];
        employees[0] = "John";
        employees[1] = "Olivia";
        employees[2] = "Emma";
        employees[3] = "Max";
        employees[4] = "Nick";
        return employees;
    }
}
