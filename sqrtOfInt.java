
public class sqrtOfInt {
	public int mySqrt(int x) {
        if (x < 2)
            return x;
        
        double a = x;
        double b = (a + x / a) / 2.0;
        while (Math.abs(a - b) >= 1) {
            a = b;
            b = (a + x / a) / 2.0;
        }
        
        return (int)b;
    }
}
