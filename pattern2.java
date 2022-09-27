public class pattern2 {
    public static void main(String[] args)
   {
      int row=4;
      char num='*';
      
      for(int i=0; i<row; i++)
      {
         for(int j=0; j<=i; j++)
            System.out.print(num+ " ");
         System.out.print("\n");
      }
   }
}
