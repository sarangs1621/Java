public class pattern3 {
    public static void main(String[] args)
   {
      int r=4, x;
      char num='*'; 
      x = (r*2) - 2;
      
      for(int i=0; i<r; i++)
      {
         for(int y=0; y<x; y++)
            System.out.print(" ");
         for(int j=0; j<=i; j++)
            System.out.print(num+ " ");
         System.out.print("\n");
         x = x-2;
      }
   }
}
