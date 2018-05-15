
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

object custom6 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[domains.Car,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(car: domains.Car):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Custom7</title>
    </head>
    <body>
        <h1>Create your own car!</h1>
        <form method="POST" action=""""),_display_(/*10.38*/routes/*10.44*/.Custom6Controller.loginSubmit),format.raw/*10.74*/("""">
            <input type="text" name="brand" value="Volvo">
            <br />
            <input type="number" name="tires" value="4">
            <br />
            <input type="submit">
        </form>
    </body>
</html>
"""))
      }
    }
  }

  def render(car:domains.Car): play.twirl.api.HtmlFormat.Appendable = apply(car)

  def f:((domains.Car) => play.twirl.api.HtmlFormat.Appendable) = (car) => apply(car)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 11:45:41 CEST 2018
                  SOURCE: C:/Users/rickv/Desktop/play-java-starter-example/app/views/custom6.scala.html
                  HASH: c104a84b79f8aecfa21a5beccbd3c4e355f96ad0
                  MATRIX: 955->1|1067->20|1094->21|1294->194|1309->200|1360->230
                  LINES: 28->1|33->2|34->3|41->10|41->10|41->10
                  -- GENERATED --
              */
          