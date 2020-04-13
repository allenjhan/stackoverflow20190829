import scala.collection.mutable

object UseLinkedHashMap extends App {

  val myList = Vector(("1", "a"),("2","b"),("3","c"),("4","d"))
  println(myList)

  val myMap = mutable.LinkedHashMap[String, String]()

  myMap.addAll(myList)

  myMap.foreach(println)


}
