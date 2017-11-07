/** Phase A <tzv57><pmj443>
 * Phase B <pmj443><tzv57>
 */
package pMap.phaseA;

import java.util.ArrayList;

/**
 * PMap stands for Paired Map. A map is a collection of key value pairs, e.g.,
 * (1, 2) (2, 3) (3, 4) are all pairs with a key that's a integer and a value
 * that's an integer
 * See the java.util.Map documentation for how these methods are supposed to work
 */
public class PMap {
	ArrayList<PEntry> PEntries = new ArrayList<PEntry>();

	public int size() {
		// TODO Auto-generated method stub
		return PEntries.size();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(PEntries.size() == 0) {
			return true;
		}
		return false;
	}

	public boolean containsKey(int key) {
		// TODO Auto-generated method stub
        for (PEntry p : PEntries) {
            if (p.getKey() == key) {
                return true;
            }
        }
        return false;
	}

	public boolean containsValue(int value) {
		// TODO Auto-generated method stub
        for (PEntry p : PEntries) {
            if (p.getValue() == value) {
                return true;
            }
        }
        return false;
	}

	public int get(int key) {
		// TODO Auto-generated method stub
        for (PEntry p : PEntries) {
            if (p.getKey() == key) {
                return p.getValue();
            }
        }
        return 0;
	}

	public int put(int key, int value) {
		// TODO Auto-generated method stub
        if (containsKey(key)) {
            for (PEntry p : PEntries) {
                if (p.getKey() == key) {
                    p.setValue(value);
                    return value;
                }
            }
        }
        return 0;
	}

    //code until here

	public int remove(int key) {
		int val = get(key);
		PEntries.remove(key);
		return val;
	}

	public void putAll(int[] keys, int[] values) {
		if(keys.length != values.length){
			return;
		}
		for(int i = 0; i < keys.length; i++){
			put(keys[i], values[i]);
		}

	}

	public void clear() {
			PEntries.removeAll(PEntries);
	}

	public int[] keys() {
		int[] key = new int[PEntries.size()];
		for(int i = 0; i < PEntries.size(); i++){
			if(!PEntries.contains(key)){
			key[i] = PEntries.get(i).getKey();
			}
		}
		return key;
	}

	public int[] values() {
		int[] value = new int[PEntries.size()];
		for(int i = 0; i < PEntries.size(); i++){
			value[i] = PEntries.get(i).getValue();
		}
		return value;
	}

	public PEntry[] entrys() {
		PEntry[] list = new PEntry[PEntries.size()];
		for(int i = 0; i < PEntries.size(); i++){
			list[i].setKey(PEntries.get(i).getKey());
			list[i].setValue(PEntries.get(i).getValue());
		}
		return list;
	}

}
