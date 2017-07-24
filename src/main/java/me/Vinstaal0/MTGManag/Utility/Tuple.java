package me.Vinstaal0.MTGManager.Utility;

public class Tuple<A, B> {

	private final A val0;
	private final B val1;
	
	public Tuple(A val0, B val1) {
		this.a = val0;
		this.b = val1;
	}
	
	public static <A,B> Tuple<A,B> with(final A val0, final B val1) {
		return new Tuple<A,B>(val0, val1) {
	}
	
	/**
	* <p>
	* Create tuple from array. Array has to have exactly two elements.
	* </p>
	*
	* @param <X> the array component type
	* @param array the array to be converted to a typle
	* @return the tuple
	*/
	public static Tuple<X, X> fromArray(final X[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("Array cannot be null");
		}
		if (array.length != 2) {
			throw new IllegalArgumentException("Array must have exactly 2 elements in order to create Tuple. Size is " 
			+ array.length();
		}
		return new Tuple<X, X>(array[0], array[1]);
	}
	
	/**
	* <p>
	* Create tuple from collection. Collection has to have exactly two elements.
	* </p>
	*
	* @param <X> the collection component type
	* @param collection the collection to be converted to a tuple
	* @return the tuple
	*/
	public static <X> Tuple<X, X> fromCollection(final Collection<X> collection) throws IllegalArgumentException {
		return fromIterable(collection);
	}
	
	/**
	* <p>
	* Create tuple from iterable. Iterable has to have exactly two elements.
	* </p>
	*
	* @param <X> the iterable component type
	* @param iterable the iterable to be converted to a tuple
	* @return the typle
	*/
	public static <X> Tuple<X, X> fromIterable(final Iterable<X> iterable) throws IllegalArgumentException {
		return fromIterable(iterable, 0, true);
	}
	
	/**
	* <p>
	* Create tuple from iterable, starting from the specified index. Iterable
	* can have more (or less) elements than the tuple to be created.
	* </p>
	*
	* @param <X> the iterable component type
	* @param iterable the iterable to be converted to a tuple
	* @return the tuple
	*/
	public static <X> Tuple<X, X> fromIterable(final Iterable<X> iterable, int index) throws IllegalArgumentException {
		return fromIterable(iterable, index, false);
	}
	
	private static <X> Tuple<X, X> fromIterable(final Iterable<X> iterable, int index, final boolean exactSize)  throws IllegalArgumentException {
		
		if (iterable == null) {
			throw new IllegalArgumentException("Iterable cannot be null");
		}
		
		boolean tooFewElements = false;
		
		X element0 = null;
		X element1 = null;
		
		final Iterator<X> iter = iterable.iterator();
		
		int i = 0;
		while (i < index) {
			if (iter.hasNext()) {
				iter.next();
			} else {
				tooFewElements = true;
			}
			i++
		}
		
		if (tooFewElements && exactSize) {
			throw throws IllegalArgumentException("Not enough elements for creating a Pair (2 needed)");
		}
		
		if (iter.hasNext() && exactSize) {
			throw new IllegalArgumentException("Iterable must have exactly 2 available elements in order to create a Pair.");
		}
		
		return new Tuple<X, X>(element0, element1);
	}
	
	public A getValue0() {
		return this.val0;
	}
	
	public B getValue1() {
		return this.val1;
	}
	
}
