import java.util.Stack;

public class StringToInt {

	static int mattInt(String str){
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i < str.length();++i){
			stack.push(str.charAt(i));
		}
		
		int times = 1;
		int solution = 0;
		Character c;
		
		while (!stack.isEmpty()){
			c = stack.pop();
			
			if (c == '1'){
				solution += times;
			}
			else if (c == '2'){
				solution += 2*times;
			}
			else if (c == '3'){
				solution += 3*times;
			}
			else if (c == '4'){
				solution += 4*times;
			}
			else if (c == '5'){
				solution += 5*times;
			}
			else if (c == '6'){
				solution += 6*times;
			}
			else if (c == '7'){
				solution += 7*times;
			}
			else if (c == '8'){
				solution += 8*times;
			}
			else{
				solution += 9*times;
			}
			
			times *= 10;
		}
		return solution;
	}
	
	public static void main(String[] args){
		
		String str = "92354";
		
		System.out.println("This is an int: " + mattInt(str));
	}
}
