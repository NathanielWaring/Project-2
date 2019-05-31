class ArrayBub {
	private long[] a; // reference to array 'a'
	private int nElems; // number of data items
//--------------------------------------------------------------

	public ArrayBub(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}

//--------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

//--------------------------------------------------------------
	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

//--------------------------------------------------------------
	public void bubbleSort() {
		int right, left, in;
		left = 0;
		for (right = nElems - 1; right > 1; right--) { // outer loop (backward)
			for (in = 0; in < right; in++) // inner loop (forward)
				if (a[in] > a[in + 1]) // out of order?

					swap(in, in + 1); // swap them
			for (in = right; in > left; in--) { // inner loop (backward)
				if (a[in] < a[in - 1]) // out of order?
					swap(in, in - 1);
			}
				left++;
			
		}
	} // end bubbleSort()
//--------------------------------------------------------------

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
//--------------------------------------------------------------
} // end class ArrayBub