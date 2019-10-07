class FirstException{
    public static void main(String xyz[]){
        String no1,no2;
        float result;
        no1="8";
        no2="d";
        try{
            result = (float)Integer.parseInt(no1)/Integer.parseInt(no2);
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException E){
            System.out.println("Please don't divide anything by zero.");
        }
        catch(NumberFormatException E){
            System.out.println("Only digits please.");
        }
        catch(Exception E){
            System.out.println("Something went wrong.");
        }
    }
}