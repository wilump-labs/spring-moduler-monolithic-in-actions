dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // Spring Modulith
    implementation("org.springframework.modulith:spring-modulith-starter-core")
    implementation("org.springframework.modulith:spring-modulith-starter-jdbc:${property("springModulithVersion")}")
    implementation("org.springframework.modulith:spring-modulith-events-api:${property("springModulithVersion")}")
    implementation("org.springframework.modulith:spring-modulith-starter-jdbc")

    runtimeOnly("com.mysql:mysql-connector-j")
    testRuntimeOnly("com.h2database:h2")

    // Spring Modulith Testing
    testImplementation("org.springframework.modulith:spring-modulith-starter-test")
}