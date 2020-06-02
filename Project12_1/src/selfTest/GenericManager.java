package selfTest;

import java.util.ArrayList;
import java.util.Collections;

public class GenericManager<T extends Comparable>{
	private ArrayList<T> cList;

	public GenericManager() {
		cList=new ArrayList<T>();
	}
	
	public void add(T a) {
		cList.add(a);
	}
	
	public void sort() {
		Collections.sort(cList);
	}
	
	public String find(T a) {
		String total="";
		for(T i:cList)if(i.equals(a))total+=i;
		return total;
	}
	
	public String toString() {
		String total="";
		for(T i:cList)total+=i;
		return total;
	}
}
