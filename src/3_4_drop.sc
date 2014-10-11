def drop[A](l: List[A], n: Int): List[A] = l match {
  case Nil => Nil
  case head :: tail =>  if(n < 1) {
    head +: tail
  } else {
    drop(tail, n - 1)
  }
}

drop(List(1,2,3,4), 1)
drop(List(1,2,3,4), 2)
drop(List(1,2,3,4), 3)
drop(List(1,2,3,4), 4)
drop(List(1,2,3,4), 5)
drop(List(1,2,3,4), -1)
drop(Nil, 3)
drop(List(1), 3)
