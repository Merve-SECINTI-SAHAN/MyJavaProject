package BTK;

public class SAyi_Bulma {
    public static void main(String[] args) {
        int[] sayilar= new int[]{1,2,5,7,9,0};
        int aranan=56;
        boolean varMi =false;


        for (int w : sayilar) {
            if (w ==aranan){
                varMi=true;
                break;
            }

        } if (varMi) {
            System.out.println("Sayı mevcuttur");
        } else {
            System.out.println("Sayı mevcut değildir");
        }
    }
}
