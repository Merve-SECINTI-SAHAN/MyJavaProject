package BTK;
import java.util.Arrays;
public class Arrays_03 {
    public static void main(String[] args) {

        String[][] sehir = new String[3][3];
        
        sehir[0][0] = "İstanbul";
        sehir[0][1] = "Bursa";
        sehir[0][2] = "Bilecik";
        sehir[1][0] = "Ankara";
        sehir[1][1] = "Konya";
        sehir[1][2] = "Kayseri";
        sehir[2][0] = "Gaziantep";
        sehir[2][1] = "Diyarbakır";
        sehir[2][2] = "Şanlıurfa";

        for (int i = 0; i <=2; i++) {
            System.out.println("-------------------");

            for (int j = 0; j <=2; j++) {

                System.out.println(sehir[i][j]);
                
            }
        }
    }
   
}
