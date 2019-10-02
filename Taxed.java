class Taxed{
    public static void main(String xyz[]){
        String name;
        int salary;
        float tax=0F;

        name="Peter";
        salary=2000;
        float net=salary-tax;

        if(salary>1500){
            tax=salary*0.21f;
            System.out.println(salary);
            System.out.println(tax);
            System.out.println(net);
        }
        else{
            System.out.println("No Tax");
        }
    }
}