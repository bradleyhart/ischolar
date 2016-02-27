package controllers

import com.fasterxml.jackson.databind.node.ObjectNode
import play.api.mvc._
import play.libs.Json

object Authors extends Controller {

  def index = Action {
    val root: ObjectNode = Json.newObject
    root.put("author", "jim")
    Ok(root)
  }

}