def length[A](as: List[A]): Int =
  as.foldRight(0)((a, b) => b + 1)

length(List("a", "b"))
length(Nil)
