import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Gatherer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> moi = new ArrayList<>(List.of(1,3,6,2,10,11,4));
       ArrayList<Integer> foo = selectionSort(moi);
       System.out.println(foo);
    }

    /**
     * This is the implementation of the selection sort algorithm
     * @param nums the collection that needs to be sorted
     * @return a sorted ArrayList from smallest to largest
     *
     */
    static ArrayList<Integer> selectionSort(ArrayList<Integer> nums){
        ArrayList<Integer> sortedNums = new ArrayList<>();
        int length = nums.size();
        for (int i = 0; i < length; i++){
            System.out.println(nums);

            int smallestIndex = findSmallestIndex(nums);
            int smallestValue = nums.remove(smallestIndex);
            sortedNums.add(smallestValue);
        }
        return sortedNums;
    }

    static int findSmallestIndex(ArrayList<Integer> nums){
        int smallestValue = nums.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) < smallestValue){
                smallestValue = nums.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}