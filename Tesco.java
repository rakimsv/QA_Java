class Tesco{
    public static void main(String abc[]){

        int Quantity;
        float Price,Amount;
        String Product;
        Product="Coke";
        Quantity=15;
        Price=2.25F;
        Amount=Quantity*Price;

        System.out.println("Product: "+Product);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Unit Price: "+Price);
        System.out.println("Amount: "+Amount);
        System.out.println("VAT: "+((Amount*0.2)));
        System.out.println("Net Amount: "+(Amount-(Amount*0.2)));
    }
}