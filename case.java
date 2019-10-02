class Case{
    public void days(int a){
        switch(a){
            case 1:
            case 3:
            case 5: System.out.println("We finish at 4");break;
            case 2:
            case 4: System.out.println("We finish at 5");break;
            default: System.out.println("Invalid day");
        }
    }
}