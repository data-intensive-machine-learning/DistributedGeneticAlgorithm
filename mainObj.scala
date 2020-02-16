package GeneticAlgorithm
import java.io._
import scala.io.Source
import scala.collection.mutable.ListBuffer

object mainObj {
  def main(args:Array[String])
  {
    
    var name=ListBuffer[Byte]()
    
    var file=Source.fromFile("/home/shahzad/Desktop/test.txt").getLines().toList
    var words=file.map(_.split(",").toList)
    var wordslength=words.length
    println(wordslength)
    println("Words:")
    words.foreach(println)
    println(words)
    
    
   // Init in List -> contains All elements except last one
   // Last in List -> contains  elements which is at last position
    
    var l11=List(1,2,3,4,5)
    var l22=List(1,2,9,4,6)
    
    var res=l11.init.toList.equals(l22.init)
    println(res)
    
    
    
   var l1=List(1,2,3,4,5)
      var l2=List(1,3,4,4,6)
    //println(l1.length)
    
    for(i <- 0 until l1.length){
      
      if(l1(i).equals(l2(i))){
        name+=1
      }
      else{
        name+=0
      }           
    }
    println(l1)
    println(l2)
    var name1=name.toList
    println(name1)
    
    
  /*  var l1=List(List(1,2),List(3,4))
    var len1=l1.length
    println(len1)
 
    for(i <- l1){
       for(j <- 0 until len)
    }*/
    
    
  }
    
  
  
  /*def fitnessCalculation(l:List[Int],d_table:List[List[Int]]):Double=
  {
    .toList.map(_.toDouble)
  }*/
}