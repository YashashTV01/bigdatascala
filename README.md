# Big Data Analysis with Spark

## Overview

This project explores advanced big data analysis using Apache Spark, Scala, and Python. It consists of three parts:

1. **LetterCount (Scala):** A Scala program that reads a text file, counts occurrences of each letter (a-z), and prints the counts.

2. **Bakery Transactions (Python/Spark):** Analyzing bakery transactions dataset using Spark's FPGrowth algorithm to derive frequent itemsets and association rules.

3. **Iris Flower Classification (Python/Spark):** Using Spark's Decision Tree Classification to predict iris flower species based on their measurements.

## Part 1: LetterCount

### Scala Program

```scala
import scala.io.Source

object LetterCount {
  // Function to count occurrences of each letter
  def alphabetCounts(text: String): Map[Char, Int] = {
    // Implementation details...
  }

  // Function to display total counts
  def totalCount(alphabetCounts: Map[Char, Int]): Unit = {
    // Implementation details...
  }

  // Main function
  def main(args: Array[String]): Unit = {
    // Reading file
    val fileLocation = "inputfile"
    val text = Source.fromFile(fileLocation).mkString
    val count = alphabetCounts(text)
    totalCount(count)
  }
}
