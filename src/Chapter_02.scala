import Math._;/**
  * Created by Derek.P.Dai on 2016/3/9.
  */
class Chapter_02 {

  def main(args:Array[String]): Unit ={

  }

  def conditionExpression()={
    /**
      * Scala与java的一个重要区别：
      * Java的表达式（Expression）有值，但是语句（比如if else）是没有值的
      * 但是Scala中，所有的语句都有值，一般是语句中最后一个表达式的值
      */
    val condition:Boolean = false;
    val x = if(condition) 1 else -1
    /*
     * 此处的X的值就是后面if else语句的值。  1/-1
     * 上面的语句等价于
     *
     * var x
     * if(condition) x=1 else x=-1
     *
     * 不过通常我们使用第一种形式，因为第一种形式可以直接用于初始化一个val，而第二种表达式需要预先定义一个var
     */

    val y = if(condition) 1

    /**
      * if else 语句中变量的值并不规定必须相同，你可以在if中返回int，else中返回String。
      * 整个if else语句的类型是两个分支中类型的公共超类
      *
      * 像上面y后if的类型是Int，else未定义，类型是Unit（写作()）
      * 所以整个if else的类型是Int和Unit的公共超类 ：Any
      */

    /*
      Scala没有Switch语句，它有更强大的模式匹配机制。
    */
  }

  def expressionBlock():Unit = {
    /**
      * Java和C++中，语句块block是一个包含在{}的一组语句，它们作为程序控制逻辑的单元。
      * 而在Scala中，块表达式block可以包含一系列的语句或者表达式，不同的是，块表达式有值，其值就是语句中最后一个表达式的值。
      * 在某个val初始化需要很多步骤的时候，块表达式非常有用。
      * e.g
      */
    val x,x0,y,y0 = 1;

    val distance = { val dx = x - x0 ; val dy = y - y0 ; sqrt(dx*dx + dy*dy )}


    /**
      * 赋值语句也是有值的，它的类型是Unit,值为() ,显然不应该赋予任何变量。
      *
      * 所以，不要把赋值语句串接起来。
      */
    var a
    var b
    a = b = 1 // 此处的a 就是个Unit
  }

  def Loop(): Unit ={
    /**
      * Scala具有While和Do While循环，但是Scala没有  for (int i ; i < num ; i++)这样的循环
      *
      * 你可以使用一个 for 语句达到相似的结果。
      * for ( i <- 1 to num )
      *
      * 该语句使得i遍历 1 to num 返回的集合中的所有元素
      * for语句中的变量 i 并没有val/var的指定，其类型就是集合的元素类型。循环变量的作用于只在循环体中。
      *
      * TIPS ： to 返回一个包含上下界的有界区间。
      *         until 返回一个不含上届的区间。
      *  e.g : 1 to 10 返回 1~ 10
      *        1 until 10 返回 1 ~ 9
      */

    val string = "Scala"
    var sum = 0
    for ( i <- 0 until string.length ){
      sum += string(i)
    }

    //但是我们有更加简便的办法

    for (char <- string) sum += char
  }
}
