import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(List.of(2, 3, 18, 9, 4, 5, 8, 10, 6));
        ArrayList<Integer> moi = quickSort(test);

        System.out.println(moi);
    }

    /**
     * Quick sort algorithm
     * @param arr a collection of items to be sorted
     * @return a sorted array
     */
    static ArrayList<Integer> quickSort(ArrayList<Integer> arr){
        ArrayList<Integer> lesserArr = new ArrayList<>();
        ArrayList<Integer> greaterArr = new ArrayList<>();
        ArrayList<Integer> combined = new ArrayList<>();
        if (arr.size() < 2){
            return arr;
        }else {
            int pivot = arr.get(0);
            for (int i : arr) {
                if (i < pivot){
                    lesserArr.add(i);
                }else if (i > pivot){
                    greaterArr.add(i);
                }
            }
            combined.addAll(quickSort(lesserArr));
            combined.add(pivot);
            combined.addAll(quickSort(greaterArr));
            return combined;
        }
    }


}