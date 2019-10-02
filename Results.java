class Results{
    int phy,che,mat;
    String student;
    public void ShowResults(){
        int total;
        total=phy+che+mat;
        System.out.println(student+"'s result is: "+total);
    }
}