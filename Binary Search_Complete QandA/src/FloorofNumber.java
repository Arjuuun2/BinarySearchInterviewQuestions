import java.io.*;
import java.util.*;

public class FloorofNumber {
//program to print floor of a number. It is opposite to cieling of a number.
	//program to find the largest number which is equal or less than the target element
	//in an array
	////Logic of the program if(start>end) then return end
	////other part is like binarysearch
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
      System.out.println("enter the length of the array");
      int len=input.nextInt();
      System.out.println("enter the array elements in order");
      int[] arr=new int[len];
      for(int i=0;i<len;i++) {
    	  arr[i]=input.nextInt();
      }
      System.out.println("enter the target element");
      int target=input.nextInt();
      int s=0;
      int e=arr.length;
     int ans=floorElement(arr,target,s,e);
     System.out.println(ans);
	}
    
	public static int floorElement(int[] arr,int target,int s,int e) {
		int mid=(s+(e-s)/2);
		if(s>e) {
			return e;
		}
		if(target==arr[mid]) {
			return arr[mid];
		}
		if(target>arr[mid]) {
			return floorElement(arr,target,mid+1,e);
		}
		return floorElement(arr,target,s,mid-1);
	}
}
