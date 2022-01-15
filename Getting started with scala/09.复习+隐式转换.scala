///////////Lesson_ImplicitTrans

package com.bjsxt.scala

object Lesson_ImplicitTrans {

//  def sayName(implicit name:String):Unit = {
//    println(s"$name is a student.....")
//  }

  def sayName(age: Int)(implicit name:String):Unit = {
    println(s"$name is a student....., age is $age")
}

  def main(args: Array[String]): Unit = {
    implicit val name: String = "zhangsan"
//    sayName("lisi")
    sayName(18)
  }


}

/////////////////Lesson_ImplicitTrans2

package com.bjsxt.scala


class Animal(name:String){
  def canFly(): Unit = {
    println(s"$name can fly....")
  }
}

class Rabbit(xname:String){
  val name = xname

}


object Lesson_implicitTrans2 {
  def main(args: Array[String]): Unit = {

    implicit def RabbitToAnimal(r:Rabbit):Animal = {
      new Animal(r.name)
    }

    val rabbit = new Rabbit("rabbit")
    rabbit.canFly()


  }

}


///////////////////Lesson_ImplicitTrans3

package com.bjsxt.scala


class Rabbit1(xname:String){
  val name = xname
}

object Lesson_implicitTrans3 {

  implicit class Animal(r:Rabbit1){
    def showName(): Unit = {
      println(s"${r.name} is Rabbit1...")
    }
  }

  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit1("Tom")
    rabbit.showName()
  }

}

