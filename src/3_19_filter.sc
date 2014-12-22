def filter[A](as: List[A])(f: A => Boolean): List[A] = {
  as.foldRight(Nil: List[A])((elem, acc) =>
    if (f(elem))
      ::(elem, acc)
    else
      acc
  )
}

filter(List(1, 2, 3, 4))(_ % 2 == 0)