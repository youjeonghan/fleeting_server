import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.1"
	id("io.spring.dependency-management") version "1.1.0"
	id ("org.jetbrains.kotlin.jvm") version "1.8.22"
	id ("org.jetbrains.kotlin.plugin.spring") version "1.8.22"

	// entity 기본생성자 안만들게 해줌
	id("org.jetbrains.kotlin.plugin.jpa") version "1.9.23"

	// formatting 자동으로
	id("org.jmailen.kotlinter") version "4.2.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

tasks.bootJar {
	enabled = true
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation ("org.springframework.boot:spring-boot-starter")
	implementation ("org.jetbrains.kotlin:kotlin-reflect")
	implementation ("org.springframework.boot:spring-boot-starter-web")

	// mysql 연동에 필요
	implementation("com.mysql:mysql-connector-j")

	// Spring Data JPA 추가
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	testImplementation ("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.named<Test>("test") {
	useJUnitPlatform()
}
