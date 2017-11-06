/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */
package pMap.phaseA;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class PMapTest {

	@Test
	public void test1() {
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		System.out.println(pmap.size());
		int[] keys = pmap.keys();
		for (int i : keys) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] values = pmap.values();
		for (int i : values) {
			System.out.print(i+" ");
		}
		System.out.println(pmap.size());
	}
	
	@Test
	public void testGetValue(){
		PEntry testVal = new PEntry();
		testVal.setValue(3);
		assertEquals(3, testVal.getValue());
	}
	
	@Test
	public void testSize(){
		List<PEntry> entryList = new ArrayList<PEntry>();
		PEntry testVal = new PEntry(1, 3);
		PEntry testVal1 = new PEntry(2, 5);
		PEntry testVal2 = new PEntry(3, 6);
		PEntry testVal3 = new PEntry(4, 7);
		PEntry testVal4 = new PEntry(1, 4);
		entryList.add(testVal);
		entryList.add(testVal1);
		entryList.add(testVal2);
		entryList.add(testVal3);
		entryList.add(testVal4);
		assertEquals(entryList.size(), 4);
	}
	
	@Test
	public void testIsEmpty(){
		List<PEntry> entryList = new ArrayList<PEntry>();
		assertEquals(entryList.size(), 0);
	}
	
	@Test
	public void testcontainsKey(){
		List<PEntry> entryList = new ArrayList<PEntry>();
		PEntry testVal = new PEntry(1, 3);
		PEntry testVal1 = new PEntry(2, 5);
		PEntry testVal3 = new PEntry(4, 7);
		PEntry testVal4 = new PEntry(0, 4);
		PEntry testVal2 = new PEntry(3, 6);
		entryList.add(testVal);
		entryList.add(testVal1);
		entryList.add(testVal3);
		entryList.add(testVal4);
		entryList.add(testVal2);
		assertEquals(entryList.get(0).getKey(), 0);
		assertNotEquals(entryList.get(0).getKey(), 1);
		assertEquals(entryList.get(3).getKey(), 3);
		assertNotEquals(entryList.get(3).getKey(), 4);
	}
	
	@Test
	public void testcontainsValue(){
		List<PEntry> entryList = new ArrayList<PEntry>();
		PEntry testVal = new PEntry(1, 3);
		PEntry testVal1 = new PEntry(2, 5);
		PEntry testVal3 = new PEntry(4, 7);
		PEntry testVal4 = new PEntry(3, 4);
		PEntry testVal2 = new PEntry(3, 6);
		PEntry testVal5 = new PEntry(4, 9);
		entryList.add(testVal);
		entryList.add(testVal1);
		entryList.add(testVal3);
		entryList.add(testVal4);
		entryList.add(testVal2);
		entryList.add(testVal5);
		assert(entryList.contains(6));
		assert(entryList.contains(5));
		assert(entryList.contains(9));
		assert(entryList.contains(7));
	}
	
	@Test
	public void testGet(){
		List<PEntry> entryList = new ArrayList<PEntry>();
		PEntry testVal = new PEntry(1, 3);
		PEntry testVal1 = new PEntry(2, 5);
		PEntry testVal3 = new PEntry(4, 7);
		PEntry testVal4 = new PEntry(3, 4);
		PEntry testVal2 = new PEntry(3, 6);
		PEntry testVal5 = new PEntry(4, 9);
		entryList.add(testVal);
		entryList.add(testVal1);
		entryList.add(testVal3);
		entryList.add(testVal4);
		entryList.add(testVal2);
		entryList.add(testVal5);
		assertEquals(entryList.get(2), 6);
		assertNotEquals(entryList.get(3).getKey(), 7);
		assertEquals(entryList.get(1).getKey(), 5);
		assertNotEquals(entryList.get(0).getKey(), 3);
	}

	//start here
	@Test
	public void testPut(){
		
	}
	
	@Test
	public void testRemove(){
		
	}
	
	@Test
	public void testPutAll(){
		
	}
	
	@Test
	public void testClear(){
		
	}
	
	@Test
	public void testKeys(){
		
	}
	
	@Test
	public void testValues(){
		
	}
	
	@Test
	public void testEntrys(){
		
	}
	
	// TODO add more test cases to test all implemented methods
}
