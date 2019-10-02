class ABCD{
    public static void main(String xyz[]){

        int num;
        num = 60;
        if(num>500){
            System.out.println("A");
            if(num>1000){
                System.out.println("B");
            }
            else{
                System.out.println("C");
            }
        }
        else{
            System.out.println("D");
            if(num>100){
                System.out.println("E");
            }
            else{
                System.out.println("F");
            }
        }
    }
}