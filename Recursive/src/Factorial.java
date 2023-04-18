import java.math.*;

public class Factorial {
    public static void main(String[] args) {
        BigInteger y = fact(new BigInteger("1000"));
        System.out.println(y);
    }

    public static BigInteger fact (BigInteger x){
        if(x.equals(BigInteger.ONE)) return BigInteger.ONE;
        else x = x.multiply(fact(x.subtract(BigInteger.ONE)));
        return x;
    }
}
