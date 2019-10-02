class Salary{
    public static void main(String xyz[]){
        Account ac=new Account();
        String name;
        int salary;
        float tax,net;
        name="James";
        salary=1000;
        net=salary-ac.tax(salary);
        System.out.println("Your gross salary is: \u00A3"+(salary));
        System.out.println("Your tax is: \u00A3"+ac.tax(salary));
        System.out.println("Your net salary is: \u00A3"+net);
    }
}