class ExamResults{
    private int totalmarks;
    public ExamResults(int marks){
        totalmarks=marks;
    }
    public void ShowResults(int marksobt){
        float pct=(float) marksobt*100/totalmarks;
        if(pct>=60){
            System.out.println("You have passed.");
        }
        else{
            System.out.println("You have failed.");
        }
    }
}