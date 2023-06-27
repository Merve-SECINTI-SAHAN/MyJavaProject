package BTK;

public class Sayi_AsalMi {
    public static void main(String[] args) {

        int number=23;
        int remainder= number%2;
        System.out.println(remainder);
        boolean asalMi=true;

        if (number==1){
            System.out.println("Sayı asal değildir");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz sayı");
        }


        for (int i =2; i <number ; i++) {
            if (number%2==0){
                asalMi=false;
            }
        }
        if (asalMi){
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("Sayı asal değildir");
        }
    }
}
