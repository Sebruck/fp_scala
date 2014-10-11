def foldLeft[A, B](as: List[A], z: B)(f: (B, A) => B): B = {
  def loop(acc: B, l: List[A]): B = {
    l match {
      case Nil => acc
      case x :: xs =>
        loop(f(acc, x), xs)
    }
  }
  loop(z, as)
}

def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
  foldLeft(as, z)((b, a) => f(a, b))

def foldRight2[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
  def loop(acc: B, l: List[A]): B = {
    l match {
      case Nil => acc
      case x :: xs =>
        loop(f(x, acc), xs)
    }
  }
  loop(z, as)
}
def foldLeft2[A, B](as: List[A], z: B)(f: (B, A) => B): B =
  foldRight2(as, z)((a, b) => f(b, a))
foldLeft(List(1, 2, 3), "")(_ + _.toString)
foldRight(List(1, 2, 3), "")(_.toString + _)
foldLeft2(List(1, 2, 3), "")(_ + _.toString)
foldRight2(List(1, 2, 3), "")(_.toString + _)
