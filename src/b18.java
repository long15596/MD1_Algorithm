import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b18 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử muốn nhập: ");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                list.add(sc.nextInt());
            }
            list.sort((o1, o2) -> o1 - o2);
            System.out.println("Hai số trong mảng có tích lớn nhất là " + list.get(size - 1) + " và " + list.get(size - 2));
        } else {
            System.out.println("Số lượng phần tử phải nhiều hơn 1");
        }
    }
}
