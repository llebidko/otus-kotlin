
rootProject.name = "otus-kotlin"

//include("m1l1-hello")
include("ok-regatta-acceptance")

include("ok-regatta-api-v1-jackson")
include("ok-regatta-api-v2-kmp")

include("ok-regatta-common")
include("ok-regatta-mappers-v1")
include("ok-regatta-mappers-v2")

pluginManagement {
    val kotlinVersion: String by settings
    val openapiVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion apply false
        kotlin("plugin.serialization") version kotlinVersion apply false
        id("org.openapi.generator") version openapiVersion apply false
    }
}