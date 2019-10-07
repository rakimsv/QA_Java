class StaticBankCall{
    public static void main(String xyz[]){
        Bank hsbc,barclays,nbs;
        hsbc = new Bank();
        barclays = new Bank();
        nbs = new Bank();
        Bank.dollar=100;
        hsbc.amount(2);
        nbs.amount(3);
        barclays.setDollar(200);
        hsbc.amount(2);
        nbs.setDollar(500);
        barclays.amount(2);
    }
}