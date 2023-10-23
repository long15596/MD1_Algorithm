import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class b15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        List<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        int flag = 0;
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ':');
                list.add(sc.nextInt());
            }
            for (int i = 0; i < size - 1; i++) {
                if (list.get(i + 1) > list.get(i)) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            if (flag != 0) {
                System.out.println("Phần tử trong mảng tăng dần");
            } else {
                System.out.println("Phần tử trong mảng không tăng dần");
            }
        } else {
            System.out.println("Nhập số lượng phần tử");
        }
    }
}

class b15Lv2AndLv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng A: ");
        List<Integer> listA = new ArrayList<>();
        int sizeA = sc.nextInt();
        System.out.println("Nhập số lượng phần tử trong mảng B: ");
        List<Integer> listB = new ArrayList<>();
        int sizeB = sc.nextInt();
        int flag = 0;
        int count = 0;
        if (sizeA != 0 && sizeB != 0) {
            for (int i = 0; i < sizeA; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " vào mảng A: ");
                listA.add(sc.nextInt());
            }
            for (int i = 0; i < sizeB; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + " vào mảng B: ");
                listB.add(sc.nextInt());
            }
            for (int i = 0; i < sizeA - 1; i++) {
                for (int j = 0; j < sizeB - 1; j++) {
                    if (Objects.equals(listA.get(i), listB.get(j))){
                        flag = 1;
                    } else {
                        flag = 0;
                    }
                }
            }
            if (flag == 1) {
                System.out.println("Các phần tử trong mảng A có nằm trong mảng B");
            } else {
                System.out.println("Các phần tử trong mảng A không có nằm trong mảng B");
            }
            for (int i = 0; i < sizeA - 1; i++) {
               if (Objects.equals(listA.get(i),listB.get(i+1))) {
                   count++;
               }
            }
            System.out.println("Số lần lặp các cặp so le là: " + count);
        } else {
            System.out.println("Nhập số lượng phần tử");
        }
    }
}

