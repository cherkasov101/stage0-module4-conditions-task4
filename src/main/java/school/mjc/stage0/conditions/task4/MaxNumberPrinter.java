package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int biggest = first;
        if (first < second || first < third) {
            if (second > third) {
                biggest = second;
            } else {
                biggest = third;
            }
        }
        System.out.println(biggest);
    }
}
