class Bank{
    static int dollar;
    public void setDollar(int a){
        dollar=a;
    }
    public void amount(int B){
        System.out.println(B*dollar);
    }
}