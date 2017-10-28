package tarea02;

/**
 * A representation of a rational number
 * */
public class Fraction {

  int numerator;
  int denominator;

  /**
   * A' = A.normalized() is such that
   * gcd(A'.numerator, A'.denominator) = 1
   * */
  public Fraction normalized() {
    int gcd = gcd(this.numerator, this.denominator);
    if (gcd == this.numerator) return this;
    return new Fraction(this.numerator / gcd, this.denominator / gcd);
  }

  static int gcd(int a, int b) {
    if(a == 0 || b == 0) return a+b;
    return gcd(b,a%b);
  }

  public Fraction(int numerator, int denominator) {
    if (denominator == 0) {
      this.numerator=0;
      this.denominator=1;
    }
    this.numerator = numerator;
    this.denominator = denominator;
  }

  ////////////~~~ARITHMETIC OPERATORS~~~////////////

  //// Binary operators ////

  /**
   * a + b
   * */
  public static Fraction add(Fraction a, Fraction b) {
    return new Fraction(
      a.numerator*b.denominator + b.numerator*a.denominator,
      a.denominator * b.denominator
      );
  }

  /**
   * a - b
   * */
  public static Fraction sub(Fraction a, Fraction b) {
    return new Fraction(
      a.numerator*b.denominator - b.numerator*a.denominator,
      a.denominator * b.denominator
      );
  }

  /**
   * a x b
   * */
  public static Fraction mul(Fraction a, Fraction b) {
    return new Fraction(
      a.numerator*b.numerator,
      a.denominator * b.denominator
      );
  }

  /**
   * a / b
   * */
  public static Fraction div(Fraction a, Fraction b) {
    Fraction c = new Fraction(b.denominator, b.numerator);
    return mul(a, c);
  }


  //// Unary operators ////

  /**
   * -a
   * */
  public static Fraction neg(Fraction a) {
    return new Fraction(
      -1 * a.numerator,
      a.denominator
      );
  }

  /**
   * 1 / a
   * */
  public static Fraction invMultiplicative(Fraction a) {
    return new Fraction(
      a.denominator,
      a.numerator
      );
  }


  //// 0-ary operators (constants) ////

  /**
   * 1
   * */
  public static Fraction one() {
    return new Fraction(1,1);
  }

  /**
   * 0
   * */
  public static Fraction zero() {
    return new Fraction(
      0,
      1
      );
  }

  ////////////~~~BOOLEAN OPERATORS~~~////////////

  /**
   * a == b
   * */
  public static boolean equals(Fraction a, Fraction b) {
    Fraction na = a.normalized();
    Fraction nb = b.normalized();
    return na.numerator == nb.numerator && na.denominator == nb.denominator;
  }

  /**
   * a > b
   * */
  public static boolean gThan(Fraction a, Fraction b) {
    return a.numerator/a.denominator > b.numerator/b.denominator;
  }

  /**
   * a < b
   * */
  public static boolean lThan(Fraction a, Fraction b) {
    return !gThan(a,b);
  }
}
