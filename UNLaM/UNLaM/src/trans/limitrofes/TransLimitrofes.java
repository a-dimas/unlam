package trans.limitrofes;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TransLimitrofes {
	
	
	public static void main (String[] args){
		HashMap<String, String> limitrofes = new HashMap<String, String>();// = new Map<String, String>();// =new Map();
		
		limitrofes.put("argentina", "chile");
		limitrofes.put("argentina", "brasil");
		limitrofes.put("argentina", "uruguay");
		limitrofes.put("brasil", "venezuela");
		
		System.out.println(limitrofes.get("argentina"));
		
		
	}
}
