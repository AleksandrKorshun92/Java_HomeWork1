import java.util.Random;
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
public class Work1 {
    public static void main(String[] args) {
        int a = 2000;
        int i = new Random().nextInt(a);
        System.out.println(i);
    }
}
