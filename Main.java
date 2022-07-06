import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4 };
        List<Integer> arrList = new ArrayList<>();
        for (int i : arr) {
            arrList.add(i);
        }

        for (int i = 0; i < arrList.size(); i++){
            Integer j = arrList.get(i);
            if (j <= 0) {
                arrList.remove(j);
                i--;
            }
        }
        for (int i = 0; i < arrList.size(); i++){
            Integer j = arrList.get(i);
            if (j % 2 != 0){
                arrList.remove(j);
                i--;
            }
        }
        arrList.sort(Integer::compareTo);
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + ", ");
        }
    }
}
