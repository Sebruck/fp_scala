def map[A, B](as: List[A])(f: A => B): List[B] =
  as.foldRight(Nil: List[B])((elem, acc) => ::(f(elem), acc))

map(List(1, 2, 3))(_ * 2)