
import java.util.*;

public class SelectionSort 
{
public static void selectionSort(int arr [])
{
 int last = arr.length-1;
 int maxPos; 
 int temp;
 while(last > 0){
    maxPos =0;
    for(int count = 0; count<=last; count++)
    {
       if(arr[count] > arr[maxPos])
       {
          maxPos = count;
       }
    }
    temp = arr[last];
    arr[last] = arr[maxPos];
    arr[maxPos] = temp;
    last--;
 }
}
 
public static void main(String args[]) 
{
 Scanner scan = new Scanner(System.in);
 System.out.print("How big is your array? ");
 int size = scan.nextInt();
 int a [] = new int [size];
 for(int i = 0; i < a.length; i++)
{
 System.out.print("Enter your next value: ");
 a[i] = scan.nextInt();
}
System.out.println("Here is your unsorted array as entered:");
 for(int i = 0; i < a.length; i++)
{
 System.out.print(a[i] + " ");
}
 System.out.println();
 selectionSort(a); // since arrays are objects, a is returned in sorted order
 System.out.println("Here is your array sorted using selection sort:");
 for(int i = 0; i < a.length; i++)
{
 System.out.print(a[i] + " ");
}
System.out.println();
}
}

