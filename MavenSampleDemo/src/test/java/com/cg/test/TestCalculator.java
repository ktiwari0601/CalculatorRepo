package com.cg.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.beans.Calculator;


public class TestCalculator
{
  @Test
  public void test_add(){
	  Calculator calc=new Calculator();
	  int res = calc.add(3, 4);
	  Assert.assertEquals(7, res);
  }
  @Test
  public void test_subtract()
  {
	  Calculator calc=new Calculator();
	  int res = calc.subtract(5, 4);
	  Assert.assertEquals(1, res);
  }
  @Test
  public void test_multiply()
  {
	  Calculator calc=new Calculator();
	  int res = calc.multiply(5, 4);
	  Assert.assertEquals(20, res);
  }
  @Test
  public void test_square()
  {
	  Calculator calc=new Calculator();
	  int res = calc.calcSquare(5);
	  Assert.assertEquals(25, res);
  }
 }
