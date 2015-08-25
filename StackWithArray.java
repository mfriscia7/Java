public class StackWithArray {

	
	static class myStack{
		
		public myStack(){
			arr = new int[10];
			len = 0;
		}
		
		void put(int obj){
			// resizes if too big
			if (len >= arr.length){
				int[] temp = new int[2*arr.length];
				for (int i=0;i<len;++i){
					temp[i] = arr[i];
				}
				arr = temp;
			}
			
			arr[len] = obj;
			++len;
		}
		
		int remove(){
			// doesn't need to remove the object but makes the size shorter
			--len;
			return arr[len];
			
		}
		
		boolean empty(){
			if (len == 0){
				return true;
			}
			return false;
		}
		
		private int[] arr;
		private int len;
	}
	
	
	public static void main(String[]args){
		myStack s = new myStack();
		s.put(0);
		s.put(1);
		s.put(2);
		s.put(3);
		s.put(4);
		s.put(5);
		s.put(6);
		s.put(7);
		s.put(8);
		s.put(9);
		s.put(10);
		while (!s.empty()){
			System.out.print(s.remove() + " ");
		}
	}
}
