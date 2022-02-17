plugins {
    kotlin("jvm") version "1.5.10"
}



allprojects {
    group = "dev.hojin.kotlinsample"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    dependencies {
        implementation(kotlin("stdlib"))
    }
}