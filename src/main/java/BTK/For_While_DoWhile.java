package BTK;

public class For_While_DoWhile {
    public static void main(String[] args) {
        //for
        System.out.println("for");
        for (int i=1; i<=10; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        //while
        System.out.println("while");
        int i=1;
        while (i<10){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //do-while
        System.out.println("do-while");
        int j=1;
        do {
            System.out.print(j+ " ");
            j+=2;
        }while (j<10);
    }
}
