public class NoOfStep {
    public static void main(String[] args) {
        System.out.println(steps(14, 0));
    }
    // static int steps(int num,int count) {
    //     while (num > 0) {
    //         if (num % 2 == 0) {
    //             num = num / 2;
    //             count ++;
    //         } else {
    //             num = num -1;
    //             count ++;
    //         }
    //     }
    //     return count;
    // }
    static int steps(int num,int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return steps(num / 2, count + 1);
        } 
        return steps(num - 1, count + 1);
    }
}
