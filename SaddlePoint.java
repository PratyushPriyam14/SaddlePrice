import java.io.*;
import java.util.*;
public class SaddlePoint
{
    public static void main(String []args)throws Exception{
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++) {  //this loop is for finding minimum value in rows
            int svj = 0;  //suppose that minimum value is at 0 index and the we will compare every value of row with this value
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][svj]) {
                    svj = j;
                }
            }
            boolean flag = true;  //this means when we get minimum value of row then next step is that to whether that value is maximum in col or no
            //loop for column
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][svj]>arr[i][svj]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println(arr[i][svj]);
                return;
            }
        }System.out.println("invalid input");
    }
}
