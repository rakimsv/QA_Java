class CountbyCount{
    public static void main(String xyz[]){
        int a,b;
        a=b=1;
        while(a<=10){
            b=1;
            while(b<=a){
                System.out.print(b);
                if(b<a){
                    System.out.print(",");
                }
                b=b+1;
            }
            System.out.println(".");
            a=a+1;
        }
    }
}