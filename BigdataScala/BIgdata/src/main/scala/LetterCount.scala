//importing source from scala to read the file
import scala.io.Source
//creating the object LetterCount and first thing we need to do is creating the Object
object LetterCount {
  //defining the function with the name alphabetCounts
  def alphabetCounts(text: String): Map[Char, Int] = {
    text
      .toLowerCase         //converting the text to lowercase
      .filter(_.isLetter)  // helps to filter and get only alphabets
      .groupBy(identity)   //grouping is done based on a alphabets
      .view                //helps to create a view
      .mapValues(_.length) //maps each group to its length
      .toMap               //it converts to map
  }
  //defining the function totalCount which is taking input from alphabetCounts and it helps to print the letter and its count
  def totalCount(alphabetCounts: Map[Char, Int])= {
    println("Alphabet counts in a given file:") //to display in output
    //It will help to convert to list, it will also helps to sort based on given condition and foreach helps to iterate each elements and count it
    alphabetCounts.toList.sortBy(_._1).foreach {
      case (letter, count) => println(s"$letter:$count") // the way which we need output letter:count
    }
  }
  //defining main function , inside this we will specify filepath and call the functions to perform the count
  def main(args: Array[String])= {
    val fileLocation = "C:/Users/yasha/OneDrive/Desktop/BigdataScala/bleak-house.txt" // specifying file path and saving in variable filelocation
    val text = Source.fromFile(fileLocation).mkString //converting the text file to string and saving in the variable text
    val count = alphabetCounts(text) //calling function alphabetCounts and saving it to count
    totalCount(count)  //calling function totalcount to count the each alphabetcounts and print it
  }
}




