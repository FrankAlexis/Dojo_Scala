package models

import play.api.libs.json.{Json, Reads, Writes}

/**
  *
  * @param id
  * @param name
  * @param description
  */
case class Place(id:Int, name:String, description:Option[String])

/**
  * Convert to Json
  */
object Place{
  implicit val placeWrites: Writes[Place]= Json.writes[Place]
  implicit val placeReads: Reads[Place]= Json.reads[Place]
}