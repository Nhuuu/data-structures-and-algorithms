package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

  @Test
  public void sort() {
    int[] arr = new int[]{8,7,3,9,1};
    int[] expected = new int[]{1,3,7,8,9};
    assertArrayEquals(expected, InsertionSort.sort(arr));
  }

  @Test
  public void sort_emptyarray() {
    int[] arr = new int[]{};
    int[] expected = new int[]{};
    assertArrayEquals(expected, InsertionSort.sort(arr));
  }
}