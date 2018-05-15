
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object custom3 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customtext: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Custom3</title>
    </head>
    <body>
        <h1>Custom text time!</h1>
        <h2>Your custom text is: <span>"""),_display_(/*10.41*/customtext),format.raw/*10.51*/("""</span></h2>
    </body>
</html>
"""))
      }
    }
  }

  def render(customtext:String): play.twirl.api.HtmlFormat.Appendable = apply(customtext)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (customtext) => apply(customtext)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 09:58:09 CEST 2018
                  SOURCE: C:/Users/rickv/Desktop/play-java-starter-example/app/views/custom3.scala.html
                  HASH: f6ce0c83f6544b5cbf3fa547e5f50b73d0ccfaf5
                  MATRIX: 950->1|1064->22|1091->23|1291->196|1322->206
                  LINES: 28->1|33->2|34->3|41->10|41->10
                  -- GENERATED --
              */
          