plugins {
    id("java")
    kotlin("jvm") version "1.9.0"
}

group = "com.example.secondhand"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springframework.boot:spring-boot-starter-security")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.0")
    implementation ("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation ("org.jetbrains.kotlin:kotlin-reflect:1.5.0-M2")
    implementation("jakarta.persistance:jakarta.persistance-api:3.1.0")
    implementation ("org.springframework:spring-context:6.1.11")
    implementation("org.springframework:spring-web:6.1.11")
    implementation("org.springframework.data:spring-data-jpa:3.3.2")
    implementation("org.springframework:spring-webmvc:6.1.11")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    runtimeOnly ("com.h2database:h2")
    runtimeOnly ("mysql:mysql-connector-java")
    testImplementation ("org.springframework.boot:spring-boot-starter-test")
    testImplementation ("org.springframework.security:spring-security-test")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}/*
kotlin {
    jvmToolchain(17)
}*/