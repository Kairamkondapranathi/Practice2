package Practice2;

public class MinMax {
	public static void main(String [] args) {
		int a[]= {20,6,3,12,8,45,9};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The maximum number is "+max);
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The minimum number is "+min);
		
	  }	
  }
		
 
