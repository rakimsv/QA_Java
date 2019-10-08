class ThisNationwide{
    public ThisNationwide(){
        this(7,9);
        System.out.println("A");
    }
    public ThisNationwide(int a){
        this();
        System.out.println("B");
    }
    public ThisNationwide(int a,int b){
        System.out.println("C");
    }
}