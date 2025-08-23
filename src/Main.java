import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {2,4,6,7,8,11,13,17};

        int position = findNumByRandom(nums, 5 );
        if (position != -1){
            System.out.println(" \nYayy Correct!  The answer is at index " + position);
        }else{
            System.out.println("\n Oops! The number is not in the array");
        }

    }

    /**
     * This is a implementation of the binary search algorithm
     *
     * @param nums An array of int that you want to search from
     * @param search The item you want to search for
     * @return the index of the number you are searching for
     *
     * Returns -1 if the number is not found in the array
     */
    static int findNum(int[] nums, int search){
        int high = nums.length - 1;
        int low = 0;

        while(low <= high){
            int mid = (low + high)/ 2;
            int guess = nums[mid];
            System.out.println("Searching btw:" + low + " and " + high);
            if (guess == search){
                return mid;
            }else if (guess < search){
                low = mid + 1;
            }else {
                high = mid -1;
            }

        }
        return -1;
    }

    /**
     * A binary search algorithm game where the computer randomly finds the index
     * of the number you're looking for. This random impl mimics an human guessing the index
     *
     * @param nums An array of int that you want to search from
     * @param search The item you want to search for
     * @return the index of the number you are searching for
     *
     * Returns -1 if the number is not found in the array
     */
    static int findNumByRandom(int[] nums, int search){
        int high = nums.length - 1;
        int low = 0;

        Random rand = new Random();

        while(low <= high){
            int mid = (low + high)/ 2;
            int midNum = nums[mid];
            int randomIndex = rand.nextInt(low, high +1); //guesses a randomIndex
            int guess = nums[randomIndex];  //the number guessed at theat index
            System.out.println("Guessing btw:" + low + " and " + high);
            System.out.println("Random guess is " + guess + " at index: " + randomIndex);
            System.out.println("Mid index is " + mid);
            System.out.println("Mid num is " +  midNum);
            if (guess == search){
                return randomIndex; //if the computer guessed right, then return the index
            }else{ //the computer didn't guess right
                if (search == midNum){ //the binary search begins, and the loop continues for the computer to guess again
                    return mid;
                }else if (search > midNum ){
                    low = mid + 1;
                    System.out.println("Nope! the answer is btw " + low + " and " + high);
                }else {
                    high = mid - 1;
                    System.out.println("Nope! the answer is btw " + low + " and " + high);
                }
            }

            System.out.println("--------------------");
        }
        return -1;
    }
}