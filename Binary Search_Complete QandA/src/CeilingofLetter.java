import java.io.*;
import java.util.*;


public class CeilingofLetter {
//In this program we have to print the the cieling of a letter it can be found on leetcode
	///it is like cieling of a number but the difference is 
	public static void main(String[] args) {
		char[] arr= {'a','b','c','e'};
		
		char target='d';
		
		int ans=search(arr,target);
System.out.println(ans);
	}
 
	public static int search(char[] arr,char target) {
		 int s=0;
		 int e=arr.length-1;
		int mid=(s+(e-s))/2; 
		
		while(s<=e) {
			
		
		if(target>arr[mid]) {
			s=mid+1;
		}if(target<arr[mid]) {
			 e=mid-1;
		}
		}
		return arr[s%arr.length];
	}
	
	
	
}
