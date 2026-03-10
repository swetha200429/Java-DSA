import java.util.*;
public class ArrayUpdate{
  public static void main(String[] args){
    int[] arr={94,24,75,90,12};
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter index of update:");
    int index=sc.nextInt();
    System.out.println("Enter new value:");
    int value=sc.nextInt();
    arr[index]=value;
    System.out.println("Update array:");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]+" ");
    }
  }
}
