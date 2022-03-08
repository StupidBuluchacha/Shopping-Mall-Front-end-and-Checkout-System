
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

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala")(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/(""" """),_display_(/*1.83*/main("Shopping Cart")/*1.104*/{_display_(Seq[Any](format.raw/*1.105*/(""" """),format.raw/*1.106*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*1.151*/assetsFinder/*1.163*/.path("stylesheets/main.css")),format.raw/*1.192*/(""""> <link rel="shortcut icon" type="image/png" href=""""),_display_(/*1.245*/assetsFinder/*1.257*/.path("images/favicon.png")),format.raw/*1.284*/("""">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet" />

""")))}),format.raw/*4.2*/(""" """),_display_(/*4.4*/defining(play.core.PlayVersion.current)/*4.43*/ { version =>_display_(Seq[Any](format.raw/*4.56*/("""
"""),format.raw/*5.1*/("""<div class="container">
  <div id="content" class="navbar">
    <div class="logo"><img src=""""),_display_(/*7.34*/routes/*7.40*/.Assets.versioned("images/logo.png")),format.raw/*7.76*/("""" width="125px" alt=""></div>
    <nav class="navBar">
      <ul id="MenuItems">
        <li><a href="javascript:void(0);" id="toHome">Home</a></li>
        <li><a href="javascript:void(0);" id="toProducts">Products</a></li>
        <li><a href="javascript:void(0);">About</a></li>
        <li><a href="javascript:void(0);">Contact</a></li>
        <li><a href="javascript:void(0);" id="toCart">MyCart</a></li>
      </ul>
    </nav>
    <img src=""""),_display_(/*17.16*/routes/*17.22*/.Assets.versioned("images/cart.png")),format.raw/*17.58*/("""" width = 30px height = 30px" alt="" > <img src=""""),_display_(/*17.108*/routes/*17.114*/.Assets.versioned("images/menu.png")),format.raw/*17.150*/("""" class="menu-icon" onclick= "menutoggle()">
  </div>
</div>

<div class="small-container cart-page">
  <table>
    <tr>
      <th>Product</th>
      <th>Quantity</th>
      <th>Subtotal</th>
    </tr>
    <tr>
      <td>
        <div class="cart-info">
          <img src=""""),_display_(/*31.22*/routes/*31.28*/.Assets.versioned("images/buy-1.jpg")),format.raw/*31.65*/("""">
          <div>
            <p>Red Printed T-shirt</p>
            <small>Price:$50.00</small>
            <br />
            <a href="javascript:void(0);">Remove</a>
          </div>
        </div>
      </td>
      <td><input type="number" value="1" min="0" class="number" /></td>
      <td class="subTotal">$50.00</td>
    </tr>
    <tr>
      <td>
        <div class="cart-info">
          <img src=""""),_display_(/*46.22*/routes/*46.28*/.Assets.versioned("images/buy-3.jpg")),format.raw/*46.65*/("""">
          <div>
            <p>Black Jean</p>
            <small>Price: $30.00</small>
            <br />
            <a href="javascript:void(0);">Remove</a>
          </div>
        </div>
      </td>
      <td><input type="number" value="1" min="0" class="number" /></td>
      <td class="subTotal">$30.00</td>
    </tr>
    <tr>
      <td>
        <div class="cart-info">
          <img src=""""),_display_(/*61.22*/routes/*61.28*/.Assets.versioned("images/buy-2.jpg")),format.raw/*61.65*/("""">
          <div>
            <p>Designer Trainers</p>
            <small>Price: $70.00</small>
            <br />
            <a href="javascript:void(0);">Remove</a>
          </div>
        </div>
      </td>
      <td><input type="number" value="1" min="0" class="number" /></td>
      <td class="subTotal">$70.00</td>
    </tr>
  </table>

  <div class="total-price">
    <table>
      <tr>
        <td>Total</td>
        <td id="totalPrice">$150.00</td>
      </tr>
    </table>
  </div>
</div>
""")))}),format.raw/*84.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(message,style)(assetsFinder)

  def f:((String,String) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => (assetsFinder) => apply(message,style)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/cart.scala.html
                  HASH: feed31e6baafb4ed6f5b713e151e771bf3c5cf82
                  MATRIX: 748->1|922->80|950->82|980->103|1019->104|1048->105|1120->150|1141->162|1191->191|1271->244|1292->256|1340->283|1485->399|1512->401|1559->440|1609->453|1637->455|1758->550|1772->556|1828->592|2314->1051|2329->1057|2386->1093|2464->1143|2480->1149|2538->1185|2854->1474|2869->1480|2927->1517|3377->1940|3392->1946|3450->1983|3892->2398|3907->2404|3965->2441|4521->2967
                  LINES: 21->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|29->4|29->4|29->4|29->4|30->5|32->7|32->7|32->7|42->17|42->17|42->17|42->17|42->17|42->17|56->31|56->31|56->31|71->46|71->46|71->46|86->61|86->61|86->61|109->84
                  -- GENERATED --
              */
          