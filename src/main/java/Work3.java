import java.util.Random;
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

public class Work3 {
    public static void main(String[] args) {
        int a = 2000;
        int i = new Random().nextInt(a);
        System.out.println(i);
        int n = 0;
        int temp = i;
        while(temp != 0) {
            temp = temp >> 1;
            n++;
        }
        int[] m1 = new int[Short.MAX_VALUE-i];
        int[] m2 = new int[i - Short.MIN_VALUE];
        int index1 = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[index1] = j;
                index1++;
            }
        }
        System.out.println("m1 =  " + index1);
    }
}
