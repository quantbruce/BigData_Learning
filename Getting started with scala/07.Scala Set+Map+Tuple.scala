/////////////// Set
package com.bjsxt.scala

import scala.collection.mutable
import scala.collection.immutable

object Lesson_Set {
  def main(args: Array[String]): Unit = {
    val set = mutable.Set[Int](1,2,3,4)
//    set.foreach(println)
    set.+=(100)
    set.foreach(println)

//    val set1 = Set[Int](3,4,5,6)
    val set2 = immutable.Set[String]("a", "b")



//    val res1: Set[Int] = set.intersect(set1)
//    val res2: Set[Int] = set.diff(set1)
//    res1.foreach(println)
//    res2.foreach(println)

//    val res3 = set & set1
//    res3.foreach(println)




//    for(elem<-set){
//      println(elem)
//    }


  }
}


///////////////////////Map

package com.bjsxt.scala

import scala.collection.mutable
import scala.collection.mutable.Map

object Lesson_Map {

  def main(args: Array[String]): Unit =
  {
//    val map = Map[String, Int]("a"->100, "b"->200, ("c", 300), ("c", 400))
//    println(map)

//    for(elem<-map){
//      println(elem)
//    }

//    map.foreach(println)

//    var option: Option[Int] = map.get("a")
//    var option: Option[Int] = map.get("aa")
//    var value: Int = map.get("a").get
//    val value = map.get("aa").getOrElse("no value")


//    val keys: Iterable[String] = map.keys

    //    keys.foreach(key=>{
    //      val value = map.get(key).get
    //      println(s"key = $key, value = $value")
    //    })
//    val values: Iterable[Int] = map.values
//    values.foreach(println)


//    println(value)


//    val map1 = Map[String, Int](("a", 1), ("b", 2), ("c", 3), ("d", 4))
//    val map2 = Map[String, Int](("a", 100), ("b", 2), ("c", 300), ("e", 500))
//    val result: Map[String, Int] = map1.++(map2) // 这样是map2去覆盖map1; 而map1.++:(map2)则是map1去覆盖map2
//    result.foreach(println)

    val map = Map[String, Int]()
    map.put("a", 100)
    map.put("b", 200)
//    map.foreach(println)

    val result: mutable.Map[String, Int] = map.filter(tp => {
      val key = tp._1
      val value = tp._2
      value == 200
    })
    result.foreach(println)




  }


}



/////////////////////Tuple

package com.bjsxt.scala

object Lesson_Tuple {
  def main(args: Array[String]): Unit = {

    val tuple1 = new Tuple1("hello")
    var tuple2: (String, Int) = new Tuple2("a", 100)
    val tuple3: (Int, Boolean, Char) = new Tuple3(1, true, 'C')
    val tuple4: (Int, Double, String, Boolean) = new Tuple4(1, 3.4, "abc", false)
    val tuple6: (Int, Int, Int, Int, Int, String) = (1, 2, 3, 4, 5, "abc")
    val tuple221: (Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int) = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)
    val tuple222 = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, "abc", 14, 15, 16, 17, 18, 19, 20, 21, 22)
    //    val unit: Unit = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23) // 多于23个元素，现在连编译都通不过了

    val value = tuple222._13
//    println(value)

    val iterator: Iterator[Any] = tuple6.productIterator

//    while(iterator.hasNext){
//      println(iterator.next())
//    }

//    iterator.foreach(println)

    println(tuple1)
    println(tuple2.swap)


  }

}






























