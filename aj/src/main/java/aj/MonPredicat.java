package aj;

import org.apache.commons.collections.Predicate;

public class MonPredicat<T> implements Predicate {

	public MonPredicat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean evaluate(Object arg0) {
		System.out.println("Value: " + arg0);
		int a = (int) Integer.parseInt((String)arg0);
		// TODO Auto-generated method stub
		if (a <50){
			return true;
		}
		else{
		return false;
		}
	}

}
