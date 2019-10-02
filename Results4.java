class Results4{
    private int phy,che,mat;
    public void Physics(int a){
        if(a>=0 & a<=150){
            phy=a;
        }
        else{
            System.out.println("Not a valid Physics mark.");
        }
    }
    public void Chemistry(int a){
        if(a>=0 & a<=150){
            che=a;
        }
        else{
            System.out.println("Not a valid Chemistry mark.");
        }
    }
    public void Maths(int a){
        if(a>=0 & a<=150){
            mat=a;
        }
        else{
            System.out.println("Not a valid Maths mark.");
        }
    }
}