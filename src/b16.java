import java.util.*;

public class b16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int size = sc.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> newList = new TreeMap<>();
        if (size != 0) {
            for (int i = 0; i < size;  i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                list.add(sc.nextInt());
            }
            System.out.println("Kiểm tra phần tử: ");
            int num = sc.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if (num == list.get(i)) {
                    count++;
                }
            }
            System.out.println("Số lần xuất hiện của phần tử là: " + count);
        }
    }
}
class b16Lv2 {
    public static Scanner sc = new Scanner(System.in);
    public static void addElement(Map<Integer, Integer> map, int element) {
        if (map.containsKey(element)) {
            int count = map.get(element) + 1;
            map.put(element, count);
        } else {
            map.put(element, 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử trong mảng: ");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            list.add(sc.nextInt());
        }
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < size; i++) {
            addElement(map, list.get(i));
        }
        for (Integer key : map.keySet()) {
            System.out.printf("%d xuất hiện %d lần. \n", key, map.get(key));
        }
    }
}