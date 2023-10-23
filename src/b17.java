import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class b17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng A: ");
        List<Integer> listA = new ArrayList<>();
        int sizeA = sc.nextInt();
        System.out.println("Nhập số lượng phần tử trong mảng B: ");
        List<Integer> listB = new ArrayList<>();
        int sizeB = sc.nextInt();
        List<Integer> newList = new ArrayList<>();
        if (sizeA > 1 && sizeB > 1 ) {
            for (int i = 0; i < sizeA; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " vào mảng A: ");
                listA.add(sc.nextInt());
            }
            for (int i = 0; i < sizeB; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " vào mảng B: ");
                listB.add(sc.nextInt());
            }
            for (int i = 0; i < sizeA; i++) {
                for (int j = 0; j < sizeB; j++) {
                    if (Objects.equals(listA.get(i), listB.get(j))) {
                       newList.add(listA.get(i));
                    }
                }
            }
            System.out.println("Phần tử chung của 2 mảng: " + newList);
        } else {
            System.out.println("Số lượng phần tử phải lớn hơn 1");
        }
    }
}

class b17Lv2 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        List<Integer> checkList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int size = input.nextInt();
        int count = 1;
        int max = 1;
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                numbersList.add(input.nextInt());
            }
            for (int i = 0; i < numbersList.size() -1; i++) {
                if (numbersList.get(i+1) > numbersList.get(i)) {
                    count++;
                    checkList.add(numbersList.get(i));
                } else {
                    if (max < count) {
                        max = count;
                        finalList.addAll(checkList);
                        count = 1;

                    }
                }
            }
            System.out.println("Dãy con dài nhất" + finalList);
            System.out.println("Chiều dài của dẫy con liên tiếp dài nhất là: " + max);
        } else {
            System.out.println("Số lượng phần tử phải lớn hơn 1");
        }
    }
}
