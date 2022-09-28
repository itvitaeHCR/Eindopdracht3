public class Lucas {
    static int LucasSeq(int n) {
        int num1 = 2;
        int num2 = 1;
        int counter = 0;

        if (n > 0) {
            while (counter < n) {
                System.out.print(num1 + " ");

                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;

            }
            System.out.println();
        } else {
            System.out.println("invalid number");
        }
        return n;
    }

}
