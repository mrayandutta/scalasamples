package main.scala.scalasamples.actorsamples

import scala.actors.Actor

/**
  * Created by mrayandutta2016 on 12/25/2016.
  */
object SampleActor extends Actor
{
  def act()
  {
    for (i <- 1 to 5)
    {
      println("I'm acting!")
      Thread.sleep(1000)
    }
  }

}
