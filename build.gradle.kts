plugins {
    kotlin("jvm") version "1.3.61"
}

group = "net.rafaeltoledo.aoc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test-junit"))
    testImplementation("com.google.truth:truth:1.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}