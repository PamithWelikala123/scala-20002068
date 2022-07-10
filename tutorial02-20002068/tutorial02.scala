package tutorial02


object question01 {
  def main(args: Array[String]) {

    var k, i, j = 2;
    var m, n = 5;
    var f = 12.0;
    var g = 4.0;
    var c1 = "x";

    println(k + (12 * m));
    println(m / j);
    println(n % j);
    println(m / j * j);
    println(f + 10 * 5 + g);
    i += 1;
    println(i * n);
  }
}
object question02{
  def main(args:Array [String]){

    var i, j = 2;
    var m, n = 5;
    var f = 12.0;
    var g = 4.0;
   var a: Int = 2;
    var b: Int = 3;
    var c: Int = 4;
    var d: Int = 5;
    var k:Double = 4.3;
  b-=1; d-=1;
    println(b * a + c *d);
    a+=1;
    println(a);
    c+=1;
    println(c);
    println(c*a);


  }
}




object question04 {
  def main(args:Array [String]): Unit = {
    def Normal(a: Int): Int =250*a;//10000
    def OT(a: Int): Int = 85*a;//2250
    def Tax(a: Int): Int = a*12/100;//1470
    var normalhr =40;
    var OThr=30;
    var Tot1:Int=Normal(normalhr)+OT(OThr);
    var Tot:Int= (Normal(normalhr)+OT(OThr)- Tax(Normal(normalhr)+OT(OThr)));
    //12250-1470


    println("Salary :",Tot,Tot1,Tax(Tot1),OT(OThr),Normal(normalhr));

  }
}



object question05 {
  def main(args:Array [String]): Unit = {

    def attendance(price: Int):Int = 120 + (15 - price)/5*20
    def earn(price: Int):Int = price*attendance(price)
    def cost(price: Int):Int = 500 + attendance(price)*3
    def profit(price: Int):Int = earn(price) - cost(price)
    printf("answer : %d",profit(24))
  }
}
