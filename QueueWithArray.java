import java.util.NoSuchElementException;

public class QueueWithArray {

	
	static class myQueue{
		
		public myQueue(){
			arr = new int[10];
			start = 0;
			end = 0;
		}
		
		void put(int obj){
			// first if the queue is full, must resize
			if (len == arr.length){
				int[] larger = new int[2*arr.length];
				int index = 0;
				
				// first see if a wrap around is needed
				while (start != end){
					if (start == arr.length){
						start = 0;
					}
					larger[index++] = arr[start++];
				}
				
				start = 0;
				end = index;
				arr = larger;
			}
			else if (end == arr.length){
				end = 0;
			}
			arr[end++] = obj;
			++len;
		}
		
		int remove(){
			if (len != 0){
				--len;
				
				if (start == arr.length-1){
					start = 0;
					return arr[arr.length-1];
				}
				return arr[start++];
			}
			else{
				throw new NoSuchElementException();
			}
		}
		
		boolean empty(){
			if (len == 0){
				return true;
			}
			return false;
		}
		
		private int[] arr;
		private int len;
		private int start;
		private int end;
	}
	
	
	public static void main(String[]args){
		myQueue q = new myQueue();
		q.put(0);
		q.put(1);
		q.put(2);
		q.put(3);
		q.put(4);
		q.put(5);
		q.put(6);
		q.put(7);
		q.remove();
		q.put(8);
		q.put(9);
		q.remove();
		q.put(10);
		q.put(11);
		while (!q.empty()){
			System.out.print(q.remove() + " ");
		}
	}
}
