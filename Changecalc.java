class ChangeCalc{
    public static void main(String xyz[]){
        int bill;
        int paid;
        int balance;

        int fifty,twenty,tenner,fiver,twoquid,quid;

        bill=8927;
        paid=11111;
        balance=paid-bill;

        System.out.println("-------------");
        System.out.println("Bill: \u00A3"+bill);
        System.out.println("Paid: \u00A3"+paid);
        System.out.println("-------------");
        System.out.println("Change: \u00A3"+balance);
        System.out.println("-------------");

        if(balance>=50){
            fifty=balance/50;
            balance=balance%50;
            System.out.println("Fifties: "+fifty);
        }
        if(balance>=20){
            twenty=balance/20;
            balance=balance%20;
            System.out.println("Twenties: "+twenty);
        }
        if(balance>=10){
            tenner=balance/10;
            balance=balance%10;
            System.out.println("Tens: "+tenner);
        }
        if(balance>=5){
            fiver=balance/5;
            balance=balance%5;
            System.out.println("Fives: "+fiver);
        }
        if(balance>=2){
            twoquid=balance/2;
            balance=balance%2;
            System.out.println("Twos: "+twoquid);
        }
        if(balance>=1){
            quid=balance/1;
            balance=balance%1;
            System.out.println("Ones: "+quid);
        }
    }
}