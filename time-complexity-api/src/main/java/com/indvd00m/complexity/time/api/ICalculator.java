package com.indvd00m.complexity.time.api;

import java.util.List;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2016-Dec-20 11:00:06 PM
 *
 */
public interface ICalculator {

	void setTestee(ITestee testee);

	List<IComplexityElement> calculateByTime(long millis);

	List<IComplexityElement> calculateByIterations(long iterationsSize);

}
