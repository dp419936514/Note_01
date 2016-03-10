import scala.math._
import scala.util.Random

object Chapter_01 {
  def main(args: Array[String]) {
    val greeting: String = "Hello World";
    println(greeting);

    commonType()
  }

  //常用类型
  def commonType() = {

    val byte: Byte = 0
    val char: Char = '1'
    val short: Short = 0
    val int: Int = 0
    val long: Long = 0
    val float: Float = 0
    val double: Double = 0.55555


    //scala 不会可以区分基本类型和包装类型，以下用法也是可行的
    val string1 = 1.toString

    /**
      * 此处的1被隐式转换为一个Int对象，这个对象可以调用Int类型自带的很多简便方法，e.g
      */
    println(1.to(10))
    println(1.toByte)


    //在scala中，不采用强制类型转换，而是使用toType方法进行类型转换。比如
    99.444.toInt
    99.toChar
    "99.44".toDouble
  }


  def methods(): Unit = {

    //在scala中，算数操作符跟Java中作用相同，完成它们该完成的任务
    1 + 5
    56 - 4
    6 * 46
    465 / 6

    /**
      * 不同的是，scala中的操作符其实都是方法。 scala允许你的方法名带有这些（&*%￥#） 字符
      */
    1.+(1) // 就是1+1的完整形式

    /**
      * 通常来说，存在以下两种调用函数的格式
      *
      * a.method (b)
      * a method b
      *
      * 前者是更具有JAVA风格，后者则更加简便
      **/

    /**
      * scala中不存在 ++ 和 -- 这两个方法。
      * 我们使用 +=1 和 -=1 来代替它们
      *
      */
  }

  def function(){
    /**
      * 在scala中，方法和函数是不一样的，你在调用某些函数的时候不需要想JAVA一样，调用某个类型的静态方法，比如
      * Math.max();
      * 在scala里使用函数，只需要先引入包，然后就可以直接使用
      *
      * import scala.math._
      * _ 是scala中的通配符
      **/

    sqrt(2)
    pow(2,2)
    min(23,13)

    /**
      * 当且仅当使用以scala开头的包时候,scala可以被省略，e.g
      * import scala.math._  等价于  import math._
      * scala.math.sqrt()    等价于  math.sqrt()
      */

    /**
      * Scala本身不存在静态方法，但是有一个类似的机制 —— 单例对象（singleton object）
      * 基本上，每个类型有一个对应的伴生对象（companion object），这个对象具有这个类型的对象具有的方法，调用它的方法，就像调用静态方法
      */
    print (BigInt.probablePrime(4,Random) ) // 该方法生成一个指定位数的质数

    /**
      * 无参数的方法通常不带有 （） ，这样省事
      */
    "Hello".getBytes
    "Hello".distinct   // 该方法获得字符串中不重复的字符，


    /**
      * 对于很多对象，还有一种特殊的函数调用方式， e.g
      * 仿佛是调用了一个方法名为（）的函数
      * 它是由一个名叫apply（）的方法实现的。
      * 下文中调用的这个函数，它的完整签名其实是
      * StringOps类中的 ： def apply(n : Int) :Char
      * 它的作用就相当于java中的 String.charAt(int n)
      */

    "Hello" (1)
  }
}





