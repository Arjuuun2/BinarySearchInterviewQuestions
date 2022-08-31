import java.io.*;
import java.util.*;

//Amazon interview Question

public class InfiniteArrayPosition {
//Q:find position of an element in a sorted array of infinite numbers
	//question can come to your mind is how can you create an infinite array
	//in this question we are just assuming that the array is inifinite
	//Logic: we first set start and end in first of zero and 1st position and check
	//target is present in the given position and increment end value by double the position
	//until the target value is present in the given range
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int start=0;
		int end=1;
		int[] arr=new int[end];
		System.out.println("enter the array");
		
		for(int i=0;i<end;i++) {
			arr[i]=in.nextInt();
		}
		
		System.out.println("enter the target");
		int target=in.nextInt();
		
		findtarget(arr,target,start,end);

	}
	
	

	//creating function to find the range of the target value
	
	public static int findtarget(int[] arr,int target,int start,int end) {
		 
		 
		 while(target>arr[end]) {
			int temp =end+1;//this is new start
			int newend=end+(end-start+1)*2;//double the end size previous end +sizeofbox *2
			start=temp;
		 }
		 return search(arr,target,start,end);
		 
	}
	
	public static int search(int[] arr,int target,int start,int end) {
		int mid=start+(end-start)/2;
		
		while(start<=end) {
			if(target>arr[mid]) {
				start=mid+1;
			}else if(target<arr[mid]){
				end=mid-1;
			}else {
				return mid;
			}
			
		}return -1;
		
	
	}

}
