// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rickv/Desktop/play-java-starter-example/conf/routes
// @DATE:Mon May 21 14:12:10 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:19
  class ReverseCustom2Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def example(teststring:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "custom2/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("teststring", teststring)))
    }
  
  }

  // @LINE:39
  class ReverseCustomerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def addCustomer(newname:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "customer/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("newname", newname)))
    }
  
  }

  // @LINE:31
  class ReverseCustom6Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "custom6submit")
    }
  
    // @LINE:31
    def example(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "custom6")
    }
  
  }

  // @LINE:25
  class ReverseCustom4Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def example(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "custom4")
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:28
  class ReverseCustom5Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def example(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "custom5")
    }
  
  }

  // @LINE:16
  class ReverseCustom1Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def example(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "custom1")
    }
  
  }

  // @LINE:22
  class ReverseCustom3Controller(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def example(teststring:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "custom3/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("teststring", teststring)))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}
