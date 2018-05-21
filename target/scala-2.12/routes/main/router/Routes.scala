// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rickv/Desktop/play-java-starter-example/conf/routes
// @DATE:Mon May 21 14:12:10 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_6: controllers.Assets,
  // @LINE:16
  Custom1Controller_0: controllers.Custom1Controller,
  // @LINE:19
  Custom2Controller_8: controllers.Custom2Controller,
  // @LINE:22
  Custom3Controller_9: controllers.Custom3Controller,
  // @LINE:25
  Custom4Controller_4: controllers.Custom4Controller,
  // @LINE:28
  Custom5Controller_5: controllers.Custom5Controller,
  // @LINE:31
  Custom6Controller_10: controllers.Custom6Controller,
  // @LINE:39
  CustomerController_7: controllers.CustomerController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_6: controllers.Assets,
    // @LINE:16
    Custom1Controller_0: controllers.Custom1Controller,
    // @LINE:19
    Custom2Controller_8: controllers.Custom2Controller,
    // @LINE:22
    Custom3Controller_9: controllers.Custom3Controller,
    // @LINE:25
    Custom4Controller_4: controllers.Custom4Controller,
    // @LINE:28
    Custom5Controller_5: controllers.Custom5Controller,
    // @LINE:31
    Custom6Controller_10: controllers.Custom6Controller,
    // @LINE:39
    CustomerController_7: controllers.CustomerController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_6, Custom1Controller_0, Custom2Controller_8, Custom3Controller_9, Custom4Controller_4, Custom5Controller_5, Custom6Controller_10, CustomerController_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_6, Custom1Controller_0, Custom2Controller_8, Custom3Controller_9, Custom4Controller_4, Custom5Controller_5, Custom6Controller_10, CustomerController_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """custom1""", """controllers.Custom1Controller.example"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """custom2/""" + "$" + """teststring<[^/]+>""", """controllers.Custom2Controller.example(teststring:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """custom3/""" + "$" + """teststring<[^/]+>""", """controllers.Custom3Controller.example(teststring:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """custom4""", """controllers.Custom4Controller.example"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """custom5""", """controllers.Custom5Controller.example"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """custom6""", """controllers.Custom6Controller.example"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """custom6submit""", """controllers.Custom6Controller.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/add/""" + "$" + """newname<[^/]+>""", """controllers.CustomerController.addCustomer(newname:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Custom1Controller_example4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("custom1")))
  )
  private[this] lazy val controllers_Custom1Controller_example4_invoker = createInvoker(
    Custom1Controller_0.example,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Custom1Controller",
      "example",
      Nil,
      "GET",
      this.prefix + """custom1""",
      """ Custom 1: Returns a predetermined string""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Custom2Controller_example5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("custom2/"), DynamicPart("teststring", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Custom2Controller_example5_invoker = createInvoker(
    Custom2Controller_8.example(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Custom2Controller",
      "example",
      Seq(classOf[String]),
      "GET",
      this.prefix + """custom2/""" + "$" + """teststring<[^/]+>""",
      """ Custom 2: Returns a custom string""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Custom3Controller_example6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("custom3/"), DynamicPart("teststring", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Custom3Controller_example6_invoker = createInvoker(
    Custom3Controller_9.example(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Custom3Controller",
      "example",
      Seq(classOf[String]),
      "GET",
      this.prefix + """custom3/""" + "$" + """teststring<[^/]+>""",
      """ Custom 3: Returns a custom string in a fancy page""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Custom4Controller_example7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("custom4")))
  )
  private[this] lazy val controllers_Custom4Controller_example7_invoker = createInvoker(
    Custom4Controller_4.example,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Custom4Controller",
      "example",
      Nil,
      "GET",
      this.prefix + """custom4""",
      """ Custom 4: Returns a class in Json""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Custom5Controller_example8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("custom5")))
  )
  private[this] lazy val controllers_Custom5Controller_example8_invoker = createInvoker(
    Custom5Controller_5.example,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Custom5Controller",
      "example",
      Nil,
      "GET",
      this.prefix + """custom5""",
      """ Custom 5: Returns a class in a webpage""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Custom6Controller_example9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("custom6")))
  )
  private[this] lazy val controllers_Custom6Controller_example9_invoker = createInvoker(
    Custom6Controller_10.example,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Custom6Controller",
      "example",
      Nil,
      "GET",
      this.prefix + """custom6""",
      """ Custom 6: Show a create-your-car form""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Custom6Controller_loginSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("custom6submit")))
  )
  private[this] lazy val controllers_Custom6Controller_loginSubmit10_invoker = createInvoker(
    Custom6Controller_10.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Custom6Controller",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """custom6submit""",
      """ Custom 6: Login submit""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_CustomerController_addCustomer11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/add/"), DynamicPart("newname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerController_addCustomer11_invoker = createInvoker(
    CustomerController_7.addCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerController",
      "addCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """customer/add/""" + "$" + """newname<[^/]+>""",
      """ Add customer""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_Custom1Controller_example4_route(params@_) =>
      call { 
        controllers_Custom1Controller_example4_invoker.call(Custom1Controller_0.example)
      }
  
    // @LINE:19
    case controllers_Custom2Controller_example5_route(params@_) =>
      call(params.fromPath[String]("teststring", None)) { (teststring) =>
        controllers_Custom2Controller_example5_invoker.call(Custom2Controller_8.example(teststring))
      }
  
    // @LINE:22
    case controllers_Custom3Controller_example6_route(params@_) =>
      call(params.fromPath[String]("teststring", None)) { (teststring) =>
        controllers_Custom3Controller_example6_invoker.call(Custom3Controller_9.example(teststring))
      }
  
    // @LINE:25
    case controllers_Custom4Controller_example7_route(params@_) =>
      call { 
        controllers_Custom4Controller_example7_invoker.call(Custom4Controller_4.example)
      }
  
    // @LINE:28
    case controllers_Custom5Controller_example8_route(params@_) =>
      call { 
        controllers_Custom5Controller_example8_invoker.call(Custom5Controller_5.example)
      }
  
    // @LINE:31
    case controllers_Custom6Controller_example9_route(params@_) =>
      call { 
        controllers_Custom6Controller_example9_invoker.call(Custom6Controller_10.example)
      }
  
    // @LINE:34
    case controllers_Custom6Controller_loginSubmit10_route(params@_) =>
      call { 
        controllers_Custom6Controller_loginSubmit10_invoker.call(Custom6Controller_10.loginSubmit)
      }
  
    // @LINE:39
    case controllers_CustomerController_addCustomer11_route(params@_) =>
      call(params.fromPath[String]("newname", None)) { (newname) =>
        controllers_CustomerController_addCustomer11_invoker.call(CustomerController_7.addCustomer(newname))
      }
  }
}
