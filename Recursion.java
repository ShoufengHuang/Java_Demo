public class Recursion {
    public static void main(String[] args) {
        int result = sum1(5, 10);
        System.out.println(result);
    }
    public static int sum1(int start, int end) {
        if (end > start) {
            return end + sum1(start, end - 1);
        } else {
            return end;
        }
    }
}
