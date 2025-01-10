plugins {
    kotlin("jvm") version "2.0.0"
}

dependencies {
    testImplementation(project(":main"))
    testImplementation("com.github.houbb:junitperf:2.0.7")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.test {
    useJUnitPlatform()
}
