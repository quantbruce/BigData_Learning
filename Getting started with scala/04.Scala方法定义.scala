package com.bjsxt.scala

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
    def max(a: Int, b:Int): Int = {
      if(a>b){
        return a
      }else{
        return b
      }
    }
    val result: Int=max(100, 20)
    println(result)
  }
}
