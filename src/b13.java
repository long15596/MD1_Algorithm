
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int size = sc.nextInt();
        int max = 0;
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ':');
                numbersList.add(sc.nextInt());
                max = numbersList.get(0);
                for (Integer num : numbersList) {
                    if (max < num) {
                        max = num;
                    }
                }
            }
            System.out.println("Giá trị lớn nhất là: " + max);
            numbersList.sort((o1, o2) -> o1 - o2);
            System.out.println("Mảng sau sắp xếp: " + numbersList);
        } else {
            System.out.println("Yêu cầu nhập phần tử");
        }
    }
}
