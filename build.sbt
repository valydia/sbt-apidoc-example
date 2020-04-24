import Dependencies._

lazy val sbtApidocExample =
  (project in file("."))
  .aggregate(basic, inherit, versioning, full)

lazy val basic =
    (project in file("basic"))
      .settings(commonSettings)
      .settings(
        name := "basic-example",
        apidocName := name.value,
        apidocVersion := Some("0.3.0"),
        apidocDescription := "A basic apiDoc example"
      )

lazy val inherit =
    (project in file("inherit"))
      .settings(commonSettings)
      .settings(
          name := "example-inherit",
          version := "0.1.0",
          apidocName := name.value,
          apidocVersion := Some("0.1.0"),
          apidocDescription := "apiDoc inherit example"
      )

lazy val versioning =
  (project in file("versioning"))
    .settings(commonSettings)
    .settings(
      name := "example-versioning",
      version := "0.1.0",
      apidocName := name.value,
      apidocVersion := Some("0.2.0"),
      apidocDescription := "apiDoc versioning example"
    )

lazy val full =
  (project in file("full"))
    .settings(commonSettings)
    .settings(
      name := "example-full",
      version := "0.3.0",
      apidocName := "apidoc-example",
      apidocURL:= Some("https://api.github.com/v1"),
      apidocSampleURL:= Some("https://test.github.com/v1"),
      apidocTitle := Some("Custom apiDoc browser title"),
      apidocVersion := Some("0.3.0"),
      apidocDescription := "apiDoc example project",
      apidocHeaderTitle := Some("My own header title"),
      apidocHeaderFile := Some((resourceDirectory in Compile).value / "header.md"),
      apidocFooterTitle := Some("My own footer title"),
      apidocFooterFile := Some((resourceDirectory in Compile).value / "footer.md"),
      apidocOrder := List("GetUser", "PostUser"),
      apidocTemplateCompare := Some(true),
      apidocTemplateGenerator := Some(true)
    )

lazy val commonSettings = Seq {
    organization := "com.example"
    scalaVersion := "2.13.1"
    version      := "0.1.0-SNAPSHOT"
}
