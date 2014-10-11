def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
  as match {
    case Nil => z
    case ::(x, xs) => f(x, foldRight(xs, z)(f))
  }
}
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
foldLeft(List(1, 2, 3), 0)(_ + _)
