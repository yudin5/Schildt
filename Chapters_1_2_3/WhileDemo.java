package Chapters_1_2_3;// Demonstrate the while loop.

class WhileDemo {
    public static void main(String args[]) {
        // ??????? ??? ???????

        char ch = Character.MIN_VALUE;
        int count = 0;

            while(ch < Character.MAX_VALUE) {
                System.out.print(ch + " ");
                ch++;
                count++;
                if (count % 100 == 0) System.out.println();
            }

        System.out.println();
        System.out.println(count);
    }
}