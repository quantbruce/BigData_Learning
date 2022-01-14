  ////////////////Lesson_Trait1

package com.bjsxt.scala

/**
  *  一个类继承多个trait时，第一个关键字使用extends, 之后使用with
  */

trait Read{
  def read(name: String): Unit ={
    println(s"$name is reading...")
  }
}

trait Listen{
  def listen(name: String): Unit ={
    println(s"$name is listening...")
  }
}

class Human() extends Read with Listen {

}


object Lesson_Trait1 {
  def main(args: Array[String]): Unit = {
    val h = new Human()
    h.read(name="zhangsan")
    h.listen(name="lisi")
  }
}


/////////////////////Lesson_Trait2

package com.bjsxt.scala

/**
  *  1.一个类继承多个trait时，第一个关键字使用extends, 之后使用with
  *  2.trait不可以传参
  *  3.Trait中可以有方法体的实现或方法体的不实现，类继承了Trait要实现Trait中没有实现的方法
  *  4.
  */


trait IsEquale {
  def isEqu(o:Any): Boolean
  def isNotEqu(o:Any): Boolean = { // 一行代码，可以把{}去掉，也就是没有方法体的实现
    !isEqu(o)
  }
}


class Point(xx:Int, xy:Int) extends IsEquale {
  val x = xx
  val y = xy

  override def isEqu(o: Any): Boolean = {
    o.isInstanceOf[Point]&&o.asInstanceOf[Point].x==this.x  // 不太理解，多去理解下这段代码
  //o.isInstanceOf[Point]: 判断o是不是一个Point实列；
  //o.asInstanceOf[Point].x: 作为Point实例，取出Point实例里的x；
  //this.x： 就是谁在调用这个方法，p1.isEqu(p2)，是p1在调用，所以this就是p1；

  }

}


object Lesson_Trait2 {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(1, 2)
    val p2 = new Point(1, 3)
    println(p1.isEqu(p2))
    println(p1.isNotEqu(p2))

  }
}


///////////////////Match

package com.bjsxt.scala

/**
  * Match: 模式匹配
  * 1. case_ 什么都不上匹配，放在最后
  * 2. match 可以匹配值，还可以匹配类型
  * 3. 匹配过程中，会有数值的转换
  * 4. 从上往下匹配，匹配上之后会自动终止
  * 5. 模式匹配外部的“{}”可以省略
  */

object Lesson_Match {

  def main(args: Array[String]): Unit =
  {
    val tp = (1, 1.2, "abc", 'a', true)
    val iter: Iterator[Any] = tp.productIterator
    iter.foreach(MatchTest)
  }


  def MatchTest(o:Any): Unit={ // 可去掉的花括号
    o match {
      case i: Int => println(s"type is Int, value = $i")
      case 1 => println("value is 1")
      case d: Double =>println(s"type is Double, value = $d")
      case s: String=>println(s"type is String, value = $s")
      case 'a' => println("value is a")
      case _ => {println("no match...")}

    } // 模式匹配的多行，其实就相当于一行，因而可以把最外层的花括号{}去掉
  } // 可去掉的花括号


}



/////////////////////Partial Function

package com.bjsxt.scala

/**
  * 偏函数，只能匹配一个值，匹配上了返回某个值
  * PartialFunction[A, B] A是匹配类型，B是匹配上返回的类型
  *
  */

object Lesson_PartialFunction {
  def Mytest: PartialFunction[String,Int]={
    case "abc" => 2
    case "a" => 1
    case _ => 200
  }


  def main(args: Array[String]): Unit = {
    val result: Int = Mytest("abc")
    println(result)
  }


}


//////////////////Case Class

package com.bjsxt.scala


case class Person1(var name:String, age: Int){ // 样例类在用的时候，如果{}内没有其他逻辑，就可以直接去掉花括号

}


object Lesson_CaseClass {
  def main(args: Array[String]): Unit = {
    val p1 = new Person1("zhangsan",18)
    val p2 = new Person1("zhangsan",18)
    println(p1.equals(p2))
    println(p1)

  }

}


