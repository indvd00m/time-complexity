package com.indvd00m.complexity.time.api;

import java.util.List;

/**
 * @author indvd00m (gotoindvdum[at]gmail[dot]com)
 * @date 2016-Dec-20 10:59:59 PM
 *
 */
public interface IAnalyzer {

	List<IComplexityElement> normalize(List<IComplexityElement> baseComplexity, int newSize);

}