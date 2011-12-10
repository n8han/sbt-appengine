import sbt._
object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")).dependsOn(
    uri("git://github.com/siasia/xsbt-web-plugin#caf97184df26dc5e9ea4a8b98747c065fc768b55")
  )
}
