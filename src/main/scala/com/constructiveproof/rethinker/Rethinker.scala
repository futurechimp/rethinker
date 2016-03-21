package com.constructiveproof.rethinker

import org.json4s.jackson.JsonMethods._
import org.json4s.jackson.Serialization._
import org.json4s.{DefaultFormats, _}

import scala.collection.JavaConversions._


abstract class Rethinker[T](implicit val m: Manifest[T]) {

  implicit val formats = DefaultFormats

  def extract(obj: java.util.HashMap[String, Any]): T = {
    parse(write(obj.toMap)).extract[T]
  }

}
