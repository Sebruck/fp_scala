def setHead[A](newHead: A, l: List[A]): List[A] = l match {
  case Nil => newHead +: Nil
  case head :: tail  => newHead +: tail
}

setHead("newhead", List("oldhead", "tail"))
setHead("newhead", Nil)
