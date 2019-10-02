class Results3{
    int phy,che,mat;
    float total,per;

    private void doCalculations(){
        total=phy+che+mat;
        per=total*100/450;
    }
    public void ShowResults(){
        doCalculations();
        System.out.println("Total Marks:"+total);
        System.out.println("Percentage:"+per);
    }
}