public class Sorts
{
	public static long selection_swaps=0;
	public static long selection_compare=0;
	public static long insertion_swaps=0;
	public static long insertion_compare=0;
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void selectionSort (int[] numbers)
   {
      int min, temp;

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] < numbers[min]) {
               min = scan;
               selection_compare++;
            }else {
            	selection_compare++;
            }
         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
         selection_swaps++;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (int[] numbers)
   {

      for (int index = 1; index < numbers.length; index++)
      {
         int key = numbers[index];
         int position = index;

         // shift larger values to the right
         if((position > 0 && numbers[position-1] > key)) {
         while (position > 0 && numbers[position-1] > key)
         {
        	 insertion_compare++;
            numbers[position] = numbers[position-1];
            position--;
            insertion_swaps++;
         }
         }
        	insertion_compare++; 
          
            
         numbers[position] = key;
      }
   }

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static void insertionSort (Comparable [] objects )
   {
      for (int index = 1; index < objects.length; index++)
      {
         Comparable key = objects[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && objects[position-1].compareTo(key) > 0)
         {
            objects[position] = objects[position-1];
            position--;
         }
            
         objects[position] = key;
      }
   }
   
   
}
