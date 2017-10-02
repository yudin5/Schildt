package Chapter_14_New;

interface MyCommonFunc<T> {
    T func(T n);
}

class FactorialLambdaDemo {
    public static void main(String args[])
    {

        // This block lambda computes the factorial of an int value.
        MyCommonFunc<Integer> factorial = (n) ->  {
            int result = 1;

            for(int i=1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factoral of 3 is " + factorial.func(3));
        System.out.println("The factoral of 5 is " + factorial.func(5));
        System.out.println("The factoral of 9 is " + factorial.func(9));
    }
}
