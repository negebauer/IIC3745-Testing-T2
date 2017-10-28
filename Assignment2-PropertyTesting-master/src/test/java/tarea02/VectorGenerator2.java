package tarea02;

import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.random.*;

public class VectorGenerator2 extends Generator<Vector> {

  public VectorGenerator2() {
    super(Vector.class);
  }

  /**
   * At least for integers, this is straightforward
   * */
  public Vector generate(SourceOfRandomness source, GenerationStatus gStatus) {
    int xn = source.nextInt(-100000000, 100000000);
    int xd = source.nextInt(-100000000, 100000000);
    while (xd == 0) xd = source.nextInt(-100000000, 100000000);
    int yn = source.nextInt(-100000000, 100000000);
    int yd = source.nextInt(-100000000, 100000000);
    while (yd == 0) yd = source.nextInt(-100000000, 100000000);
    int zn = source.nextInt(-100000000, 100000000);
    int zd = source.nextInt(-100000000, 100000000);
    while (zd == 0) zd = source.nextInt(-100000000, 100000000);

    Fraction x = new Fraction(xn, xd);
    Fraction y = new Fraction(yn, yd);
    Fraction z = new Fraction(zn, zd);

    return new Vector(x,y,z);
  }

}
