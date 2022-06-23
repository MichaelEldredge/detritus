package com.revature.testSuite;

import org.junit.platform.suite.api.SelectClasses;
//import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@SelectClasses({com.revature.calculator.CalculatorTest.class})
//@SelectPackages
@Suite
public class TestSuite {

}
