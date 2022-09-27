//1st methord
public class Factorial {
    public static void main(String[] args) {

        int num = 5;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
/*
//2nd methord
public class Factorial {
    public static void main(String[] args) {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }    
}

//3rd methord
public class Factorial {

    public static void main(String[] args) {

        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

//4th methord
public class Factorial {

    public static void main(String[] args) {

        int num = 5, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

//5th methord
public class Factorial{
    public static void main(String[] args) {
        int num = 6;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
*/