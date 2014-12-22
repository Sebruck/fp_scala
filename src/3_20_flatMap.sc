def flatMap[A, B](as: List[A])(f: A => List[B]): List[B] = {
  as.foldRight(Nil: List[B])((elem, acc) => {
    f(elem).foldRight(acc)(::(_, _))
  })
}

flatMap(List(1, 2, 3))(i => List(i, i))