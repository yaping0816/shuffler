package com.tlglearning.shuffler;

import static org.junit.jupiter.api.Assertions.*;


import java.security.SecureRandom;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffle() {
    int[] data = {3, 1, 4, 1, 5, 9, 2, 6, 5, 4};
    int[] preShuffle = Arrays.copyOf(data, data.length);
    Shuffler shuffler = new Shuffler(new SecureRandom());
    shuffler.shuffle(data);
    System.out.println(Arrays.toString(data));
    assertFalse(Arrays.equals(preShuffle, data));
  }
}