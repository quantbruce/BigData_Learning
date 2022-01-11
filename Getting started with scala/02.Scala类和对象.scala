package com.bjsxt.scala

/**
  Scala:
  1.Scala object相当于java中的单例，object中定义的全是静态的；相当于Java中的工具类。但Object不可以传参, 如果非要传参时，使用apply方法，
    会自动寻找object中相应参数个数的apply方法；
  2.Scala中定义变量使用var, 定义常量使用val, 变量可变，常量不可变，变量和常量类型可不写，会自动推断；
    建议多尽量写下val,因为val相对于var更容易回收；
  3.Scala中每行后面都会有分号自动推断机制，不用显示的写出;
  4.建议在Scala中命名使用驼峰法则；
  5.Scala类中可以传参(不同于Java), 传参一定要指定类型，有了参数就默认了构造.类中的属性默认有getter和setter方法
  6.类中重写构造时，构造中第一行必须先调用默认的构造；重写构造的写法：def this(...){...}
  7.Scala中当new class时，类中除了方法不执行【除构造方法】,其他都执行。 多理解下
  8.在同一个scala文件中，class名称和Object名称一样时，这个类叫做这个对象的伴生类，这个对象叫做这个类的伴生对象，他们之间可以互相访问私有变量

  */


class Person(xname: String, xage: Int){
  val name = xname
  var age = xage
  var gender = 'M'

  println("**********Person Class***********")
  def sayName(): Unit={
    println("Hello World..." + Lesson_ClassAndObj.name)
  }

  def this(yname: String, yage: Int, ygender:Char){
    this(yname, yage)
    this.gender = ygender
  }
  println("===========Person Class===========")
}


object Lesson_ClassAndObj {
  println("###########Person Class###########")
  val name = "wangwu"
//  Lesson_ClassAndObj(1000)  // 如果这样写，一定要与apply()函数搭配使用才不会报错
//
//  def apply(i: Int): Unit = {
//    println("Score is " + i)
//  }
  
  def main(args: Array[String]): Unit = { // main方法是静态的，必须要写在object类中才可以运行
//    val a: Int = 100
//    var b = 200
//    b = 300
    val p = new Person(xname="bruce",xage=28)
//    println(p.gender)
//    val p1 = new Person(yname = "diaochan", yage=18, ygender = 'F')
//    println(p1.gender)
//    p.age = 200
    println(p.name)
//    println(p.age)
//    p.sayName()

  }
}


















