import java.util.ArrayList;

public class LinearSearchRecur {
    public static void main(String[] args) {
        int [] arr = {3,2,1,18,18,19};
        // System.out.println(recurLinear(arr, 0, 18));
        // findAll(arr, 0, 18);
        // System.out.println(al);
        // System.out.println(findAll2(arr, 0, 18, new ArrayList<>()));
        System.out.println("findAll 3 answer "+findAll3(arr, 0, 18));
    }

    static int recurLinear(int []arr,int index,int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return recurLinear(arr, index+1, target);
    }

    static ArrayList <Integer> al = new ArrayList<>();

    static void findAll(int []arr,int index,int target) {
        if (index == arr.length) {
            return;
        }

        if (target == arr[index]) {
            al.add(index);
        }

        findAll(arr, index+1, target);
    }
    static ArrayList<Integer> findAll2(int []arr,int index,int target,ArrayList <Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (target == arr[index]) {
            list.add(index);
        }

        return findAll2(arr, index+1, target,list);
    }

    static ArrayList<Integer> findAll3(int []arr,int index,int target) {
        ArrayList <Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (target == arr[index]) {
            list.add(index);
        }

        // findAll3(arr, index+1, target);
        list.addAll(findAll3(arr, index + 1, target));
        return list;
    }
}
