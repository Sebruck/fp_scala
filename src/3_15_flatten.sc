def flatten[A](l: List[List[A]]): List[A] = {
  l.foldRight(Nil: List[A])((curr, acc) => {
    curr.foldRight(acc)((elem, innerAcc) => {
      ::(elem, innerAcc)
    })
  })
}

flatten(List(List(1, 2), List(3, 4), List(5), List(6, 7, 8)))

