package stringOperations;

public class StringBuilderExploring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder strBuilder = new StringBuilder();
		System.out.println("Value of strBuilder "+strBuilder.append("Rahul123"));
		System.out.println("Value of strBuilder "+strBuilder.capacity());
		System.out.println("Value of strBuilder "+strBuilder.append("Rahul123"));
		System.out.println("Value of strBuilder "+strBuilder.capacity());
		System.out.println("Value of strBuilder "+strBuilder.append("Rahul123"));
		System.out.println("Value of strBuilder "+strBuilder.length());
		System.out.println("Value of strBuilder "+strBuilder.capacity());
		strBuilder.setLength(0);
		
	
		int someNum = 3;
		String test = "r2h3c4";
		
		for(int i=0;i<test.length();i++){
			char someChar = test.charAt(i);
			
			if(Character.isDigit(someChar)){
				String num = strBuilder.append(someChar).toString();
				System.out.println("number"+num);
				Float.valueOf("0").floatValue();
				Integer.valueOf("1").intValue();
				
				
				int num1 = Integer.parseInt(num);
				System.out.println("this is a num "+num1);
				
				
			}else{
				System.out.println("text "+someChar);
			}
		}
	}
}
