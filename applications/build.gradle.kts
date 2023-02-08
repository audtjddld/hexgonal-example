import org.springframework.boot.gradle.tasks.bundling.BootJar

apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

dependencies {
    implementation(project(":adapters:out:persistence-rdb"))
    implementation("org.springframework:spring-context:6.0.4")
    implementation("org.springframework:spring-tx:6.0.4")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

val jar: Jar by tasks
jar.enabled = true

val bootJar: BootJar by tasks
bootJar.enabled = false

