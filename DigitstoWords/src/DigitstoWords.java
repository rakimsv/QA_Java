
public class DigitstoWords {

	public String convert(int num) {
		String result = "";
		if(num>1000) {
			result+=ones(num/1000)+"Thousand";
			num%=1000;
		}
		if(num>100) {
			result+=ones(num/100)+"hundred";
			num%=100;
		}
		if(num>20) {
			result=ty(num/10*10);
			num=num-(num/10*10);
		}
		if(num>=1) {
			result+=ones(num);
		}
		Return result;
	}
	
	private String ones(int No) {
		String word="";
		switch(No) {
		case 1: word="One";break;
		case 2: word="Two";break;
		case 3: word="Three";break;
		case 4: word="Four";break;
		case 5: word="Five";break;
		case 6: word="Six";break;
		case 7: word="Seven";break;
		case 8: word="Eight";break;
		case 9: word="Nine";break;
		case 10: word="Ten";break;
		case 11: word="Eleven";break;
		case 12: word="Twelve";break;
		case 13: word="Thirteen";break;
		case 14: word="Fourteen";break;
		case 15: word="Fifteen";break;
		case 16: word="Sixteen";break;
		case 17: word="Seventeen";break;
		case 18: word="Eighteen";break;
		case 19: word="Nineteen";break;
		}
	}
	
	private String ty(int No) {
		String word = "";
		switch(No) {
		case 20: word="Twenty";break;
		case 30: word="Thirty";break;
		case 40: word="Forty";break;
		case 50: word="Fifty";break;
		case 60: word="Sixty";break;
		case 70: word="Seventy";break;
		case 80: word="Eighty";break;
		case 90: word="Ninety";break;
		}
	
	}
}
