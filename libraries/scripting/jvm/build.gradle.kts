import org.jetbrains.kotlin.gradle.dsl.Coroutinesapply {    plugin("kotlin")}dependencies {    compile(project(":kotlin-script-runtime"))    compile(project(":kotlin-stdlib"))    compile(project(":kotlin-scripting-common"))    compileOnly(project(":compiler:cli"))    compile(intellijCoreDep())}sourceSets {    "main" { projectDefault() }    "test" {}}kotlin.experimental.coroutines = Coroutines.ENABLE