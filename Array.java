package Practice2;

public class Array {
	public static void main(String [] args) {
		int a[]= {4,5,8,10,119,12,27};
		int num =10;
		boolean flag=false;
		int index=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				flag=true;
				index=i;
			}
		}
		if(flag==true) {
				System.out.println("The number is present at "+index);
			}
		else {
			System.out.println("The number is not present ");
		}
			
			
	    }
     }


