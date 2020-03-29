package practice.day3;

public class CompareString {

	static int flag;
	static int result;
	static String word1;
	static String word2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		word1="Home";
		word2="emoh";
		result=stringCompare(word1,word2);
		if(result==1){
			System.out.println("Second String is reverse of first");
		}
		else{
			System.out.println("Second string is not he reverse of first");
		}
	} 

	static int stringCompare(String str1,String str2)
	{
		StringBuilder sb=new StringBuilder(str1);
		sb=sb.reverse();
		if(str2.equalsIgnoreCase(sb.toString()))
		{
			flag=1;
		}
		else{
			flag=-1;
		}
		return flag;
	}

}
