object book extends App{
  def price(x:Int)=x*24.95*0.6+3+(x-50)*0.75;

  println(price(60));


}
