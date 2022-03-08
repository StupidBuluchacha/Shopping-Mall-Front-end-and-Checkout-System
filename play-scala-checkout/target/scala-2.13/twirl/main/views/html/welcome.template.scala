
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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "scala"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/(""" """),_display_(/*1.46*/defining(play.core.PlayVersion.current)/*1.85*/ { version =>_display_(Seq[Any](format.raw/*1.98*/("""

"""),format.raw/*3.1*/("""<div class="header">
  <div class="container">
    <div id="content" class="navbar">
      <div class="logo"><img src=""""),_display_(/*6.36*/routes/*6.42*/.Assets.versioned("images/logo.png")),format.raw/*6.78*/("""" width="125px" alt=""></div>
      <nav class="navBar">
        <ul id="MenuItems">
          <li><a href="javascript:void(0);" id="toHome">Home</a></li>
          <li><a href="javascript:void(0);" id="toProducts">Products</a></li>
          <li><a href="javascript:void(0);">About</a></li>
          <li><a href="javascript:void(0);">Contact</a></li>
          <li><a href="javascript:void(0);" id="toCart">MyCart</a></li>
        </ul>
      </nav>
      <img src=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("images/cart.png")),format.raw/*16.60*/("""" width = 30px height = 30px" alt="" > <img src=""""),_display_(/*16.110*/routes/*16.116*/.Assets.versioned("images/menu.png")),format.raw/*16.152*/("""" class="menu-icon" onclick= "menutoggle()">
    </div>
    <div class="row">
      <div class="col-2">
        <h1>
          Give your workout <br />
          a new style
        </h1>
        <p>Success isnt always about greatness. Its about consistency. Consistent <br />hard work gains success. Greatness will come.</p>
        <a href="" class="btn">Explore Now &#8594;</a>
      </div>
      <div class="col-2"><img src=""""),_display_(/*27.37*/routes/*27.43*/.Assets.versioned("images/image1.png")),format.raw/*27.81*/("""" ></div>
    </div>
  </div>
</div>

<div class="categories">
  <div class="small-container">
    <div class="row">
      <div class="col-3"><img src=""""),_display_(/*35.37*/routes/*35.43*/.Assets.versioned("images/category-1.jpg")),format.raw/*35.85*/("""" ></div>
      <div class="col-3"><img src=""""),_display_(/*36.37*/routes/*36.43*/.Assets.versioned("images/category-2.jpg")),format.raw/*36.85*/("""" ></div>
      <div class="col-3"><img src=""""),_display_(/*37.37*/routes/*37.43*/.Assets.versioned("images/category-3.jpg")),format.raw/*37.85*/("""" ></div>
    </div>
  </div>
</div>

<div class="small-container">
  <h2 class="title">Featured Products</h2>
  <div class="row">
    <div class="col-4">
      <img src=""""),_display_(/*46.18*/routes/*46.24*/.Assets.versioned("images/product-1.jpg")),format.raw/*46.65*/("""" >
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
      <img src=""""),_display_(/*58.18*/routes/*58.24*/.Assets.versioned("images/product-2.jpg")),format.raw/*58.65*/("""" alt="">
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
      <img src=""""),_display_(/*70.18*/routes/*70.24*/.Assets.versioned("images/product-4.jpg")),format.raw/*70.65*/("""" >
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
  <h2 class="title">Latest Products</h2>
  <div class="row">
    <div class="col-4">
      <img src=""""),_display_(/*85.18*/routes/*85.24*/.Assets.versioned("images/product-5.jpg")),format.raw/*85.65*/("""" >
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
      <img src=""""),_display_(/*97.18*/routes/*97.24*/.Assets.versioned("images/product-6.jpg")),format.raw/*97.65*/("""" >
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
      <img src=""""),_display_(/*109.18*/routes/*109.24*/.Assets.versioned("images/product-7.jpg")),format.raw/*109.65*/("""" >
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
    <div class="col-4">
      <img src=""""),_display_(/*121.18*/routes/*121.24*/.Assets.versioned("images/product-10.jpg")),format.raw/*121.66*/("""" >
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
  </div>
  <div class="row">
    <div class="col-4">
      <img src=""""),_display_(/*135.18*/routes/*135.24*/.Assets.versioned("images/product-8.jpg")),format.raw/*135.65*/("""" >
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
      <img src=""""),_display_(/*147.18*/routes/*147.24*/.Assets.versioned("images/product-9.jpg")),format.raw/*147.65*/("""" >
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
      <img src=""""),_display_(/*159.18*/routes/*159.24*/.Assets.versioned("images/product-3.jpg")),format.raw/*159.65*/("""" >
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
    <div class="col-4">
      <img src=""""),_display_(/*171.18*/routes/*171.24*/.Assets.versioned("images/product-11.jpg")),format.raw/*171.66*/("""" >
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
  </div>
  <div class="offer">
    <div class="small-container">
      <div class="row">
        <div class="col-2"><img src=""""),_display_(/*186.39*/routes/*186.45*/.Assets.versioned("images/exclusive.png")),format.raw/*186.86*/("""" class="offer-img"></div>
        <div class="col-2">
          <p>Exclusively Available on this site</p>
          <h1>Smart Band 4</h1>
          <small> The Mi Smart Band 4 features a 39.9%</small>
          <a href="" class="btn">Buy Now &#8594;</a>
        </div>
      </div>
    </div>
  </div>
</div>

<div class="testimonial">
  <div class="small-container">
    <div class="row">
      <div class="col-3">
        <i class="fa fa-quote-left"></i>
        <p>random paragraph saying something irrelvant</p>
        <div class="rating">
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star-half"></i>
        </div>
        <img src=""""),_display_(/*211.20*/routes/*211.26*/.Assets.versioned("images/user-1.png")),format.raw/*211.64*/("""">
        <h3>Sean Johnson</h3>
      </div>
      <div class="col-3">
        <i class="fa fa-quote-left"></i>
        <p>random paragraph two saying something irrelevant</p>
        <div class="rating">
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star-half"></i>
        </div>
        <img src=""""),_display_(/*224.20*/routes/*224.26*/.Assets.versioned("images/user-2.png")),format.raw/*224.64*/("""">
        <h3>Paper Johnson</h3>
      </div>
      <div class="col-3">
        <i class="fa fa-quote-left"></i>
        <p>random paragraph threesaying something irrelevant</p>
        <div class="rating">
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star"></i>
          <i class="fa fa-star-half"></i>
        </div>
        <img src=""""),_display_(/*237.20*/routes/*237.26*/.Assets.versioned("images/user-3.png")),format.raw/*237.64*/("""">
        <h3>Lucy Stone</h3>
      </div>
    </div>
  </div>
</div>
<div class="brands">
  <div class="small-container">
    <div class="row">
      <div class="col-5"><img src=""""),_display_(/*246.37*/routes/*246.43*/.Assets.versioned("images/logo-godrej.png")),format.raw/*246.86*/(""""></div>
      <div class="col-5"><img src=""""),_display_(/*247.37*/routes/*247.43*/.Assets.versioned("images/logo-oppo.png")),format.raw/*247.84*/(""""></div>
      <div class="col-5"><img src=""""),_display_(/*248.37*/routes/*248.43*/.Assets.versioned("images/logo-coca-cola.png")),format.raw/*248.89*/(""""></div>
      <div class="col-5"><img src=""""),_display_(/*249.37*/routes/*249.43*/.Assets.versioned("images/logo-paypal.png")),format.raw/*249.86*/(""""></div>
      <div class="col-5"><img src=""""),_display_(/*250.37*/routes/*250.43*/.Assets.versioned("images/logo-philips.png")),format.raw/*250.87*/(""""></div>
    </div>
  </div>
</div>
<script>
  var MenuItems = document.getElementById('MenuItems')

  MenuItems.style.maxHeight = '0px'

  function menutoggle() """),format.raw/*259.25*/("""{"""),format.raw/*259.26*/("""
    """),format.raw/*260.5*/("""if (MenuItems.style.maxHeight == '0px') """),format.raw/*260.45*/("""{"""),format.raw/*260.46*/("""
      """),format.raw/*261.7*/("""MenuItems.style.maxHeight = '200px'
    """),format.raw/*262.5*/("""}"""),format.raw/*262.6*/(""" """),format.raw/*262.7*/("""else """),format.raw/*262.12*/("""{"""),format.raw/*262.13*/("""
      """),format.raw/*263.7*/("""MenuItems.style.maxHeight = '0px'
    """),format.raw/*264.5*/("""}"""),format.raw/*264.6*/("""
  """),format.raw/*265.3*/("""}"""),format.raw/*265.4*/("""
"""),format.raw/*266.1*/("""</script>
""")))}),format.raw/*267.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/welcome.scala.html
                  HASH: 397d1f876d8437462996aa4585df2aab5e7f62f3
                  MATRIX: 738->1|875->43|903->45|950->84|1000->97|1030->101|1179->224|1193->230|1249->266|1755->745|1770->751|1827->787|1905->837|1921->843|1979->879|2447->1320|2462->1326|2521->1364|2709->1525|2724->1531|2787->1573|2861->1620|2876->1626|2939->1668|3013->1715|3028->1721|3091->1763|3299->1944|3314->1950|3376->1991|3742->2330|3757->2336|3819->2377|4191->2722|4206->2728|4268->2769|4711->3185|4726->3191|4788->3232|5154->3571|5169->3577|5231->3618|5598->3957|5614->3963|5677->4004|6048->4347|6064->4353|6128->4395|6526->4765|6542->4771|6605->4812|6972->5151|6988->5157|7051->5198|7418->5537|7434->5543|7497->5584|7868->5927|7884->5933|7948->5975|8404->6403|8420->6409|8483->6450|9306->7245|9322->7251|9382->7289|9853->7732|9869->7738|9929->7776|10402->8221|10418->8227|10478->8265|10697->8456|10713->8462|10778->8505|10852->8551|10868->8557|10931->8598|11005->8644|11021->8650|11089->8696|11163->8742|11179->8748|11244->8791|11318->8837|11334->8843|11400->8887|11600->9058|11630->9059|11664->9065|11733->9105|11763->9106|11799->9114|11868->9155|11897->9156|11926->9157|11960->9162|11990->9163|12026->9171|12093->9210|12122->9211|12154->9215|12183->9216|12213->9218|12256->9230
                  LINES: 21->1|26->1|26->1|26->1|26->1|28->3|31->6|31->6|31->6|41->16|41->16|41->16|41->16|41->16|41->16|52->27|52->27|52->27|60->35|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|71->46|71->46|71->46|83->58|83->58|83->58|95->70|95->70|95->70|110->85|110->85|110->85|122->97|122->97|122->97|134->109|134->109|134->109|146->121|146->121|146->121|160->135|160->135|160->135|172->147|172->147|172->147|184->159|184->159|184->159|196->171|196->171|196->171|211->186|211->186|211->186|236->211|236->211|236->211|249->224|249->224|249->224|262->237|262->237|262->237|271->246|271->246|271->246|272->247|272->247|272->247|273->248|273->248|273->248|274->249|274->249|274->249|275->250|275->250|275->250|284->259|284->259|285->260|285->260|285->260|286->261|287->262|287->262|287->262|287->262|287->262|288->263|289->264|289->264|290->265|290->265|291->266|292->267
                  -- GENERATED --
              */
          