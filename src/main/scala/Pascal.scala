object Pascal {

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()

    }
  }

  def pascal(c: Int, r: Int): Int = {
    if (c ==0) 1
    else if (c == r ) 1
    else {
      val intermediate = for (col <- c - 1 to c) yield pascal(col, r - 1)
      intermediate.sum
    }
  }
}
