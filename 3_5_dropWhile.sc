def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
  case Nil => Nil
  case head :: tail =>
    if (f(head)) {
      dropWhile(tail, f)
    } else {
      head +: tail
    }
}

dropWhile(List(1, 3, 4, 5, 3, 2), (a : Int) => a < 5)
