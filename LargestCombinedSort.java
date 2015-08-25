import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class mattInt implements Comparable<mattInt>{
	
	public mattInt(int i){
		this.num = i;
	}
	public int get(){
		return num;
	}
	
	private int num;

	@Override
	public int compareTo(mattInt a) {
		if (this.get() == a.get()){
			return 0;
		}
		int i = 0;
		
		int max;
		 
		if (this.get() >= a.get()){
			max = this.get();
		}
		else{
			max = a.get();
		}
		
		while(i < Integer.toString(max).length()){
			int first, second;
			
			if (this.get() < 10){
				first = this.get();
				second = a.get();
			}
			else{
				first = Integer.parseInt(Integer.toString(this.get()).substring(i, i+1));
			}
			if (a.get() < 10){
				second = a.get();
			}
			else{
				
				second= Integer.parseInt(Integer.toString(a.get()).substring(i, i+1));
			}
			if (first > second){
				return -1;
			}
			else if(first < second){
				return 1;
			}
			++i;
		}
		return 0;
	}
	

}

public class LargestCombinedSort {
	


	public static void main(String[] args){
		
		// given [3, 30, 9, 14, 1] the sort would be [9, 3, 30, 14, 1] because 9,330,141 is largest
		
		List<mattInt> arr = new ArrayList<mattInt>();
			arr.add(new mattInt(3));
			arr.add(new mattInt(30));
			arr.add(new mattInt(9));
			arr.add(new mattInt(14));
			arr.add(new mattInt(1));
		
		Collections.sort(arr);
		
		for(mattInt m:arr){
			System.out.print(m.get() + " ");
		}
 	}

}
