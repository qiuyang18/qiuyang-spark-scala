package com.qiuyang.scala

/**
  * Created by qiuyueyang on 2018/11/26.
  * class的属性,getter/setter参数设置的说明
  * 1. scala内的字段属性都是私有的,但是自动提供了共有的getter/setter方法
  * 2. 类定义时的传参:
  *   -class Student(name:String)-若有方法使用,则成为private[this] val name字段,若未使用,则无此字段,只是一个可访问的普通参数
  *   -class Student(val/var name:String) -name为私有属性,自动生成共有的getter/setter方法
  *   -class Student(private val/var name:String) -name为私有书许ing,自动生成私有的getter/setter
  * 3. getter/setter方法的名称同属性名,如对namne属性
  *   -getter方法:  def name() = {}
  *   -setter方法:  def name_=(str:String) = {}  //注意方法名,可反编译获得
  * 4. private[this] var name 对象私有变量,仅本对象可访问  不会生成getter/setter方法,
  * 5. 类的方法可访私有问类的私有变量（可访问该类的**所有对象**的私有字段）
  *
  */
class PS{
  /**
    * age未用private声明,但它是private int age;私有属性,但是有public的getter/setter方法
    * scala中,字段前加private,意味着其getter/setter方法是否为private的
    */
  var age:Int = _
}


class Student(val name:String){
  println(this.name)   //语句使用仍然不能改变属性的特点

  def show() = {
    println(this.name)
  }

}

object ClassDemo1 {
  def main(args: Array[String]) {
    val s1: Student = new Student("zhangsan")
    println(s1.name)
  }
}
