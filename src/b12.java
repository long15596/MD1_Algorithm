import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử muốn nhập: ");
        List<Integer> numberList = new ArrayList<>();
        List<Integer> evenIndexsList = new ArrayList<>();
        List<Integer> oddIndexsList = new ArrayList<>();
        int evenSum = 0;
        int oddSum = 0;

        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            numberList.add(sc.nextInt());
            if ((i + 1) % 2 == 0) {
                oddIndexsList.add(numberList.get(i));
            } else {
                evenIndexsList.add(numberList.get(i));
            }
        }
        System.out.println("Phần tử tại vị trí chẵn trong mảng là: " + oddIndexsList);
        System.out.println("Phần tử tại vị trí lẻ trong mảng là: " + evenIndexsList);
        for (int i = 0; i < numberList.size(); i++) {
            if ((numberList.get(i) % 2) == 0) {
                oddSum += numberList.get(i);
            } else {
                evenSum += numberList.get(i);
            }
        }
        System.out.println("Tổng phần tử chẵn trong mảng là: " + oddSum);
        System.out.println("Tổng phần tử lẻ trong mảng là " + evenSum);
        if (oddSum > evenSum) {
            System.out.println("Tổng số chẵn lớn hơn số lẻ");
        } else {
            System.out.println("Tổng số lẻ lớn hơn số chẵn");
        }
    }
}
