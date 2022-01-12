package com.bjsxt.scala

import java.util.Date

object Lesson_Function {
  /**
    *1.方法定义
    *  1) 方法体中最后返回值可以使用return, 如果使用了return, 那么方法体的返回值类型一定要指定
    *  2) 如果方法体中没有return，默认将方法体中最后一行计算结果当作返回值返回，方法体的返回值类型可以省略，会自动推断返回值类型
    *  3) 定义方法传入参数一定要指定类型;
    *  4) 方法的方法体如果可以一行搞定，那么方法体“{...}”可以省略
    *  5) 如果定义方法时，省略了方法名称和方法体之间的“=”，那么无论方法体最后一行计算的结果是什么，都会被丢弃，返回Unit(返回类型为空)
    *  6) 定义方法
    */
  def main(args: Array[String]): Unit = {
//    def max(a: Int, b:Int): Int = {
//      if(a>b){
//        return a
//      }else{
//        return b
//      }
//    }
//    val result: Int=max(100, 20)
//    println(result)
//
//    /**
//      * 2.递归方法
//      *
//      */
//    def fun1(num: Int): Int={
//      if(num==1){
//        1
//      }else{
//        num*fun(num-1)
//      }
//    }
//
//    println(fun1(5))


//    /**
//      * 3.参数有默认值的方法
//      */
//    def fun2(a: Int=10, b: Int=20): Int={
//      a + b
//    }
//
//    println(fun2())


//    /**
//      * 4.可变长参数的方法
//      */
//    def fun3(s:String*): Any={
////      println(s)
////      for(elem<-s){  // 第1种写法
////        println(elem)
////      }
////      s.foreach((elem:String)=>println(elem)) // 第2种写法
//
//      s.foreach(println(_))  // 第3种写法。 当某些变量在匿名函数中只用到一次时，可以将他省略，用下划线替代
//      s.foreach(println)  // 第4种写法。 因为println()只有一个参数，所有上面方法3的下划线也可以去掉
//
//
//
//    }
//    fun3("bruce", "tmac", "jordan")
////    fun3()

    /**
      * 5.匿名函数
      */
//    def fun5: (Int, Int)=>Int = (a: Int, b: Int)=> {
//      a + b
//    }
//
//    println(fun5(100, 200))

//    var sda: String => Unit = (s:String) => {
//      println(s.)
//}


//    /**
//      * 6.嵌套方法
//      */
//    def fun(num:Int): Int={
//
//      def fun1(a: Int): Int={
//        if(a==1){
//          1
//        }else{
//          a*fun1(a-1)
//        }
//      }
//      fun1(num)
//    }
//    println(fun(num = 5))


//    /**
//      * 7.偏应用函数
//      * 某些情况下，方法中参数非常多，调用这个方法非常频繁，每次调用只有固定的某个参数变化，其他都不变，可以定义偏应用函数来实现
//      */
//    def showLog(date: Date, log:String): Unit={
//      println(s"date is $date,  Log is $log")
//
//    }
//
//    val date = new Date()
//    showLog(date, log="a")
//    showLog(date, log="b")
//    showLog(date, log="c")
//
//    def fun: String=>Unit = showLog(date, _:String) // 不变的写在前面，变化的用下划线_表示就可以了。 这就是偏应用函数
//    fun("aaa")
//    fun("bbb")
//    fun("ccc")

    /**
      * 8.高阶函数
      *   1) 方法的参数是函数
      *   2) 方法的返回是函数 (必须要显示的写出方法的返回值类型, 加 _ 就可以不显示的声明方法的返回值类型)
      *   3) 方法的参数和返回都是函数
      *
      */

//    // 1) 方法的参数是函数
//    def fun(a: Int, b: Int): Int={
//      a + b
//    }
//
//    def fun1(f:(Int, Int)=>Int, s:String): String={
//      val i: Int = f(100, 200)
//      i + "#" + s
//    }
//
//    val res = fun1((a:Int, b:Int)=>{a*b}, "Scala")
//    println(res)

//    //2) 方法的返回是函数
//    def fun(s: String): (String, String)=>String={
//      def fun1(s1:String, s2:String): String={
//        s1 + "~" + s2 + "#" + s
//      }
//      fun1 // _  加上下划线，就是将方法强制转化为函数
//    }
//
//    println(fun("a")("b", "c"))


//    // 3) 方法的参数和返回都是函数
//    def fun(f:(Int, Int)=>Int):(String,String)=>String ={
//      val i: Int = f(1, 2)
//      def fun1(s1:String, s2:String):String = {
//        s1 + "@" + s2 + "*" + i
//      }
//      fun1
//    }
//
//    println(fun((a, b)=>{a+b})("hello", "world"))


    /**9.柯里化函数 (其实就是8的第二种函数的简化版本)
      * 为什么要创造这个柯里化函数，除了是一种简便的写法后，后续在隐式转化是需要用到这个柯里化函数。
      */
    def fun(a: Int, b: Int)(c:Int, d:Int): Int = {
      a + b + c + d
    }

    println(fun(1, 2)(3, 4))





  }
}
