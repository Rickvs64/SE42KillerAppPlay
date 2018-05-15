// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rickv/Desktop/play-java-starter-example/conf/routes
// @DATE:Tue Apr 24 11:50:40 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
