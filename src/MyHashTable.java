import java.util.ArrayList;

public class MyHashTable<E> {
    private static int HASH_SIZE;
    private ArrayList<E> list;

    MyHashTable(int size){
        HASH_SIZE = size;
        list = new ArrayList<>(size);
        //prepolulate arrayList to allow random access
        for (int i = 0 ; i < size; i++){
            list.add(null);
        }
    }

    public void add(String key, E element){
        int index = hashingFunction(key);
        list.set(index, element);
    }

    public E get(String key){
        int index = hashingFunction(key);
        return list.get(index);
    }

    public void printAll(){
        for (E e : list){
            System.out.println(e);
        }
    }


    private int hashingFunction(String key){
        char[] charArr = key.toCharArray();
        int sum = 0;
        for (char c : charArr){
            int primeIndex = getPrimeIndex(c);
            sum += primeIndex;
        }
        return sum % HASH_SIZE;
    }

    private  static int getPrimeIndex(char c) {
        switch (c) {
            case 'a':
                return 2;
            case 'b':
                return 3;
            case 'c':
                return 5;
            case 'd':
                return 7;
            case 'e':
                return 11;
            case 'f':
                return 13;
            case 'g':
                return 17;
            case 'h':
                return 19;
            case 'i':
                return 23;
            case 'j':
                return 29;
            case 'k':
                return 31;
            case 'l':
                return 37;
            case 'm':
                return 41;
            case 'n':
                return 43;
            case 'o':
                return 47;
            case 'p':
                return 53;
            case 'q':
                return 59;
            case 'r':
                return 61;
            case 's':
                return 67;
            case 't':
                return 71;
            case 'u':
                return 73;
            case 'v':
                return 79;
            case 'w':
                return 83;
            case 'x':
                return 89;
            case 'y':
                return 97;
            case 'z':
                return 101;
        }
        return -1;
    }

}

