package Test7;

public class Test7 {
    public static void main(String[] args) {

        int count = 0;
        int i = 0;
        while (count <= 100) {
            i++;
            boolean name1 = has4or9(i);
            if (name1) {
                continue;
            } else {
                System.out.println(i);
                count++;
            }
        }
    }

    public static boolean has4or9(int number) {
        while (number > 0) {
            if (number % 10 == 4) {
                return true;
            }
            if (number % 10 == 9) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
