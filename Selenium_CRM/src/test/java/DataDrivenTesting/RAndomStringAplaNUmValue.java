package DataDrivenTesting;

public class RAndomStringAplaNUmValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n= 20;


//choose a character random from this string
String alpanum="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

//create String buffer size of alphanum variable length
 StringBuilder sb=new StringBuilder(n);
 
 
     for(int i=0;i<n;i++)
    {
	//generate a random number btw 0 to aplanum
	 int index=(int)(alpanum.length()*Math.random());
	 
	 //add character one by one in the end of sb
	 sb.append(alpanum.charAt(index));
 }
 
	 System.out.println(sb);
	 
 
	}

}
