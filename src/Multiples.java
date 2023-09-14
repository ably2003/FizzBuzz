public class Multiples {
    public static void main(String[] args) {
        doMultiples();
    }
    public static void doMultiples() {
        int i = 1;
        int count_mult = 0;
        while (i < 1000) {
            int three_rem = i % 3;
            int five_rem = i % 5;
            if (three_rem == 0 || five_rem == 0) {
                count_mult++;
            }
            i++;
        }
        System.out.println(count_mult);
    }
}
