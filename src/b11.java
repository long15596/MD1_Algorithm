import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        List<Integer> oddNumbersList = new ArrayList<>();
        List<Integer> negativeNumbersList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        System.out.println("Nhập số lượng phần tử muốn nhập: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            numbersList.add(sc.nextInt());
            if (numbersList.get(i) % 2 == 0) {
                oddNumbersList.add(numbersList.get(i));
            }
            if (numbersList.get(i) < 0) {
                negativeNumbersList.add(numbersList.get(i));
            }
        }
        System.out.println("Số chẵn trong mảng là: " + oddNumbersList);
        System.out.println("Số âm trong mảng là: " + negativeNumbersList);
        for (int i = (size - 1); i > 0; i--) {
            if (numbersList.get(i) < numbersList.get(i - 1)) {
                newList.add(numbersList.get(i));
            }
        }
        System.out.println("Các phần tử lớn hơn giá trị trước là: " + newList);
    }
}
