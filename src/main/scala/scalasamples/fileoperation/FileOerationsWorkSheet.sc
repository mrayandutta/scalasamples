package scalasamples.fileoperation

import java.io._

object FileOerationsWorkSheet
{
                                                  
  val stream : InputStream = getClass.getResourceAsStream("/sample.txt")
                                                  //> stream  : java.io.InputStream = null
val lines = scala.io.Source.fromInputStream( stream ).getLines
                                                  //> java.lang.NullPointerException
                                                  //| 	at java.io.Reader.<init>(Reader.java:78)
                                                  //| 	at java.io.InputStreamReader.<init>(InputStreamReader.java:129)
                                                  //| 	at scala.io.BufferedSource.reader(BufferedSource.scala:22)
                                                  //| 	at scala.io.BufferedSource.bufferedReader(BufferedSource.scala:23)
                                                  //| 	at scala.io.BufferedSource.scala$io$BufferedSource$$charReader$lzycomput
                                                  //| e(BufferedSource.scala:33)
                                                  //| 	at scala.io.BufferedSource.scala$io$BufferedSource$$charReader(BufferedS
                                                  //| ource.scala:31)
                                                  //| 	at scala.io.BufferedSource$BufferedLineIterator.<init>(BufferedSource.sc
                                                  //| ala:61)
                                                  //| 	at scala.io.BufferedSource.getLines(BufferedSource.scala:81)
                                                  //| 	at scalalearning.fileoperation.FileOerationsWorkSheet$$anonfun$main$1.ap
                                                  //| ply$mcV$sp(scalalearning.fileoperation.FileOerationsWorkSheet.scala:9)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSu
                                                  //| Output exceeds cutoff limit.
}