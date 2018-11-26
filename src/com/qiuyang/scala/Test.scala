package com.qiuyang.scala

/**
  * Created by qiuyueyang on 2018/11/26.
  */
object Test {
  def main(args: Array[String]) {
//    println("hello scala")
    val list: List[Any] = List(12,'c',"hello",99.9)
    list.foreach(matchFun)
  }
  def matchFun(x:Any): Unit ={
    x match{
      case i:Int => println("This is Int "+i)
      case s:String => println("This is String "+s)
      case d:Double => println("This is Double "+d)
      case _ => println("default ....")
    }
  }
}
