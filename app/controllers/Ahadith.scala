package controllers

import play.api.libs.json.Json
import play.api.mvc._

object Ahadith extends Controller {

  def index = Action {
    val json = Json.parse("""{"comment" : "Hi"}""")
    Ok(json)
  }

}