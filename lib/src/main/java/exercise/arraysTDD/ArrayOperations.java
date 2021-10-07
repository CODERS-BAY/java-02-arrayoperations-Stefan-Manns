package exercise.arraysTDD;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
	private final int[] numbers; // array that needs to be sorted.
	private final int[] unsorted; // reference array which stays unsorted.

	public ArrayOperations(int[] numbers) {
		this.numbers = numbers;
		this.unsorted = numbers.clone();
	}

	/*
	 * ********************************************************** Please implement
	 * the following methods. * It is intended that they are not static. *
	 ***********************************************************/

	/**
	 * Prints out the numbers array.
	 */

	public void print() {

		for (int number : numbers) {
			System.out.print(number + ", ");
		}

	}

	/**
	 * @return the sorted numbers array.
	 * @see <a
	 *      href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
	 */
	public int[] sort() {
		for (int i = 0; i < numbers.length; i++) {
			for (int j=1; j<numbers.length ; j++) {
				if(numbers[j]<numbers[j-1]) {
					int temp= numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j-1]=temp;
					
					
				}
				
			}
		}
		return numbers;
	}

	/**
	 * @return the sorted array in reverse order
	 */
	public int[] revertSort() {
		 int[] reversed = new int[numbers.length];
	        int j = 0;
	        for (int i = numbers.length -1; i>=0; i--) {
	            reversed[j] = numbers[i];
	            j++;
	        }
	        return reversed;
	    }
	

	/**
	 * @return the unsorted array in reverted order.
	 */
	public int[] reverted() {
		int[] reversed = new int[unsorted.length];
        int j = 0;
        for (int i = unsorted.length -1; i>=0; i--) {
            reversed[j] = unsorted[i];
            j++;
        }
        return reversed;
    }
	

	/**
	 * @param value which should be searched for.
	 * @return true if the array contains the value, false otherwise.
	 */
	public boolean contains(int value) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers [i] == value ) {
				return true;
			}
			
		}
//		for (int number : numbers) {
//			if (number == value) {
//				return true;
//			}
//		}
		
		return false;
	}

	/**
	 * @return the average value of all elements summed up.
	 */
	public double average() {

        double sum = 0.0;

        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            }

        return sum / numbers.length;
    }

	/**
	 * @return the average value of all elements summed up, but without the highest
	 *         and the lowest value.
	 */
	public double trimmedMean() {

        double sum = 0.0;
        double max = 0.0;
        double min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double mean = (sum - max - min) / (numbers.length - 2);

        return mean;
    }

	/**
	 * @return the max value of the array. In the array [1,9,3] max would be 9.
	 */
	public int maxValue() {
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers [i] >max) {
				max=numbers[i];
			}
		
	}
		
		
		return max;
	}

	/**
	 * @return the min value of the array. In the array [1,9,3] min would be 1.
	 */
	public int minValue() {
		int min = 54;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers [i] <min) {
				min=numbers[i];
			}
		
	}
		return min;
	}

	/*
	 * ********************************************************** Feel free to add
	 * as many private helper methods as * you like. *
	 ***********************************************************/

	private int someHelper(int[] tmp) {
		return 1;
	}
}
