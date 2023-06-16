plugins {
    kotlin("jvm")
}

group = "ru.otus.otuskotlin.marketplace"
version = rootProject.version

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":ok-regatta-api-v1-jackson"))
    implementation(project(":ok-regatta-common"))

    testImplementation(kotlin("test-junit"))
}