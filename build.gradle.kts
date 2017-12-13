import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.computas.kotlin"
version = "1.0-SNAPSHOT"

buildscript {
    var kotlinVersion: String by extra
    kotlinVersion = "1.2.0"

    repositories {
        mavenCentral()
        jcenter()
    }
    
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlinVersion))
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.5.9.RELEASE")
    }
    
}

apply {
    plugin("java")
    plugin("kotlin")
    plugin("kotlin-spring")
    plugin("org.springframework.boot")
}

val kotlinVersion: String by extra

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compile(kotlinModule("stdlib-jdk8", kotlinVersion))
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.data:spring-data-jpa")
    compile("org.hibernate:hibernate-core")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

