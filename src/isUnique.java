import java.util.*;

public class isUnique {

	public static void main(String[] args) {
		Map<String, String> sample1 = new HashMap<String, String>();
		// returning true
		sample1.put("Marty", "Stepp");
		sample1.put("Stuart", "Reges");
		sample1.put("Jessica", "Miller");
		sample1.put("Amanda", "Camp");
		sample1.put("Hal", "Perkins");
		System.out.println(isUnique(sample1));
		System.out.println();

		Map<String, String> sample2 = new HashMap<String, String>();
		// returning false because duplicate of Perkins and Reges
		sample2.put("Kendrick", "Perkins");
		sample2.put("Stuart", "Reges");
		sample2.put("Jessica", "Miller");
		sample2.put("Bruce", "Reges");
		sample2.put("Hal", "Perkins");
		System.out.println(isUnique(sample2));
	}

	public static boolean isUnique(Map<String, String> map) {
		Set<String> LastNameSet = new HashSet<String>(); //creating "container" of lastnames to check for duplication
		for (String key : map.keySet()) { // for each placeholder String key in all of keys
			String lastname = map.get(key); // returns the value pair to variable lastname
			if (LastNameSet.contains(lastname)) { //checks if the lastname is inside the LastNameSet
				return false; // which is a duplicate
			} else {
				LastNameSet.add(lastname); // adds the lastname in the array if it's not inside the LastNameSet
			}
		}
		return true;
	}
}
