def init[A](l: List[A]): List[A] = {
  def loop(acc: List[A], curr: List[A]): List[A] = {
    curr match {
      case Nil => Nil
      case head :: Nil => acc
      case head :: tail => loop(acc ++ List(head), tail)
    }
  }

  loop(List(), l)
}

init(List(1,2,3,4,5))
