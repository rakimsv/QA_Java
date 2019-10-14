public class DigitstoWords2 {
	
public String convert (int num) {
	String ones[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String Ty[]= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	String Result="";
	
	if(num>=1000) {
		Result+=ones[num/1000]+"Thousand";
		num%=1000;
	}
	if(num>=100) {
		Result+=ones[num/100]+"Hundred";
		num%=100;
	}
	if(num>=20) {
		Result=Ty[num/10];
		num=num-(num/10*10);
	}
	if(num>=1) {
		Result+=ones[num];
	}
	return Result;
}
}
