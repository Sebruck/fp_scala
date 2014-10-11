def append[A](l: List[A], x: A): List[A] = {
  l.foldRight(List(x))((a, b) => ::(a, b))
}
append(List(1, 2), 3)
