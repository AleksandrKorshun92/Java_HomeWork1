import java.util.Random;
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class Work2 {
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
        System.out.println("Номер старшего значащего бита n =  " + n);
    }
}
