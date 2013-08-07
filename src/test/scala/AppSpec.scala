package lakret.learningscalaz

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class StackSpec extends FlatSpec with ShouldMatchers {
  "A 2 + 2" should "be equal to 4" in {
    (2 + 2) should equal (4)
  }
}
