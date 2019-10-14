class QAMaths{
    public static void main(String xyz[]){
        int no1,no2;
        float result = 0;
        String sign;

        try{
            no1=Integer.parseInt(xyz[0]);
            no2=Integer.parseInt(xyz[2]);
            sign=xyz[1];
            if(sign.equals("+")){
                result=no1+no2;
            }
            else if(sign.equals("-")){
                result=no1-no2;
            }
            else if(sign.equals("x")){
                result=no1*no2;
            }
            else if(sign.equals("/")){
                result=no1/no2;
            }
            System.out.println("Result: "+result);
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Please send 3 values.");
        }
        catch(ArithmeticException ae){
            System.out.println("Please do not divide by zero.");
        }
        catch(NumberFormatException nfe){
            System.out.println("Please enter numbers only.");
        }
    }
}  