
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
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * three arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page and an `AssetFinder`
 * to define to reverse route static assets.
 */
  def apply/*8.2*/(title: String)(content: Html)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.69*/("""

"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<meta name="viewport" content="width = device-width, initial-scale=1.0">
        <title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/assetsFinder/*16.66*/.path("stylesheets/main.css")),format.raw/*16.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/assetsFinder/*17.71*/.path("images/favicon.png")),format.raw/*17.98*/("""">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
        <script src=""""),_display_(/*19.23*/assetsFinder/*19.35*/.path("javascripts/hello.js")),format.raw/*19.64*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*23.32*/("""
        """),_display_(/*24.10*/content),format.raw/*24.17*/("""
    """),format.raw/*25.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(assetsFinder)

  def f:((String) => (Html) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (assetsFinder) => apply(title)(content)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 87e6bc63de30332b7b5f4c2bb7867979cac3dbfa
                  MATRIX: 1073->334|1235->401|1266->405|1349->513|1386->523|1503->613|1529->618|1619->681|1640->693|1690->722|1779->784|1800->796|1848->823|2016->964|2037->976|2087->1005|2184->1165|2222->1176|2250->1183|2283->1189
                  LINES: 27->8|32->8|34->10|37->13|38->14|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|43->19|43->19|43->19|46->23|47->24|47->24|48->25
                  -- GENERATED --
              */
          