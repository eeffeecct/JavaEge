// its mine real variant 07/06/24
public class Ege {
    public static void main(String[] args) {
        Binary bin = new Binary();
        NumSum summa = new NumSum();

        for (int n = 1; n < 1000; n++) {
            String r = bin.toBinary(n);
            int n1 = Integer.parseInt(r);

            if (summa.Sum(n1) % 2 == 0) {
                r += '0';
                r = r.substring(2);
                r = "10" + r;
            } else {
                r += '1';
                r = r.substring(2);
                r = "11" + r;
            }
            int decimalValue = Integer.parseInt(r, 2);
            if (decimalValue > 50) {
                System.out.println(n);
                break;
            }
        }
    }
}

class NumSum {
    public int Sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

class Binary {
    public String toBinary(int n) {
        String s = "";
        while (n > 0) {
            s = n % 2 + s;
            n = n / 2;
        }
        return s;
    }
}

