// @GENERATOR:play-routes-compiler
// @SOURCE:D:/play/playsite/conf/routes
// @DATE:Wed Apr 25 08:33:15 CST 2018


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
