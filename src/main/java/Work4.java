import java.util.Random;
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

public class Work4 {
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
        int index2 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0) {
                m2[index2] = j;
                index2++;
            }
        }
        System.out.println("m2 =  " + index2);
    }
}
