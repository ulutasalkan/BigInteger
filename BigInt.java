package Homework_Java_020;

public class BigInt {
	private char[] num=new char[60];
	public BigInt(String val){
		for(int i=0;i<val.length();i++)
			num[i]=val.charAt(val.length()-i-1);
	}
	public BigInt(long val){		
		this(String.valueOf(val));
	}
	public void display(){
		for(char c: num)
			System.out.println(c);
	}
	public BigInt sum(BigInt val1, BigInt val2){
		return new BigInt("");
	}
	public static BigInt sum(BigInt val1, long val2){
		return new BigInt(val2);
	}
	public BigInt subtract(BigInt val1, BigInt val2){
		return new BigInt("");
	}
	public static BigInt subtract(BigInt val1, long val2){
		return new BigInt(val2);
	}
	public boolean compareTo(BigInt val1,BigInt val2){
		return false;		
	}
	public boolean compareTo(BigInt val1,long val2){
		return false;		
	}
	public boolean compareTo(BigInt val1,String val2){
		return false;		
	}
}
