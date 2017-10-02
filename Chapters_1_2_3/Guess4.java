package Chapters_1_2_3;

// Guess the letter game, 4th version.
class Guess4 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");

            // Считываем символ
            ch = (char) System.in.read();

            // Игнорируем все остальные введенные символы
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');

            if(ch == answer) System.out.println("** Right **");
            else {
                System.out.print("...Sorry, you're ");
                if(ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while(answer != ch);
    }
}