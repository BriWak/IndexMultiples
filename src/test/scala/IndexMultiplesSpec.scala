import app._
import org.scalatest.{MustMatchers, WordSpec}

class IndexMultiplesSpec extends WordSpec with MustMatchers {

  "IndexMultiples" must {

    "return List(4,9) when given List(2,4,7,9,10)" in {
      IndexMultiples(List(2,4,7,9,10)) mustEqual List(4,9)
    }

    "return List(4,9,15) when given List(2,4,7,9,10,15)" in {
      IndexMultiples(List(2,4,7,9,10,15)) mustEqual List(4,9,15)
    }

    "return List(3,6,12) when given List(2,3,6,12,15,21)" in {
      IndexMultiples(List(2,3,6,12,15,21)) mustEqual List(3,6,12)
    }
    }
  }
