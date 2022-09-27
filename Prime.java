//1st methord
public class Prime
{
    public static void main(String[] args) {

        int num = 3;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
          // condition for nonprime number
          if (num % i == 0) {
            flag = true;
            break;
          }
        }
        if (!flag)
          System.out.println(num + " is a prime number.");
        else
          System.out.println(num + " is not a prime number.");
      }
}

/*
//2nd methord
public class Prime {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}

//3rd methord
public class Prime {

  public static void main(String[] args) {

    int num = 33, i = 2;
    boolean flag = false;
    while (i <= num / 2) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
 */