import java.io.*;
import java.util.*;

//Q1:find the element which is greater than or equal to the target element
//given array will be in sorted.
//if the array given is in sorted. then it is 90% binary search problem
//to solve this problem
//step 1:find the target element(which will be input by the user).
//step 2:find all the elements which are greater than or equal to target elment.
//step 3:find the smallest element from the newely created list.

//Main logic:we are giving start<=end, when the while loop breaks start will be
//greater than end.
//at the end of the while loop start =end +1
public class CielingOfNum {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the length of the array");
		int len=in.nextInt();
		
		int[] arr=new int[len];
		
		System.out.println("enter the array elements in sorted oder");

		for(int i=0;i<len;i++) 
		{
			arr[i]=in.nextInt();
		}
		
		System.out.println("enter the target element");
		int target=in.nextInt();
		
		int start=0;
		int end=arr.length-1;
		
		System.out.println(cieling(arr,target,0,end));
		
	}

	  public static int cieling(int[] arr,int target,int s, int e) {
		  
		  int mid=(s+(e-s)/2);
		  
		  if(s>e) {
			  return s;
		  }
		  if(target==arr[mid]) {
			  return arr[mid];
		  }
		if(target<arr[mid]) {
			return cieling(arr,target,s,mid-1);
		}else {
			return cieling(arr,target,mid+1,e);
		}
		  
		   
	  }
	
}
