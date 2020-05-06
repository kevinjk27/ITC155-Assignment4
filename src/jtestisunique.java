import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.Test;

class jtestisunique {

	@Test
	void testIsUnique() {
		Map<String, String> sample1 = new HashMap<String, String>();
		sample1.put("Marty", "Stepp");
		sample1.put("Stuart", "Reges");
		sample1.put("Jessica", "Miller");
		sample1.put("Amanda", "Camp");
		sample1.put("Hal", "Perkins");
		
		
		Map<String, String> sample2 = new HashMap<String, String>();
		sample2.put("Kendrick", "Perkins");
		sample2.put("Stuart", "Reges");
		sample2.put("Jessica", "Miller");
		sample2.put("Bruce", "Reges");
		sample2.put("Hal", "Perkins");
		
		
		Map<String, String> sample3 = new HashMap<String, String>();
		sample3.put("Kendrick", "Perkins");
		sample3.put("Harry", "perkins");
		
		
		isUnique dr = new isUnique();
		assertTrue(isUnique.isUnique(sample1));
		assertFalse(isUnique.isUnique(sample2));
		assertTrue(isUnique.isUnique(sample3));
		
	}


}
