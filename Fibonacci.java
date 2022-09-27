//1st methord
public class Fibonacci {
    public static void main(String[] args) {
  
        int count = 10, n1 = 0, n2 = 1;
           
        for (int i = 1; i <= count; ++i) {
          System.out.print(n1 + ", ");
    
          int n3 = n1 + n2;
          n1 = n2;
          n2 = n3;
        }
      }
    }
/*
//2nd methord
public class Fibonacci {

  public static void main(String[] args) {

    int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}

//3rd methord
public class Fibonacci {

  public static void main(String[] args) {

    int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    while (i <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      i++;
    }
  }
}

//4th methord
public class Fibonacci {

  public static void main(String[] args) {

    int n = 100, firstTerm = 0, secondTerm = 1;
        
    System.out.println("Fibonacci Series Upto " + n + ": ");
    
    while (firstTerm <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
  }
}
*/