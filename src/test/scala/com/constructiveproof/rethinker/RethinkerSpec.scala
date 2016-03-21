package com.constructiveproof.rethinker

import java.util

import com.constructiveproof.rethinker.testsupport.TestStack

class RethinkerSpec extends TestStack {

  describe("Rethinker") {
    object CarrierExtractor extends Rethinker[Carrier]
    val f = CarrierExtractor

    describe("extracting a case class from a Java HashMap") {
      val galactica = f.extract(makeGalactica)

      it("extracts the case class happily") {
        galactica shouldEqual Carrier("Galactica", 75)
      }
    }

    describe("extracting case classes in an Array of Java HashMaps") {
      val carriers = f.extract(makeCarriers)

      it("extracts a Scala List of case class instances") {
        val galactica = carriers.head
        galactica shouldEqual Carrier("Galactica", 75)

        val b5 = carriers(1)
        b5 shouldEqual Carrier("Babylon", 5)
      }
    }
  }

  def makeCarriers = {
    val javaArray = new java.util.ArrayList[util.HashMap[String, Any]](2)
    javaArray.add(makeGalactica)
    javaArray.add(makeB5)
    javaArray
  }

  def makeGalactica = {
    val javaMap: java.util.HashMap[String, Any] = new util.HashMap(2)
    javaMap.put("name", "Galactica")
    javaMap.put("number", 75)
    javaMap
  }

  def makeB5 = {
    val javaMap: java.util.HashMap[String, Any] = new util.HashMap(2)
    javaMap.put("name", "Babylon")
    javaMap.put("number", 5)
    javaMap
  }

}

/**
  * Might as well stick with the RethinkDb's docs theme.
  */
case class Carrier(name: String, number: Int)

