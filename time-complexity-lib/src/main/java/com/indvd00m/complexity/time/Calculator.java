package com.indvd00m.complexity.time;

import java.util.ArrayList;
import java.util.List;

import com.indvd00m.complexity.time.api.ICalculator;
import com.indvd00m.complexity.time.api.IComplexityElement;
import com.indvd00m.complexity.time.api.ITestee;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2016-Dec-20 11:01:03 PM
 *
 */
public class Calculator implements ICalculator {

	ITestee testee;

	public Calculator() {

	}

	public Calculator(ITestee testee) {
		setTestee(testee);
	}

	@Override
	public void setTestee(ITestee testee) {
		this.testee = testee;
	}

	@Override
	public List<IComplexityElement> calculateByTime(long millis) {
		List<IComplexityElement> complexity = new ArrayList<IComplexityElement>();

		long nanos = millis * 1000000l;
		long started = System.nanoTime();
		long iterationStarted = started;
		while (iterationStarted - started < nanos) {
			iterationStarted = System.nanoTime();
			long dataSize = testee.testData();
			long operationTime = System.nanoTime() - iterationStarted;

			IComplexityElement cv = new ComplexityElement(dataSize, operationTime);
			complexity.add(cv);
		}

		return complexity;
	}

	@Override
	public List<IComplexityElement> calculateByIterations(long iterationsSize) {
		List<IComplexityElement> complexity = new ArrayList<IComplexityElement>();

		for (long l = 0; l < iterationsSize; l++) {
			long iterationStarted = System.nanoTime();
			long dataSize = testee.testData();
			long operationTime = System.nanoTime() - iterationStarted;

			IComplexityElement cv = new ComplexityElement(dataSize, operationTime);
			complexity.add(cv);
		}

		return complexity;
	}

}
