//说明: 重在理解逻辑，实际上Actor模型早已经失效了.

////////////////////Lesson_Actor1 

package com.bjsxt.scala
import scala.actors.Actor

/**
  * 给Actor 发送消息
  */

class MyActor extends Actor{ // Actor已经过时了, 但是代码还是写下把。主要是理解逻辑
  override def act(): Unit = {
    receive {
      case s : String => {println(s"type is String, value = $s")}
      case _ => {println("no match....")}
    }
  }
}


object Lesson_Actor1 {
  def main(args: Array[String]): Unit = {
    val actor = new MyActor
    actor.start()

    actor ! "hello world" // actor发送消息时用的是 ! 符号
  }
}



//////////////////Lesson_Actor2

package com.bjsxt.scala
import scala.actors.Actor
import scala.io.StdIn


/**
  * actor与actor之间的通信
  */

case class Msg(actor:Actor, message:String) // Msg只是封装给actor2用的，actor1返回信息时，不需要再封装个Msg类了，
                                            // 因为MyActor2()中之间已经传参, 拿到过actor1了
class MyActor1 extends Actor{ // Actor已经过时了, 但是代码还是写下把。主要是理解逻辑
  override def act(): Unit = {
    while(True){
      receive {
        case msg : Msg =>
          if("hello~".equals(msg.message)){
            println(msg.message)
            msg.actor ! "hi~"  // actor1返回的消息
          }else if("Could we have date?".equals(msg.message)){
            println(msg.message)
            msg.actor ! "no..."
          }
        case _ => {println("no match....")}
      }
    }
  }
}


class MyActor2(actor:Actor) extends Actor{ // Actor已经过时了, 但是代码还是写下把。主要是理解逻辑

  actor ! Msg(this, "hello~")

  override def act(): Unit = {
    while(True){
      receive {
        case s : String => {
          if("hi~".equals(s)){
            println(s)
            actor ! Msg(this, "Could we have date?")
          }else if("no...".equals(s)){
            println(s)
            println("....")
            StdIn.readLine()  // 可以用这个方式去抓取控制台里的内容,比如一行话
          }
        }
        case _ => {println("no match....")}
      }
    }
  }
}


object Lesson_Actor2 {    //想要一启动收，actor2就给actor1发消息，这个功能的实现参见如下代码。
  def main(args: Array[String]): Unit = {
    val actor1 = new MyActor1()
    val actor2 = new MyActor2(actor1)
    actor1.start()
    actor2.start()

  }
}


