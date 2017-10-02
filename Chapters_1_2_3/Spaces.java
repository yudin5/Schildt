package Chapters_1_2_3;

// Count spaces.
class Spaces {
    public static void main(String args[]) throws java.io.IOException {

        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");

        do {
            ch = (char) System.in.read();
            if(ch == ' ') spaces++;
        } while(ch != '.');

        System.out.println("Chapters_1_2_3.Spaces: " + spaces);
    }
}