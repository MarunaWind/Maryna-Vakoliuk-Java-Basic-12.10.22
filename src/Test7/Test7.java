package Test7;

public class Test7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            if (i==4||i==9){
                continue;
            }
            int n = i*10;

            for (int j = 0; j < 10; j++) {
                if (j==4||j==9||(i==0&&j==0)){
                    continue;
                }
                if(i==10&&j==1){
                    break;
                }
                System.out.println(n+j);


            }

        }
    }
}
