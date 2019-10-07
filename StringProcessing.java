class StringProcessing{
    public void PrintVertical(String msg){
        int i;
        for(i=0;i<msg.length();i+=1){
            System.out.println(msg.substring(i,i+1));
        }   
    }
    public void WordCount(String msg){
        int spacecount=0;
        String alpha;
        int i=0;
        for(i=0;i<msg.length();i+=1){
            alpha=msg.substring(i,i+1);
            if(alpha.equals(" ")){
                spacecount+=1;
            }
        }
       System.out.println("We have "+spacecount+1+"words.");
    }
    public void PrintVertical2(String msg){
        String word="", alpha;
        int i=0;
        for(;i<msg.length();i++){
            alpha=msg.substring(i,i+1);
            if(alpha.equals(" ")){
                System.out.println(word);
            }
            else{
                word+=alpha;
            }
        }
        System.out.println(word);
    }
    public void PrintReverse(String msg){
        String word = "", alpha;
        int i=msg.length();
        for(i=msg.length()-1;i>=0;i--){
            alpha=msg.substring(i,i+1);
            if(alpha.equals(" ")){
                System.out.println(word);
                word = "";
            }
            else{
                word=alpha+word;
            }
        } 
        System.out.println(word);
    }
    public void CountText(String msg, String term){
        String alpha;
        int i=0;
        int count=0;
        for(i=0;i<msg.length();i++){
            alpha=msg.substring(i,i+1);
            if(alpha.equals(term.substring(0,1))){
                if(msg.substring(i,i+term.length()).equals(term))
                count++;
            i+=term.length()-1;
            }
        }
        System.out.println(count);
    }
    //public void CountText(String msg, String term){
        String alpha;
        int i=0;
        int count=0;
        for(i=0;i<msg.length();i++){
            alpha=msg.substring(i,i+1);
            if(alpha.equals(term.substring(0,1))){
                if(msg.substring(i,i+term.length()).equals(term))
                count++;
            i+=term.length()-1;
            }
        }
        System.out.println(count);
}