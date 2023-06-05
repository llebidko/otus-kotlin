
rootProject.name = "otus-kotlin"

//include("m1l1-hello")
include("ok-marketplace-acceptance")

pluginManagement {
    val kotlinVersion: String by settings
    plugins {
        kotlin("jvm") version kotlinVersion apply false
    }
}