class BubbleSortApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;            // array size
      ArrayBub arr;                 // reference to array
      arr = new ArrayBub(maxSize);  // create the array

      arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);
      arr.insert(33);
      arr.insert(27);
      arr.insert(2);
      arr.insert(9);
      arr.insert(97);
      arr.insert(82);
      arr.insert(12);
      

      arr.display();                // display items

      arr.bubbleSort();             // bubble sort them

      arr.display();                // display them again
      }  // end main()
   }  // end class BubbleSortApp