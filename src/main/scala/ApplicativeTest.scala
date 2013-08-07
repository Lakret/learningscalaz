import scalaz._
import Scalaz._

object ApplicativeTest {
  //type mismatch
  //List(1, 2, 3, 4) map {(_ : Int) * (_ : Int)}
  //can carry to avoid it:
  List(1, 2, 3, 4) map {(_ : Int) * (_ : Int)}.curried
}
