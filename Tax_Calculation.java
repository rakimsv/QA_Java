class TaxCalculation {
    public static void main(String abc []){
        String Name;
        float Salary,Tax=0F,Net;

        Name="Peter";
        Salary=2000F

        if(Salary>=2000) Tax=Salary*0.21;
        if(Salary<2000) Tax=Salary*0.15;

        Net=Salary-Tax;

        System.out.println(Name);
        System.out.println(Tax);
        System.out.println(Net);
    }
}