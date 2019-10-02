class AccountMO{
    public void AccountMO(){
        System.out.println("Tax Rate: "+21);
    }
    public void AccountMO(int salary){
        float t=(float)salary*21/100;
        System.out.println("Your tax is: "+t);
    }
    public void AccountMO(int sal, int rate){
        float t=(float)sal*rate/100;
        System.out.println("Your Tax is: "+t);
    }
}