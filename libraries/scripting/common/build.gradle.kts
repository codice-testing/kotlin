import org.jetbrains.kotlin.gradle.dsl.Coroutinesapply {    plugin("kotlin")}dependencies {    compile(project(":kotlin-script-runtime"))    compile(project(":kotlin-stdlib"))    compile(commonDep("org.jetbrains.kotlinx", "kotlinx-coroutines-core")) { isTransitive = false }}sourceSets {    "main" { projectDefault() }    "test" {}}kotlin.experimental.coroutines = Coroutines.ENABLE