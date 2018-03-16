
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,List[models.shopping.ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, orders: List[models.shopping.ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.76*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order", customer)/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
        """)))}),format.raw/*19.10*/("""
        
        """),_display_(/*21.10*/for(order <- orders) yield /*21.30*/ {_display_(Seq[Any](format.raw/*21.32*/("""
            """),format.raw/*22.13*/("""<p>Order Number: """),_display_(/*22.31*/order/*22.36*/.getId),format.raw/*22.42*/("""</p>
            <p>Order Date: """),_display_(/*23.29*/order/*23.34*/.getOrderDateString),format.raw/*23.53*/("""</p>
    
            <table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
                </thead>
                <tbody>
                    """),_display_(/*37.22*/if(order != null)/*37.39*/ {_display_(Seq[Any](format.raw/*37.41*/("""
                        """),format.raw/*38.25*/("""<!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*39.26*/for(i <- order.getItems) yield /*39.50*/ {_display_(Seq[Any](format.raw/*39.52*/("""
                        """),format.raw/*40.25*/("""<tr>
                            <td>"""),_display_(/*41.34*/i/*41.35*/.getProduct.getName),format.raw/*41.54*/("""</td>
                            <td>"""),_display_(/*42.34*/i/*42.35*/.getProduct.getDescription),format.raw/*42.61*/("""</td>
                            <td>&euro; """),_display_(/*43.41*/("%.2f".format(i.getPrice))),format.raw/*43.68*/("""</td>
                            <td>"""),_display_(/*44.34*/i/*44.35*/.getQuantity()),format.raw/*44.49*/("""</td>
                            <td>&euro; """),_display_(/*45.41*/("%.2f".format(i.getItemTotal))),format.raw/*45.72*/("""</td>
                        </tr>
                        """)))}),format.raw/*47.26*/("""<!-- End of For loop -->
                  """)))}),format.raw/*48.20*/("""
                """),format.raw/*49.17*/("""</tbody>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*53.72*/("%.2f".format(order.getOrderTotal))),format.raw/*53.108*/("""</strong></p>
                </div>  
            </div>
    
            <a href=""""),_display_(/*57.23*/routes/*57.29*/.ShoppingCtrl.cancelOrder(order.getId)),format.raw/*57.67*/("""" class="btn btn-primary">Cancel Order</a>
            <br>
            <br>
        """)))}),format.raw/*60.10*/("""
    """),format.raw/*61.5*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,orders:List[models.shopping.ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(customer,orders)

  def f:((models.users.Customer,List[models.shopping.ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (customer,orders) => apply(customer,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 16 10:45:58 GMT 2018
                  SOURCE: /media/sf_student/lab6/app/views/viewOrders.scala.html
                  HASH: 1a44b24f7e007f2e689d9abba9aabe8b81699385
                  MATRIX: 1000->1|1147->79|1183->109|1215->135|1269->75|1298->160|1325->161|1396->207|1427->230|1466->232|1496->235|1569->282|1610->314|1650->316|1683->322|1754->366|1768->371|1804->386|1837->392|1884->408|1930->427|1966->447|2006->449|2047->462|2092->480|2106->485|2133->491|2193->524|2207->529|2247->548|2720->994|2746->1011|2786->1013|2839->1038|2953->1125|2993->1149|3033->1151|3086->1176|3151->1214|3161->1215|3201->1234|3267->1273|3277->1274|3324->1300|3397->1346|3445->1373|3511->1412|3521->1413|3556->1427|3629->1473|3681->1504|3773->1565|3848->1609|3893->1626|4091->1797|4149->1833|4261->1918|4276->1924|4335->1962|4452->2048|4484->2053
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|53->21|53->21|54->22|54->22|54->22|54->22|55->23|55->23|55->23|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|76->44|76->44|76->44|77->45|77->45|79->47|80->48|81->49|85->53|85->53|89->57|89->57|89->57|92->60|93->61
                  -- GENERATED --
              */
          