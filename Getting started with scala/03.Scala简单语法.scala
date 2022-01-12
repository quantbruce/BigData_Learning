object Lesson_ClassAndObj {
//  println("###########Person Class###########")
//  val name = "wangwu"
//  Lesson_ClassAndObj(1000)  // 如果这样写，一定要与apply()函数搭配使用才不会报错
//
//  def apply(i: Int): Unit = {
//    println("Score is " + i)
//  }
  
  def main(args: Array[String]): Unit = { // main方法是静态的，必须要写在object类中才可以运行
    //example 1
//    val age = 20
//    if(age < 20){
//      println("age <= 20")
//    }else if(age>=20&&age<=30){
//      println("20<age<=30")
//    }else{
//        println("age>30")
//    }

    // example2
//      val r = 1.to(10, 2)
//      val r1 = 1 until 10
//      println(r)
//      println(r1)
//      for(i <- 1 to 10){
//        println(i)
//      }

//    // example3 小九九乘法表
//    for(i <- 1.until(10)){
//      for(j <- 1.until(10)){
//        if(i>=j){
//          print(i+"*"+j+"="+i*j+'\t')
////          println(S"$i*$j=$i*$j")
//        }
//        if(i==j){
//          println()
//        }
//      }
//    }

      val result = for(i <- 1 to 100 if(i>50) if(i%2==0)) yield i
      println(result)



//    val a: Int = 100
//    var b = 200
//    b = 300
//    val p = new Person(xname="bruce",xage=28)
//    println(p.gender)
//    val p1 = new Person(yname = "diaochan", yage=18, ygender = 'F')
//    println(p1.gender)
//    p.age = 200
//    println(p.name)
//    println(p.age)
//    p.sayName()

  }
}
