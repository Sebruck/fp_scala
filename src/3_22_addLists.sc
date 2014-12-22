def addLists(l1: List[Int], l2: List[Int]) = {
  def getElemOfList[A](l: List[A], n: Int): A = {
    if (n == 0)
      l.head
    else
      getElemOfList(l.tail, n - 1)
  }
  var i = 0
  l1.foldLeft(Nil: List[Int])((acc, elem1) => {
    val elem2 = getElemOfList(l2, i)
    println(s"$elem1 + $elem2")
    i += 1
    ::(elem1 + elem2, acc)
  }).reverse
}
addLists(List(1, 2, 3), List(4, 5, 6))

