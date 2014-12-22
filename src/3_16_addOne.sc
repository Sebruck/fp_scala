def addOne(l: List[Int]) =
  l.foldRight(Nil: List[Int])((elem, acc) => ::(elem + 1, acc))


addOne(List(1, 2, 3))