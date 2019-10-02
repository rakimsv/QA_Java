class Account{
    public void TaxCalculation(int salary){
        float tax;
        tax=salary*21/100;
        System.out.println("Your Tax is: "+tax);
    }
    public float tax(int salary){
        float t=salary*21/100;
        return t;
    }
}