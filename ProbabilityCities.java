/*
 * Randomly selects a city. Probability of selecting a certain city is proportional to
 * the population of that city
 */

import java.util.HashMap;


public class ProbabilityCities {

	public static String func(HashMap<String, Integer> map){
		
		int total = 0;
		int n_total = 0;
		// gets total value
		for(String k: map.keySet()){
			total+=map.get(k);
		}
		
		int r = (int) (Math.random()*total);
		for (String k: map.keySet()){
			n_total+= map.get(k);
			if (r < n_total){
				return k;
			}
		}
		return "none found";
		
	}
	
	public static void main(String[] args){
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Los Angeles", 15);
		map.put("Chicago", 5);
		map.put("New York City", 10);
		
		int ch = 0;
		int la = 0;
		int nyc = 0;
		
		for (int i=0;i<1000;++i){
			String str = func(map);
			if (str == "Los Angeles"){
				++la;
			}
			else if (str == "Chicago"){
				++ch;
			}
			else{
				++nyc;
			}
		}
		System.out.println("LA: " + la);
		System.out.println("Chicago: " + ch);
		System.out.println("NYC: " + nyc);
	}
}
