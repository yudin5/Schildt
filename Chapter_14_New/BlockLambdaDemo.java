package Chapter_14_New;

// A block lambda that finds the smallest positive factor
// of an int value.

interface NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String args[])
    {

        // This block lambda returns the smallest positive factor of a value.
        NumericFunc smallestF = (n) ->  {
            int result = 1;

            // Get absolute value of n.
            n =  n < 0 ? -n : n;

            for(int i=2; i <= n/i; i++)
                if((n % i) == 0) {
                    result = i;
                    break;
                }

            return result;
        };

        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));
        System.out.println("Smallest factor of 115207 is " + smallestF.func(115207));
    }
}
