package com.constructiveproof.rethinker

import java.util

import org.json4s.jackson.JsonMethods._
import org.json4s.jackson.Serialization._
import org.json4s.{DefaultFormats, _}

import scala.collection.JavaConversions._


abstract class Rethinker[T](implicit val m: Manifest[T]) {

  implicit val formats = DefaultFormats

  def extract(javaHash: java.util.HashMap[String, Any]): T = {
    parse(write(javaHash.toMap)).extract[T]
  }

  def extract(javaList: java.util.List[util.HashMap[String, Any]]): List[T] = {
    javaList.toList.map(element => extract(element))
  }

}
