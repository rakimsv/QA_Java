
public class HighestNumber {
	public static void main(String xyx[]) {
		int numbers[]= {12,24,546,36,1,67,90,145};
		int i;
		int maxvalue=numbers[0];
		for(i=1;i<numbers.length;i++) {
			if(numbers[i]>maxvalue){
				maxvalue=numbers[i];
			}
		}
	System.out.println(maxvalue);
	}
}