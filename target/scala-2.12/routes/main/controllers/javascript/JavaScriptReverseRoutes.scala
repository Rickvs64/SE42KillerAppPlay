// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rickv/Desktop/play-java-starter-example/conf/routes
// @DATE:Tue Jun 05 12:04:39 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseCustom2Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def example: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Custom2Controller.example",
      """
        function(teststring0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "custom2/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("teststring", teststring0))})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseCustomerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def getCustomerById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.getCustomerById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/getbyid/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def addCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.addCustomer",
      """
        function(newname0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/add/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("newname", newname0))})
        }
      """
    )
  
    // @LINE:42
    def getAllCustomers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerController.getAllCustomers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/getall"})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseCustom6Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Custom6Controller.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "custom6submit"})
        }
      """
    )
  
    // @LINE:31
    def example: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Custom6Controller.example",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "custom6"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseCustom4Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def example: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Custom4Controller.example",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "custom4"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseCustom5Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def example: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Custom5Controller.example",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "custom5"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseCustom1Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def example: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Custom1Controller.example",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "custom1"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseCustom3Controller(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def example: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Custom3Controller.example",
      """
        function(teststring0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "custom3/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("teststring", teststring0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:50
  class ReverseAccountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getAllAccounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.getAllAccounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/getall"})
        }
      """
    )
  
    // @LINE:59
    def addAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.addAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/add"})
        }
      """
    )
  
    // @LINE:62
    def updateAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.updateAccount",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "account/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:65
    def addAccountJWT: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.addAccountJWT",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/addJWT"})
        }
      """
    )
  
    // @LINE:53
    def getAccountById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.getAccountById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/getbyid/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:68
    def getToken: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.getToken",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/getToken/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:56
    def deleteAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AccountController.deleteAccount",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
