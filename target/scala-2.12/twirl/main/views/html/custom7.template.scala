
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

object custom7 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[domains.Car,play.twirl.api.HtmlFormat.Appendable] {

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
        <h1>This is your car:</h1>
        <h2>Brand: <span>"""),_display_(/*10.27*/car/*10.30*/.getBrand()),format.raw/*10.41*/("""</span></h2>
        <h2>Amount of tires: <span>"""),_display_(/*11.37*/car/*11.40*/.getTires()),format.raw/*11.51*/("""</span></h2>
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
                  DATE: Tue Apr 24 11:27:42 CEST 2018
                  SOURCE: C:/Users/rickv/Desktop/play-java-starter-example/app/views/custom7.scala.html
                  HASH: 3623c11401860454e0c298503b8f034e583da922
                  MATRIX: 955->1|1067->20|1094->21|1280->180|1292->183|1324->194|1400->243|1412->246|1444->257
                  LINES: 28->1|33->2|34->3|41->10|41->10|41->10|42->11|42->11|42->11
                  -- GENERATED --
              */
          