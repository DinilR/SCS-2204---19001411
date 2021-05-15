object book extends App{
  def price(x:Int):Double= {
    var sum: Double = 24.95 * .6 * x + 3;

    if(x > 50){
      sum = sum +  (x - 50) * .75;
    }

    sum = sum - sum % .01;

    return sum;
  }

  println(price(60));


}
