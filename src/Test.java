
import java.util.Iterator;
import java.util.Stack;

public class Test {
    public static void main(String[] args){
        Stack<Integer> moi = new Stack<>();
        moi.push(3);
        moi.push(4);
        moi.push(3);
        moi.push(5);
        moi.push(6);
        int sum = sum(moi);
        System.out.println(sum);

        for (Range it = new Range(2, 2); it.hasNext(); ) {
            int i = it.next();
            System.out.println(i);
        }
    }

    /**
     * This is a recursive function that sums a collection
     * @param arr a stack data structure
     * @return total value of the list
     */

    static int sum(Stack<Integer> arr){
        int len = arr.size();
        if (len == 1){
            return arr.firstElement();
        }else{
            int lastElement = arr.pop();
            return lastElement + sum(arr);
        }
    }



}

class Range implements Iterator<Integer> {
    int start, end;
    public Range (int start, int end) throws IndexOutOfBoundsException{
        if(start > end){
            throw new ArrayIndexOutOfBoundsException("start index is greater than end index");
        }
        this.start = start;
        this.end = end;
    }
    @Override
    public boolean hasNext() {
        if (start > end){
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {
        int currentIndex = start;
        this.start++;
        return currentIndex;
    }
}