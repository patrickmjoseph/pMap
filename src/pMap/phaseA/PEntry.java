/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pMap.phaseA;

/**
 * Map.Entry, assume that the key and value are both integers.
 */
public class PEntry {
	private int key;
	private int value;
	public int getKey() { return key; }
	public int getValue() { return value; }
	
	public void setValue(int v){
		value = v;
	}
	
	public void setKey(int k){
		key = k;
	}
	
	public PEntry(int k, int v){
		key = k;
		value = v;
	}
	
	public PEntry(){
		
	}
	// TODO
}
