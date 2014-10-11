import scala.annotation.tailrec

def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

  def isOrdered(n: Int): Boolean = {
    if (n < 1) {
      true
    } else {
      ordered(as.apply(n -1), as.apply(n))
    }
  }

  @tailrec
  def loop(curr: Int): Boolean = {
    if (curr == as.length) {
      true
    } else if (!isOrdered(curr)) {
      false
    } else {
      loop(curr + 1)
    }
  }

  loop(0)
}

def ordered(a: Int, b: Int): Boolean = a <= b


isSorted(Array(1, 2, 3, 4, 5), ordered)
isSorted(Array(1, 2, 3, 6, 5), ordered)
isSorted(Array(1, 2, 3, 5, 5), ordered)
