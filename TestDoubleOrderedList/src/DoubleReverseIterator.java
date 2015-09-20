import java.util.*;

public class DoubleReverseIterator<E> {
	
	private DoubleList<E> doubleList;
	private int index;

	public DoubleReverseIterator(DoubleList<E> doubleList) {
		this.doubleList = doubleList;
		index = doubleList.size();
	}
	public boolean hasPrevious() {
		if (index > 0) {
			return true;
		} else {
			return false;
		}
	}
	public E previous() {
		if (!hasPrevious()) {
			throw new NoSuchElementException();
		}
		index--;
		return doubleList.get(index);
	}
}
