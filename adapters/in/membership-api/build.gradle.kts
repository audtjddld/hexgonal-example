import org.springframework.boot.gradle.tasks.bundling.BootJar

apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation(project(mapOf("path" to ":applications")))
}

val jar: Jar by tasks
jar.enabled = false

val bootJar: BootJar by tasks
bootJar.enabled = true

