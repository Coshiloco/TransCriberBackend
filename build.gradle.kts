import org.springframework.cloud.contract.verifier.config.TestMode

plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    id("org.springframework.boot") version "3.3.6"
    id("io.spring.dependency-management") version "1.1.6"
    id("com.netflix.dgs.codegen") version "6.2.1"
    id("org.graalvm.buildtools.native") version "0.10.3"
    id("org.cyclonedx.bom") version "1.10.0"
    id("org.springframework.cloud.contract") version "4.1.4"
    id("org.asciidoctor.jvm.convert") version "3.3.2"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
}

extra["snippetsDir"] = file("build/generated-snippets")
extra["solaceSpringBootVersion"] = "2.2.0"
extra["springAiVersion"] = "1.0.0-M4"
extra["springBootAdminVersion"] = "3.3.6"
extra["springCloudGcpVersion"] = "5.8.0"
extra["springCloudVersion"] = "2023.0.3"
extra["springModulithVersion"] = "1.2.4"
extra["springShellVersion"] = "3.3.3"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-batch")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
    implementation("org.springframework.boot:spring-boot-starter-data-ldap")
    implementation("org.springframework.boot:spring-boot-starter-data-redis-reactive")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("org.springframework.boot:spring-boot-starter-hateoas")
    implementation("org.springframework.boot:spring-boot-starter-integration")
    implementation("org.springframework.boot:spring-boot-starter-jersey")
    implementation("org.springframework.boot:spring-boot-starter-mail")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-authorization-server")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
    implementation("org.springframework.boot:spring-boot-starter-quartz")
    implementation("org.springframework.boot:spring-boot-starter-rsocket")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web-services")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-websocket")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.google.cloud:spring-cloud-gcp-starter")
    implementation("com.google.cloud:spring-cloud-gcp-starter-pubsub")
    implementation("com.google.cloud:spring-cloud-gcp-starter-storage")
    implementation("com.okta.spring:okta-spring-boot-starter:3.0.7")
    implementation("com.solace.spring.boot:solace-spring-boot-starter")
    implementation("de.codecentric:spring-boot-admin-starter-client")
    implementation("de.codecentric:spring-boot-admin-starter-server")
    implementation("io.micrometer:micrometer-tracing-bridge-brave")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("io.zipkin.reporter2:zipkin-reporter-brave")
    implementation("org.apache.camel.springboot:camel-spring-boot-starter:4.8.1")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("org.springframework.ai:spring-ai-anthropic-spring-boot-starter")
    implementation("org.springframework.ai:spring-ai-elasticsearch-store-spring-boot-starter")
    implementation("org.springframework.ai:spring-ai-openai-spring-boot-starter")
    implementation("org.springframework.ai:spring-ai-pdf-document-reader")
    implementation("org.springframework.ai:spring-ai-postgresml-spring-boot-starter")
    implementation("org.springframework.ai:spring-ai-redis-store-spring-boot-starter")
    implementation("org.springframework.cloud:spring-cloud-function-web")
    implementation("org.springframework.cloud:spring-cloud-starter")
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")
    implementation("org.springframework.cloud:spring-cloud-starter-gateway-mvc")
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
    implementation("org.springframework.cloud:spring-cloud-starter-task")
    implementation("org.springframework.data:spring-data-rest-hal-explorer")
    implementation("org.springframework.integration:spring-integration-mail")
    implementation("org.springframework.integration:spring-integration-redis")
    implementation("org.springframework.integration:spring-integration-rsocket")
    implementation("org.springframework.integration:spring-integration-stomp")
    implementation("org.springframework.integration:spring-integration-webflux")
    implementation("org.springframework.integration:spring-integration-websocket")
    implementation("org.springframework.integration:spring-integration-ws")
    implementation("org.springframework.modulith:spring-modulith-starter-core")
    implementation("org.springframework.security:spring-security-messaging")
    implementation("org.springframework.security:spring-security-messaging")
    implementation("org.springframework.security:spring-security-rsocket")
    implementation("org.springframework.session:spring-session-data-redis")
    implementation("org.springframework.shell:spring-shell-starter")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
    runtimeOnly("io.micrometer:micrometer-registry-prometheus")
    runtimeOnly("org.postgresql:postgresql")
    developmentOnly("org.springframework.ai:spring-ai-spring-boot-docker-compose")
    runtimeOnly("org.springframework.modulith:spring-modulith-actuator")
    runtimeOnly("org.springframework.modulith:spring-modulith-observability")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("io.projectreactor:reactor-test")
    testImplementation("io.rest-assured:spring-web-test-client")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation("org.springframework.ai:spring-ai-spring-boot-testcontainers")
    testImplementation("org.springframework.batch:spring-batch-test")
    testImplementation("org.springframework.cloud:spring-cloud-starter-contract-verifier")
    testImplementation("org.springframework.graphql:spring-graphql-test")
    testImplementation("org.springframework.integration:spring-integration-test")
    testImplementation("org.springframework.modulith:spring-modulith-starter-test")
    testImplementation("org.springframework.restdocs:spring-restdocs-webtestclient")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.springframework.shell:spring-shell-starter-test")
    testImplementation("org.testcontainers:elasticsearch")
    testImplementation("org.testcontainers:gcloud")
    testImplementation("org.testcontainers:junit-jupiter")
    testImplementation("org.testcontainers:postgresql")
    testImplementation("org.testcontainers:solace")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

dependencyManagement {
    imports {
        mavenBom("com.google.cloud:spring-cloud-gcp-dependencies:${property("springCloudGcpVersion")}")
        mavenBom("de.codecentric:spring-boot-admin-dependencies:${property("springBootAdminVersion")}")
        mavenBom("org.springframework.modulith:spring-modulith-bom:${property("springModulithVersion")}")
        mavenBom("com.solace.spring.boot:solace-spring-boot-bom:${property("solaceSpringBootVersion")}")
        mavenBom("org.springframework.ai:spring-ai-bom:${property("springAiVersion")}")
        mavenBom("org.springframework.shell:spring-shell-dependencies:${property("springShellVersion")}")
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.generateJava {
    schemaPaths.add("${projectDir}/src/main/resources/graphql-client")
    packageName = "com.example.transcriberbackend.codegen"
    generateClient = true
}

contracts {
    testMode = TestMode.WEBTESTCLIENT
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.contractTest {
    useJUnitPlatform()
}

tasks.test {
    outputs.dir(project.extra["snippetsDir"]!!)
}

tasks.asciidoctor {
    inputs.dir(project.extra["snippetsDir"]!!)
    dependsOn(tasks.test)
}
