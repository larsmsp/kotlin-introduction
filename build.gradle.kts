import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.computas.kotlin"
version = "1.0-SNAPSHOT"

buildscript {
  var kotlinVersion: String by extra
  kotlinVersion = "1.2.10"
  var springBootVersion: String by extra
  springBootVersion = "2.0.0.M7"

  repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
  }

  dependencies {
    classpath(kotlinModule("gradle-plugin", kotlinVersion))
    classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
    classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
  }

}

apply {
  plugin("kotlin")
  plugin("kotlin-spring")
  plugin("org.springframework.boot")
}

val kotlinVersion: String by extra
val springBootVersion: String by extra

repositories {
  mavenCentral()
  maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
  compile(kotlinModule("stdlib-jdk8", kotlinVersion))
  compile(kotlinModule("reflect", kotlinVersion))
  compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.2")
  compile("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
  compile("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
  compile("com.h2database:h2:1.4.196")
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}

