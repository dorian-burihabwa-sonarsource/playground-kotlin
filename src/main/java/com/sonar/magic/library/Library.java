package com.sonar.magic.library;

import java.math.BigInteger;

public class Library {
  private Library() {
    // Do not use
  }
  @Deprecated
  /**
   * @deprecated use {@link BigInteger.sum}
   */
  public static BigInteger add(Long a, Long b) {
    return BigInteger.valueOf(a).add(BigInteger.valueOf(b));
  }

  public static BigInteger sum(Long a, Long b) {
    return BigInteger.valueOf(a).add(BigInteger.valueOf(b));
  }
}
