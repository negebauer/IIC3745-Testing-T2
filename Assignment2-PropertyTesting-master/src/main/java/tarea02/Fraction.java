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
    //TODO stub
    return null;
  }

  /**
   * a - b
   * */
  public static Fraction sub(Fraction a, Fraction b) {
    //TODO stub
    return null;
  }

  /**
   * a x b
   * */
  public static Fraction mul(Fraction a, Fraction b) {
    //TODO stub
    return null;
  }

  /**
   * a / b
   * */
  public static Fraction div(Fraction a, Fraction b) {
    //TODO stub
    return null;
  }


  //// Unary operators ////

  /**
   * -a
   * */
  public static Fraction neg(Fraction a) {
    //TODO stub
    return null;
  }

  /**
   * 1 / a
   * */
  public static Fraction invMultiplicative(Fraction a) {
    //TODO stub
    return null;
  }


  //// 0-ary operators (constants) ////

  /**
   * 1
   * */
  public static Fraction one() {
    //TODO stub
    return null;
  }

  /**
   * 0
   * */
  public static Fraction zero() {
    //TODO stub
    return null;
  }

  ////////////~~~BOOLEAN OPERATORS~~~////////////

  /**
   * a == b
   * */
  public static boolean equals(Fraction a, Fraction b) {
    //TODO stub
    return false;
  }

  /**
   * a > b
   * */
  public static boolean gThan(Fraction a, Fraction b) {
    //TODO stub
    return false;
  }

  /**
   * a < b
   * */
  public static boolean lThan(Fraction a, Fraction b) {
    //TODO stub
    return false;
  }
}
