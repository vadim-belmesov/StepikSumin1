package test;

import Examples.MyMath;

public class Main {
    public static void main(String[] args) throws Exception {
        MyArrayList employess = getEmployees();
        employess.add("James");
        employess.remove("Emma");

        for(int i =0; i < employess.getSize(); i++){
            System.out.println(employess.get(i));
        }
    }

    private static MyArrayList getEmployees(){
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}
