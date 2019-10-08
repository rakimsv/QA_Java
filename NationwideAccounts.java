class NationwideAccounts{
    public void NetSalary(int salary,int absentees) throws AbsenteesException{
        float tax=0,net=0;
        if(absentees>5){
            AbsenteesException E1=new AbsenteesException();
            throw E1;
        }
        tax=salary*21/100;
        net=salary-tax;
        System.out.println("Net salary is "+net);
    }
}