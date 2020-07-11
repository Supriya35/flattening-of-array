2D array into 1D array
----------------------------------------------------------




public class Main
{
	public static void main(String[] args) {
     int a[][]={{1,3,5},{4,6,7},{7,8,9}};
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){
             System.out.print(a[i][j]+"\t");
         }
         System.out.println();
         
     }
     System.out.println();//new online
     
     int l=a.length;
     int b[]=new int[l];
     int c=0;
     for(int k=0;k<a.length;k++,c++){
        // System.out.println("Value of K:- "+k);
         for(int m=0;m<a[k].length;m++){
          //   System.out.println("value of C:- "+c);
             b[c]=a[k][m];
             
             System.out.print(b[c]+"\t");
             
         }
     }
   }
}
