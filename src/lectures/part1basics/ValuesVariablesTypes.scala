package lectures.part1basics

/**
 * Created by Hongwei 12-11-2020.
 */

object ValuesVariablesTypes extends App {

  // immutable
  val x: Int = 42
  println(x)

  val aString: String = "hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'b'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 5273985273895237L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
