package tarea02;

import com.pholser.junit.quickcheck.generator.*;
import com.pholser.junit.quickcheck.random.*;

public class FractionGenerator extends Generator<Fraction> {
	
	public FractionGenerator() {
		super(Fraction.class);
	}
	
	/**
	 * At least for integers, this is straightforward
	 * */
	public Fraction generate(SourceOfRandomness source, GenerationStatus gStatus) {
		int numerator = source.nextInt(-100000000, 100000000);
		int denominator = source.nextInt(-100000000, 100000000);
		while (denominator == 0) {
			source.nextInt(-100000000, 100000000);
		}
		return new Fraction(numerator, denominator);
	}

}
