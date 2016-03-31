import junit.Assert;

public class Check1 {
	
	public static void beiweiseZusammenhang (int n) {
		double alpha = (1+ Math.sqrt(5))/2;
		double betha = (1-(Math.sqrt(5)))/2;
		betha = betha*(-1);
		double formel = alpha^n + betha^n;
		Object o = A1.lukasRec(10);
		Assert.assertEquals(expected, actual);
	}

}
