def filter[A](as: List[A])(f: A => Boolean): List[A] = {
  as.flatMap(a =>
    if (f(a))
      ::(a, Nil)
    else
      Nil
  )
}

filter(List(1, 2, 3, 4))(_ % 2 == 0)