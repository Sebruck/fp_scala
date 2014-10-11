def reverse[A](l: List[A]): List[A] = {
  l.foldLeft(Nil: List[A])((a, b) => ::(b, a))
}

reverse(List(1, 2, 3))