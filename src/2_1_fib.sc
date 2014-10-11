import scala.annotation.tailrec

// 0 1 1 2 3 5 8

def fib(target: Int): Long = {
  @tailrec
  def loop(current: Int, prev: Tuple2[Long, Long]): Long = {
    if (current == target) {
      prev._1 + prev._2
    } else {
      loop(current + 1, (prev._2, prev._1 + prev._2))
    }
  }

  target match {
    case 0 => 0
    case 1 => 0
    case 2 => 1
    case _ => loop(3, (0, 1))
  }
}

fib(1)
fib(2)
fib(3)
fib(4)
fib(5)

