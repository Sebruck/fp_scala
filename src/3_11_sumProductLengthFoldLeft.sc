def sum(l: List[Int]): Int = l.foldLeft(0)(_ + _)
sum(List(1, 2, 3, 4))

def product(l : List[Int]): Int = l.foldLeft(1)(_ * _)
product(List(1, 2, 3, 4))

def length[A](as: List[A]): Int = as.foldLeft(0)((a, b) => a + 1)
length(List(1, 2, 3, 4))