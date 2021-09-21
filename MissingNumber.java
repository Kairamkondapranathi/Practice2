package Practice2;

public class MissingNumber {
	public static void main(String [] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		for(int i=0;i<a.length;i++) {
				if(a[i]!=a[i+1]-1) {
					System.out.println("The missing number is "+(a[i]+1));
				}
			}
		}
	}


