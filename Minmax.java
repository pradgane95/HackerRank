import java.util.Arrays;

public class Minmax {
	
	public void find(int arr[]) {
		Arrays.sort(arr);
		long minsum=0;
		long maxsum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++) {
			minsum = minsum+arr[i];
		}
		for(int i=(arr.length-1);i>0;i--) {
			maxsum = maxsum+arr[i];
		}
		System.out.println(minsum+"  "+maxsum);
	}
	public static void main(String ...args) {
		Minmax mm = new Minmax();
		int a[]= {2,1,4,8,9};
		mm.find(a);
		
	}

}
