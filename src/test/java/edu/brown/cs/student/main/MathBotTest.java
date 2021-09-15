package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathBotTest {

  @Test
  public void testAddition() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.5, 3);
    assertEquals(13.5, output, 0.01);
  }

  @Test
  public void testAdditionwithLargerNumbers() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100000, 200303);
    assertEquals(300303, output, 0.01);
  }

  @Test
  public void testAdditionwithNegativeNumbers() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.add(-100000, -200303);
    assertEquals(-300303, output, 0.01);
  }

  @Test
  public void testAdditionwithPosNegNumbers() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.add(3456, -200303);
    assertEquals(-196847, output, 0.01);
  }

  @Test
  public void testSubtraction() {
    MathBot matherator9004 = new MathBot();
    double output = matherator9004.subtract(18, 17);
    assertEquals(1, output, 0.01);
  }

  @Test
  public void testSubtractionwithLargerNumbers() {
    MathBot matherator9005 = new MathBot();
    double output = matherator9005.subtract(18972, 20098);
    assertEquals(-1126, output, 0.01);
  }

  @Test
  public void testSubtractionwithPosNegNumbers() {
    MathBot matherator9006 = new MathBot();
    double output = matherator9006.subtract(-194, 245);
    assertEquals(-439, output, 0.01);
  }

  @Test
  public void testSubtractionwithNegNumbers() {
    MathBot matherator9007 = new MathBot();
    double output = matherator9007.subtract(-1128, 523);
    assertEquals(-1651, output, 0.01);
  }

  //how do you do error checking in testing?
  @Test
  public void testSubError() {
    MathBot matherator9008 = new MathBot();
    double output = matherator9008.subtract(10, 523);
    assertEquals(-513, output, 0.01);
  }

}
