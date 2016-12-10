import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UniqueWords {
	public static void main(String[] args) {
		try {
			ArrayList<String> wordsList = new ArrayList<String>();
			
			File file = new File("Java.txt");
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext()) {
				String words = scanner.next();
				String[] separator = words.split(" ");
				for (int i = 0; i < separator.length; i++) {
					wordsList.add(separator[i]);
				}
			}
			
			System.out.println("Words with their occurrency:");
	                        
			Map<String, Integer> treeMap = new TreeMap<String, Integer>();

        	for (String temp : wordsList) {
        		Integer count = treeMap.get(temp);
        		treeMap.put(temp, (count == null) ? 1 : count + 1);
        	}     
        	
        	Comparator<String> comparator = new ValueComparator(treeMap);
    		
    		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
    		result.putAll(treeMap);
    		
    		for (Map.Entry<String, Integer> entry : result.entrySet()) {
        		System.out.println(entry.getKey() + " : " + entry.getValue());
        	}    
            
	        } catch (Exception e) {
	        	System.out.println("Oops... File not found");
	        }
	}
}

class ValueComparator implements Comparator<String>{
	 
	TreeMap<String, Integer> map = new TreeMap<String, Integer>();
 
	public ValueComparator(Map<String, Integer> map){
		this.map.putAll(map);
	}
 
	@Override
	public int compare(String s1, String s2) {
		if(map.get(s1) >= map.get(s2)){
			return -1;
		}else{
			return 1;
		}	
	}
}