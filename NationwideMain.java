class NationwideMain{
    public static void main(String xyz[]){
        NationwideAccounts Ref = new NationwideAccounts();
        try{
            Ref.NetSalary(2000,2);
        }
        catch(AbsenteesException x){
            System.out.println("Too many absences.");
        }
    }
}