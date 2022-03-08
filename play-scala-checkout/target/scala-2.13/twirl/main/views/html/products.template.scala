
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala")(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/(""" """),_display_(/*1.83*/main("Products")/*1.99*/{_display_(Seq[Any](format.raw/*1.100*/(""" """),format.raw/*1.101*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*1.146*/assetsFinder/*1.158*/.path("stylesheets/main.css")),format.raw/*1.187*/(""""> <link rel="shortcut icon" type="image/png" href=""""),_display_(/*1.240*/assetsFinder/*1.252*/.path("images/favicon.png")),format.raw/*1.279*/("""">
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

<div class="small-container">
  <h2 class="title">All Products</h2>
  <!--comment out -->
  <div class="row row-2">
    <h2>All Products</h2>
    <select>
      <option>Default Sorting</option>
      <option>Sort by price</option>
      <option>Sort by popularity</option>
      <option>Sort by rating</option>
    </select>
  </div>
  <div class="row">
    <div class="col-4" id="product1">
      <img src=""""),_display_(/*35.18*/routes/*35.24*/.Assets.versioned("images/product-1.jpg")),format.raw/*35.65*/("""" >
      <h4>Red Printed T-shirt</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="far fa-star"></i>
      </div>
      <p>$50.00</p>
    </div>
    <div class="col-4">
      <img src=""""),_display_(/*47.18*/routes/*47.24*/.Assets.versioned("images/product-2.jpg")),format.raw/*47.65*/("""" alt="">
      <h4>HRX 4000 Sports Shoes</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="far fa-star"></i>
      </div>
      <p>$70.00</p>
    </div>
    <div class="col-4">
      <img src=""""),_display_(/*59.18*/routes/*59.24*/.Assets.versioned("images/product-4.jpg")),format.raw/*59.65*/("""" >
      <h4>Black Printed T-shirt</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star-half"></i>
      </div>
      <p>$30.00</p>
    </div>
  </div>

  <div class="row">
    <div class="col-4">
      <img src=""""),_display_(/*74.18*/routes/*74.24*/.Assets.versioned("images/product-1.jpg")),format.raw/*74.65*/("""" >
      <h4>Red Printed T-shirt</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="far fa-star"></i>
      </div>
      <p>$50.00</p>
    </div>
    <div class="col-4">
      <img src=""""),_display_(/*86.18*/routes/*86.24*/.Assets.versioned("images/product-2.jpg")),format.raw/*86.65*/("""" alt="">
      <h4>HRX 4000 Sports Shoes</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="far fa-star"></i>
      </div>
      <p>$70.00</p>
    </div>
    <div class="col-4">
      <img src=""""),_display_(/*98.18*/routes/*98.24*/.Assets.versioned("images/product-8.jpg")),format.raw/*98.65*/("""" >
      <h4>Black Fossil Watch</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star-half"></i>
      </div>
      <p>$30.00</p>
    </div>
  </div>

  <div class="row">
    <div class="col-4">
      <img src=""""),_display_(/*113.18*/routes/*113.24*/.Assets.versioned("images/product-9.jpg")),format.raw/*113.65*/("""" >
      <h4>Black Fossil Watch</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="far fa-star"></i>
      </div>
      <p>$50.00</p>
    </div>
    <div class="col-4">
      <img src=""""),_display_(/*125.18*/routes/*125.24*/.Assets.versioned("images/product-10.jpg")),format.raw/*125.66*/("""" alt="">
      <h4>HRX 4000 Sports Shoes</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="far fa-star"></i>
      </div>
      <p>$70.00</p>
    </div>
    <div class="col-4">
      <img src=""""),_display_(/*137.18*/routes/*137.24*/.Assets.versioned("images/product-11.jpg")),format.raw/*137.66*/("""" >
      <h4>HRX 5000 Sports Shoes</h4>
      <div class="rating">
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star"></i>
        <i class="fa fa-star-half"></i>
      </div>
      <p>$30.00</p>
    </div>
  </div>
  <div class="page-btn">
    <span>1</span>
    <span>2</span>
    <span>3</span>
    <span>4</span>
    <span>&#8594;</span>
  </div>
</div>

<script>
  var MenuItems = document.getElementById('MenuItems')

  MenuItems.style.maxHeight = '0px'

  function menutoggle() """),format.raw/*163.25*/("""{"""),format.raw/*163.26*/("""
    """),format.raw/*164.5*/("""if (MenuItems.style.maxHeight == '0px') """),format.raw/*164.45*/("""{"""),format.raw/*164.46*/("""
      """),format.raw/*165.7*/("""MenuItems.style.maxHeight = '200px'
    """),format.raw/*166.5*/("""}"""),format.raw/*166.6*/(""" """),format.raw/*166.7*/("""else """),format.raw/*166.12*/("""{"""),format.raw/*166.13*/("""
      """),format.raw/*167.7*/("""MenuItems.style.maxHeight = '0px'
    """),format.raw/*168.5*/("""}"""),format.raw/*168.6*/("""
  """),format.raw/*169.3*/("""}"""),format.raw/*169.4*/("""
"""),format.raw/*170.1*/("""</script>
""")))}),format.raw/*171.2*/("""
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
                  SOURCE: app/views/products.scala.html
                  HASH: ecc152ca3dccf9cdd7d73f35b233f84eec03404b
                  MATRIX: 752->1|926->80|954->82|978->98|1017->99|1046->100|1118->145|1139->157|1189->186|1269->239|1290->251|1338->278|1483->394|1510->396|1557->435|1607->448|1635->450|1756->545|1770->551|1826->587|2312->1046|2327->1052|2384->1088|2462->1138|2478->1144|2536->1180|3052->1669|3067->1675|3129->1716|3495->2055|3510->2061|3572->2102|3946->2449|3961->2455|4023->2496|4428->2874|4443->2880|4505->2921|4871->3260|4886->3266|4948->3307|5322->3654|5337->3660|5399->3701|5802->4076|5818->4082|5881->4123|6247->4461|6263->4467|6327->4509|6702->4856|6718->4862|6782->4904|7407->5500|7437->5501|7471->5507|7540->5547|7570->5548|7606->5556|7675->5597|7704->5598|7733->5599|7767->5604|7797->5605|7833->5613|7900->5652|7929->5653|7961->5657|7990->5658|8020->5660|8063->5672
                  LINES: 21->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|29->4|29->4|29->4|29->4|30->5|32->7|32->7|32->7|42->17|42->17|42->17|42->17|42->17|42->17|60->35|60->35|60->35|72->47|72->47|72->47|84->59|84->59|84->59|99->74|99->74|99->74|111->86|111->86|111->86|123->98|123->98|123->98|138->113|138->113|138->113|150->125|150->125|150->125|162->137|162->137|162->137|188->163|188->163|189->164|189->164|189->164|190->165|191->166|191->166|191->166|191->166|191->166|192->167|193->168|193->168|194->169|194->169|195->170|196->171
                  -- GENERATED --
              */
          