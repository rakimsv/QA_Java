class College{
    private int phy,che,mat,invalid,failed;
    public void Physics(int a){
        if(a>=0 & a<=150){
            phy=a;
            if(a<60 & a<=150){
                failed=failed+1;
            }
        }
        else{
            System.out.println("Not a valid Physics mark.");
            invalid=1;
        }
    }
    public void Chemistry(int a){
        if(a>=0 & a<=150){
            che=a;
            if(a<60 & a<=150){
                failed=failed+1;
            }
        }
        else{
            System.out.println("Not a valid Chemistry mark.");
            invalid=1;
        }
    }
    public void Maths(int a){
        if(a>=0 & a<=150){
            mat=a;
            if(a<60 & a<=150){
                failed=failed+1;
            }
        }
        else{
            System.out.println("Not a valid Maths mark.");
            invalid=1;
        }
    }
    public void ShowResults(){
        int total=0;
        float per=0;
        if(invalid==0){
            total=phy+che+mat;
                if(failed==0){
                    System.out.println("You have passed the exam.");
                }
                if(failed==1){
                    System.out.println("Retake the exam.");
                }
                if(failed==2){
                    System.out.println("Repeat the course.");
                }
                if(failed==3){
                    System.out.println("Go home.");
                }
                    System.out.println("Total: "+total);
        }
        else{
            System.out.println("Can't calculate the result.");
        }
    }
}