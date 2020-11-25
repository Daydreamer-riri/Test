package Test2;

public class fraction {
    int numerator;
    int denominator;

    public fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0)
            this.denominator = denominator;
        else
            System.out.println("分母不为0");
    }

    private int GCD() {
        int a = numerator;
        int b = denominator;
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public fraction simplification() {
        int gcd = this.GCD();
        this.numerator /= gcd;
        this.denominator /= gcd;
        return this;
    }

    public fraction addition(fraction newfraction) {
        return new fraction(this.numerator * newfraction.denominator
                + newfraction.numerator * this.denominator, this.denominator
                * newfraction.denominator).simplification();
    }

    public fraction subtraction(fraction newfraction) {
        return new fraction(this.numerator * newfraction.denominator
                - newfraction.numerator * this.denominator, this.denominator
                * newfraction.denominator).simplification();
    }

    public fraction multiplication(fraction newfraction) {
        return new fraction(this.numerator * newfraction.numerator,
                this.denominator * newfraction.denominator).simplification();
    }

    public fraction division(fraction newfraction) {
        return new fraction(this.numerator * newfraction.denominator,
                this.denominator * newfraction.numerator).simplification();
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}


