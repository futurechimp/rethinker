package com.constructiveproof.rethinker

import java.util

import com.constructiveproof.rethinker.testsupport.TestStack

class RethinkerSpec extends TestStack {

  describe("Rethinker") {
    val f = FakeApp

    describe("extracting a case class from a Java HashMap") {
      val jmap: java.util.HashMap[String, Any] = new util.HashMap(2)
      jmap.put("name", "Galactica")
      jmap.put("number", 75)

      val galactica = f.extract(jmap)
      it("extracts the case class happily") {
        galactica shouldEqual Carrier("Galactica", 75)
      }
    }

    describe("extracting case classes in an Array of Java HashMaps") {

    }
  }
}

/**
  * Might as well stick with RethinkDb's science fiction theme.
  */
case class Carrier(name: String, number: Int)

object FakeApp extends Rethinker[Carrier]