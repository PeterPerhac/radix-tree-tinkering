package com.perhac.experiments.radixtree

import algebra.ring.AdditiveMonoid
import com.rklaehn.radixtree._
import algebra.instances.all._

import scala.io.Source

object App {
  def main(args: Array[String]): Unit = {
    val f: String => String = _.replaceAll("[^a-zA-Z ]", "").toLowerCase
    val raven = Source.fromURL("file:///Users/peterperhac/temp/raven.txt").getLines.map(f).toArray
    val words = raven.flatMap(_.split(' ')).filterNot(_.isEmpty)
    val m = AdditiveMonoid[RadixTree[String, Int]]
    val count = words.map(x ⇒ RadixTree(x → 1)).reduce(m.plus)
    println(count.entries.toList)
  }
}
