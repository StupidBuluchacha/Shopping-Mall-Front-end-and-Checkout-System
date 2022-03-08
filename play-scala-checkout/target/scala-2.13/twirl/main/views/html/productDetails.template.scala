
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

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala")(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.81*/("""
"""),_display_(/*2.2*/main("Product Details")/*2.25*/{_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.50*/assetsFinder/*3.62*/.path("stylesheets/main.css")),format.raw/*3.91*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*4.55*/assetsFinder/*4.67*/.path("images/favicon.png")),format.raw/*4.94*/("""">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">

""")))}),format.raw/*7.2*/("""
"""),_display_(/*8.2*/defining(play.core.PlayVersion.current)/*8.41*/ { version =>_display_(Seq[Any](format.raw/*8.54*/("""
    """),format.raw/*9.5*/("""<div class="container">
        <div id="content" class="navbar">
            <div class="logo">
                <img src=""""),_display_(/*12.28*/routes/*12.34*/.Assets.versioned("images/logo.png")),format.raw/*12.70*/("""" width="125px" alt="">
            </div>
            <nav class="navBar">
                <ul id = "MenuItems">
                    <li><a href="javascript:void(0);" id="toHome">Home</a></li>
                    <li><a href="javascript:void(0);" id="toProducts">Products</a></li>
                    <li><a href="javascript:void(0);">About</a></li>
                    <li><a href="javascript:void(0);">Contact</a></li>
                    <li><a href="javascript:void(0);" id="toCart">MyCart</a></li>
                </ul>
            </nav>
            <img src=""""),_display_(/*23.24*/routes/*23.30*/.Assets.versioned("images/cart.png")),format.raw/*23.66*/("""" width = 30px height = 30px" alt="" >
            <img src=""""),_display_(/*24.24*/routes/*24.30*/.Assets.versioned("images/menu.png")),format.raw/*24.66*/("""" class="menu-icon"
            onclick= "menutoggle()">

        </div>
    </div>

    <div class="small-container single-product">
        <div class="row">
            <div class="col-2">
                <img src=""""),_display_(/*33.28*/routes/*33.34*/.Assets.versioned("images/gallery-1.jpg")),format.raw/*33.75*/("""" width = 100% id="ProductImg">

                <div class="small-img-row">
                    <div class="small-img-col">
                        <img src=""""),_display_(/*37.36*/routes/*37.42*/.Assets.versioned("images/gallery-1.jpg")),format.raw/*37.83*/("""" width = 100%" alt="" class="small-img">
                    </div>
                    <div class="small-img-col">
                        <img src=""""),_display_(/*40.36*/routes/*40.42*/.Assets.versioned("images/gallery-2.jpg")),format.raw/*40.83*/("""" width = 100%" alt="" class="small-img">
                    </div>
                    <div class="small-img-col">
                        <img src=""""),_display_(/*43.36*/routes/*43.42*/.Assets.versioned("images/gallery-3.jpg")),format.raw/*43.83*/("""" width = 100%" alt="" class="small-img">
                    </div>
                    <div class="small-img-col">
                        <img src=""""),_display_(/*46.36*/routes/*46.42*/.Assets.versioned("images/gallery-4.jpg")),format.raw/*46.83*/("""" width = 100%" alt="" class="small-img">
                    </div>
                </div>
            </div>
            <div class="col-2">
                <p>Home/T-shirt</p>
                <h1> Red Printed T shirt</h1>
                <h4>$50.00</h4>
                <select>
                    <option>Select Size</option>
                    <option>XL</option>
                    <option>Large</option>
                    <option>Medium</option>
                    <option>Small</option>
                </select>
                <input type="number" value="1">
                <a href="" class="btn">Add to Cart</a>
                <h3>Product details <i class="fa fa-indent"></i>
                </h3>
                <br>
                <p>this is random text describing the procuct</p>
            </div>
        </div>
    </div>

        <div class="small-container">
            <div class= "row row-2">
                <h2>Related Products</h2>
            </div>
        </div>
    <div class="small-container">
            <!--comment out -->
        <div class = "row">
            <div class="col-4">
                <img src=""""),_display_(/*80.28*/routes/*80.34*/.Assets.versioned("images/product-1.jpg")),format.raw/*80.75*/("""" >
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
                <img src=""""),_display_(/*92.28*/routes/*92.34*/.Assets.versioned("images/product-2.jpg")),format.raw/*92.75*/(""""  alt="">
                <h4>Red Printed T-shirt</h4>
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
                <img src=""""),_display_(/*104.28*/routes/*104.34*/.Assets.versioned("images/product-4.jpg")),format.raw/*104.75*/("""" >
                <h4>Red Printed T-shirt</h4>
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
    </div>

    <script>
            var MenuItems = document.getElementById("MenuItems");

            MenuItems.style.maxHeight = "0px";

            function menutoggle()"""),format.raw/*123.34*/("""{"""),format.raw/*123.35*/("""
                """),format.raw/*124.17*/("""if(MenuItems.style.maxHeight == "0px")
                """),format.raw/*125.17*/("""{"""),format.raw/*125.18*/("""
                    """),format.raw/*126.21*/("""MenuItems.style.maxHeight = "200px"

                """),format.raw/*128.17*/("""}"""),format.raw/*128.18*/("""else """),format.raw/*128.23*/("""{"""),format.raw/*128.24*/("""
                    """),format.raw/*129.21*/("""MenuItems.style.maxHeight = "0px";
                """),format.raw/*130.17*/("""}"""),format.raw/*130.18*/("""
            """),format.raw/*131.13*/("""}"""),format.raw/*131.14*/("""
    """),format.raw/*132.5*/("""</script>

    <script>
        var ProductImg = document.getElementById("ProductImg");
        var SmallImg = document.getElementsByClassName("small-img");


        SmallImg[0].onclick = function()
        """),format.raw/*140.9*/("""{"""),format.raw/*140.10*/("""
            """),format.raw/*141.13*/("""ProductImg.src = SmallImg[0].src;
        """),format.raw/*142.9*/("""}"""),format.raw/*142.10*/("""
        """),format.raw/*143.9*/("""SmallImg[1].onclick = function()
        """),format.raw/*144.9*/("""{"""),format.raw/*144.10*/("""
            """),format.raw/*145.13*/("""ProductImg.src = SmallImg[1].src;
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/("""
        """),format.raw/*147.9*/("""SmallImg[2].onclick = function()
        """),format.raw/*148.9*/("""{"""),format.raw/*148.10*/("""
            """),format.raw/*149.13*/("""ProductImg.src = SmallImg[2].src;
        """),format.raw/*150.9*/("""}"""),format.raw/*150.10*/("""
        """),format.raw/*151.9*/("""SmallImg[3].onclick = function()
        """),format.raw/*152.9*/("""{"""),format.raw/*152.10*/("""
            """),format.raw/*153.13*/("""ProductImg.src = SmallImg[3].src;
        """),format.raw/*154.9*/("""}"""),format.raw/*154.10*/("""

    """),format.raw/*156.5*/("""</script>
""")))}),format.raw/*157.2*/("""

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
                  SOURCE: app/views/productDetails.scala.html
                  HASH: 5ba5187e533ef2b5ab0a17884ab511226eb2617d
                  MATRIX: 758->1|932->80|960->83|991->106|1029->107|1061->113|1132->158|1152->170|1201->199|1285->257|1305->269|1352->296|1499->414|1527->417|1574->456|1624->469|1656->475|1810->602|1825->608|1882->644|2488->1223|2503->1229|2560->1265|2650->1328|2665->1334|2722->1370|2977->1598|2992->1604|3054->1645|3245->1809|3260->1815|3322->1856|3504->2011|3519->2017|3581->2058|3763->2213|3778->2219|3840->2260|4022->2415|4037->2421|4099->2462|5314->3650|5329->3656|5391->3697|5883->4162|5898->4168|5960->4209|6460->4681|6476->4687|6539->4728|7173->5333|7203->5334|7250->5352|7335->5408|7365->5409|7416->5431|7500->5486|7530->5487|7564->5492|7594->5493|7645->5515|7726->5567|7756->5568|7799->5582|7829->5583|7863->5589|8107->5805|8137->5806|8180->5820|8251->5863|8281->5864|8319->5874|8389->5916|8419->5917|8462->5931|8533->5974|8563->5975|8601->5985|8671->6027|8701->6028|8744->6042|8815->6085|8845->6086|8883->6096|8953->6138|8983->6139|9026->6153|9097->6196|9127->6197|9163->6205|9206->6217
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|28->3|28->3|28->3|29->4|29->4|29->4|32->7|33->8|33->8|33->8|34->9|37->12|37->12|37->12|48->23|48->23|48->23|49->24|49->24|49->24|58->33|58->33|58->33|62->37|62->37|62->37|65->40|65->40|65->40|68->43|68->43|68->43|71->46|71->46|71->46|105->80|105->80|105->80|117->92|117->92|117->92|129->104|129->104|129->104|148->123|148->123|149->124|150->125|150->125|151->126|153->128|153->128|153->128|153->128|154->129|155->130|155->130|156->131|156->131|157->132|165->140|165->140|166->141|167->142|167->142|168->143|169->144|169->144|170->145|171->146|171->146|172->147|173->148|173->148|174->149|175->150|175->150|176->151|177->152|177->152|178->153|179->154|179->154|181->156|182->157
                  -- GENERATED --
              */
          