package Activities1;

interface Addable{
	int add(int num1,int num2);
	
}
public class Activity12 {
	public static void main(String[] args) {
		
//Implementation as an expression
		Addable ad1 = (num1,num2) ->num1 + num2;
		//Implementation as a function
		Addable ad2 = (int num1,int num2) ->{
			return num1 + num2;
			
		};
		System.out.println(ad1.add(10,50));
		System.out.println(ad1.add(20,90));
		
		
		
	}
}