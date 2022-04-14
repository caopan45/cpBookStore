object defDemo {

  def main(args: Array[String]): Unit = {
    def f1(x:Int) = x*x
    val f2 = (x:Int) => x*x
    def f3 = (x:Int) => x*x
    println(f1(2))
    println(f2(2))


  }

}
