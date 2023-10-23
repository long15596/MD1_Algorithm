import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Float> nummbersList = new ArrayList<>();
        float sum = 0;
        float sum1 = 0;
        System.out.println("Nhấp số lượng phần tử trong mảng: ");
        int size = scanner.nextInt();
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                nummbersList.add(scanner.nextFloat());
                }
            for (Float num : nummbersList) {
                sum += num;
                if (num % 3 == 0) {
                    sum1 += num;
                }
            }
            System.out.println("Tổng các phần tử trong mảng: " + sum);
            System.out.println("Tổng các phần tử chia hết cho 3: " + sum1);
            System.out.println("Trung bình các phần tử trong mảng: " + (sum / size));
        } else {
            System.out.println("Yêu cầu nhập số lượng phần tử");
        }
    }
}
