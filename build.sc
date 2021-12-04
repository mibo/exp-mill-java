import mill._, scalalib._

object main extends JavaModule {

  object test extends Tests with TestModule.Junit4
}

