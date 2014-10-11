def tail[A](x: List[A]): List[A] = x match {
  case Nil => Nil
  case head :: tail => tail
}

tail(List(1, 2, 3))
tail(Nil)