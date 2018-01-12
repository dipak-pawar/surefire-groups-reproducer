package org.category.reproducer;

import org.category.A;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(A.class)
public class HelloWorldTest {

   @Test
   public void should_pass() {
      Assert.assertTrue(true);
   }

}
