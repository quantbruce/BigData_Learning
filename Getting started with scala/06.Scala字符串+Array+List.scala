//字符串部分
package com.bjsxt.scala

object Lesson_String {
    def main(args: Array[String]): Unit = {
      val s = "jsxbt"
      val s1 = "JSXBT"

      println(s.indexOf(98))

      println(s.equals(s1))
      println(s.equalsIgnoreCase(s1))
    }

}
// 后续自己再去补补String相关的常用函数用法




// Array部分

package com.bjsxt.scala

import scala.collection.mutable.ArrayBuffer

object Lesson_Array {

  def main(args: Array[String]): Unit = {

//    val arr = ArrayBuffer[Int](elems = 1, 2, 3)
//    arr.+=(200)
//    arr.+=:(100)
//    arr.foreach(println)


//    val arr = Array[String](xs = "a", "b", "c", "d")
//    val arr1 = Array[String](xs = "e", "f", "g")

//    val arrays: Array[String] = Array.concat(arr, arr1)
//    arrays.foreach(println)

//    val arrays: Array[String] = Array.fill(5)("hello")  // fil初始化长度为5，每个元素是hello的元素
//    arrays.foreach(println)


//    val array = new Array[Array[Int]](3)
//      array(0) = Array[Int](xs = 1, 2 ,3)
//      array(1) = Array[Int](xs = 4, 5 ,6)
//      array(2) = Array[Int](xs = 7, 8 ,9)

//    // 遍历方式1
//      for(arr<-array){
//        for(elem<-arr){
//          println(elem)
//        }
//      }

//    // 遍历方式2
//      array.foreach(arr=>{arr.foreach(println)})

      // 遍历方式3

  }
}


// 

package com.bjsxt.scala

import scala.collection.mutable.ListBuffer

object Lesson_List {

    def main(args: Array[String]): Unit = {

//      val list = List[Int](1, 2, 3)
////      list.foreach(println)
//
//      for(elem<-list){
//        println(elem)
//      }

      val list = List[String](xs = "hello scala", "hello java", "hello spark", "a", "abc") // 不可变的list

      val list2 = ListBuffer[Int](1,2,3)
      list2.append(4,5,6)
      list2.+=:(100)
      list2.foreach(println)

      val result: List[Array[String]] = list.map(s=>{s.split(" ")})

//      result.foreach(arr=>{
//        println("新的数组")
//        arr.foreach(println)}
//      )

      val result2 = list.flatMap(s=>{s.split(" ")})
//      println(result2)
//      result2.foreach(println)

      val result3: List[String] = list.filter(s=>{
        "hello scala".equals(s)
      })

//      result3.foreach(println)


//      var result4: Int = list.count(s=>{s.length>4})
//      println(result4)





    }
}
















































