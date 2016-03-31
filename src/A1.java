
public class A1 {
	
	/** 
	 * @author Marcel Koppensteiner
	 * @since 2016-03-31 
	 * @param n
	 * @return rekursivmethode
	 */
	
	public static int lukasRec (int n) {
		if (n<0) { throw new IllegalArgumentException("fehler"); }
		if (n==0) {
			return 2;
		}
		if (n==1) {
			return 1;
		}
		return lukasRec(n-1) + lukasRec(n-2);
	}
	
	public static int fibonacciArr (int n) {
		int [] arr = new int [n];
		
		if (n<=1) {	return 1; }
		if (n==2) { return 2; }
		if (n<0) { throw new IllegalArgumentException("fehler"); }
		for (int i =1;i<arr.length;i++) {
			 arr [i] = (n-1) + (n-2);
			 n = arr[i];
		} 
		
		
		return n;		
	}
	
	public static long fibonacciRec (int n) {
		if (n<1) {	return 0; }
		if (n>=1 && n <2) { return 1; }
		if (n==2) { return 1;}
		return fibonacciRec(n-1) + fibonacciRec(n-2);
	}
		
	public static void main (String []args) {
		System.out.println("Lukaszahl: " +lukasRec(5));
	//	System.out.println(fibonacciArr(5));
		System.out.println("Fibonaccizahl: " +fibonacciRec(8));
	}

}

