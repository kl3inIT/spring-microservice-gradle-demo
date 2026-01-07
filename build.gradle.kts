plugins {
//    id("org.springframework.boot") version "3.2.6" apply false
//    id("io.spring.dependency-management") version "1.1.5" apply false

}

group = "com.example"
version = "0.0.1-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    plugins.apply("java")
    extensions.configure<JavaPluginExtension> {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(25))
        }
    }
}
