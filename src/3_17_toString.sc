def toString(l: List[Double]): List[String] =
  l.foldRight(Nil: List[String])((elem, acc) => ::(elem.toString, acc))

toString(List(1.0, 2.0, 3.0, 4.1))