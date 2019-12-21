import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import TheSource._

class TheSourceSpec extends AnyFlatSpec with Matchers {

  behavior of "getHello in TheSource"

  it should "return a String that is non-empty" in {
      getHello should not be (empty)
  }

  it should "return a String that ends with 'lo'" in {
    getHello should endWith("lo")
  }

  behavior of "getTwoNumbers in TheSource"
  it should "return a list with any 2 numbers" in {
    val numbers = getTwoNumbers
    numbers should have size 2
    numbers foreach { number =>
      number.toString should fullyMatch regex """\d+"""
    }
  }

  behavior of "add in TheSource"
  it should "return the sum as 4 for the numbers provided as input" in {
    add(List(2, 2)) shouldEqual(4)
  }
}
