package Practice2;

public class MissingNumber {
	public static void main(String [] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		
			int sum2=0;
			for(int i=0;i<=15;i++) {
				sum2=sum2+i;
			}
			
			
			System.out.println("The missing number is " +(sum2-sum1));
				
			
		}
	}


