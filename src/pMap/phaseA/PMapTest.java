/** Phase A <tzv57><pmj443>
 * Phase B <pmj443><tzv57>
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
        PMap pMap = new PMap();
        PEntry testVal = new PEntry(1, 3);
        PEntry testVal1 = new PEntry(2, 5);
        PEntry testVal3 = new PEntry(4, 7);
		PEntry testVal4 = new PEntry(0, 4);
		PEntry testVal2 = new PEntry(3, 6);
        pMap.put(testVal.getKey(), testVal.getValue());
        pMap.put(testVal1.getKey(), testVal1.getValue());
        pMap.put(testVal3.getKey(), testVal3.getValue());
        pMap.put(testVal4.getKey(), testVal4.getValue());
        pMap.put(testVal2.getKey(), testVal2.getValue());
        assertEquals(true, pMap.containsKey(1));
        assertNotEquals(true, pMap.containsKey(2));
        assertEquals(true, pMap.containsKey(3));
        assertNotEquals(false, pMap.containsKey(7));
    }

    @Test
    public void testcontainsValue(){
        PMap pMap = new PMap();
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
		PMap pMap = new PMap();
		assertEquals(2, pMap.put(1, 2));
		assertEquals(true, pMap.containsKey(1));
		assertEquals(true, pMap.containsValue(2));
	}
	
	@Test
	public void testRemove(){
		PMap pMap = new PMap();
		assertEquals(2, pMap.put(1, 2));
		assertEquals(2, pMap.remove(1));
		assertEquals(false, pMap.containsKey(1));
		assertEquals(false, pMap.containsValue(2));
	}
	
	@Test
	public void testPutAll(){
		int[] keys = {1, 2, 3, 4, 5, 1};
		int[] values = {6, 5, 4, 3, 2, 1};
		PMap pMap = new PMap();
		pMap.putAll(keys, values);
		assertEquals(1, pMap.get(1));
		assertEquals(5, pMap.get(2));
		assertEquals(4, pMap.get(3));
		assertEquals(3, pMap.get(4));
		assertEquals(2, pMap.get(5));
		assertEquals(5, pMap.size());
	}
	
	@Test
	public void testClear(){
		int[] keys = {1, 2, 3, 4, 5, 1};
		int[] values = {6, 5, 4, 3, 2, 1};
		PMap pMap = new PMap();
		pMap.putAll(keys, values);
		assertEquals(5, pMap.size());
		pMap.clear();
		assertEquals(0, pMap.size());
	}
	
	@Test
	public void testKeys(){
		int[] keys = {1, 2, 3, 4, 5, 1};
		int[] returnedKeys = {1, 2, 3, 4, 5};
		int[] values = {6, 5, 4, 3, 2, 1};
		PMap pMap = new PMap();
		pMap.putAll(keys, values);
		assertEquals(returnedKeys, pMap.keys());
	}
	
	@Test
	public void testValues(){
		int[] keys = {1, 2, 3, 4, 5, 1};
		int[] values = {6, 5, 4, 3, 2, 1};
		int[] returnedValues = {1, 5, 4, 3, 2};
		PMap pMap = new PMap();
		pMap.putAll(keys, values);
		assertEquals(returnedValues, pMap.values());
	}
	
	@Test
	public void testEntries() {
		int[] keys = {1, 2, 3, 4, 5, 1};
		int[] values = {6, 5, 4, 3, 2, 1};
		PMap pMap = new PMap();
		pMap.putAll(keys, values);

		PEntry p0 = new PEntry(1, 1);
		PEntry p1 = new PEntry(2, 5);
		PEntry p2 = new PEntry(3, 4);
		PEntry p3 = new PEntry(4, 3);
		PEntry p4 = new PEntry(5, 2);

		PEntry[] entries = {p0, p1, p2, p3, p4};

		assertEquals(entries.length, pMap.entrys().length);
		assertEquals(entries[0], pMap.entrys()[0]);
		assertEquals(entries[1], pMap.entrys()[1]);
		assertEquals(entries[2], pMap.entrys()[2]);
		assertEquals(entries[3], pMap.entrys()[3]);
		assertEquals(entries[4], pMap.entrys()[4]);


	}
}
