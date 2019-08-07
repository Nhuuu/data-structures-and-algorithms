package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

  @Test
  public void testArrayShift() {
    int[] inputArr = new int[]{2,4,6,8};
    int[] outputArr = new int[]{2,4,5,6,8};
    assertArrayEquals(outputArr, ArrayShift.insertShiftArray(inputArr, 5));
  }

  @Test
  public void testArrayShift2() {
    int[] inputArr2 = new int[]{4,8,15,23,42};
    int[] outputArr2 = new int[]{4,8,16,15,23,42};
    assertArrayEquals(outputArr2, ArrayShift.insertShiftArray(inputArr2, 16));
  }
}