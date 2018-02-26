package app

object IndexMultiples extends App{

  def apply(input : List[Int]) : List[Int] = {

    input.map(i => if (input.indexOf(i) != 0 && i % input.indexOf(i) == 0) i else 0).filter(_ != 0)

  }

}
