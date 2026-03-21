public class LoopingStatements {
    public static void main(String[] args) {

        //  FOR LOOP
        System.out.println("For Loop:");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //  WHILE LOOP
        System.out.println("\nWhile Loop:");
        int j = 1;
        while(j <= 5) {
            System.out.println(j);
            j++;
        }

        //  DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while(k <= 5);

        //  NESTED LOOP
        System.out.println("\nNested Loop:");
        for(int i = 1; i <= 3; i++) {
            for(int m = 1; m <= 3; m++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
