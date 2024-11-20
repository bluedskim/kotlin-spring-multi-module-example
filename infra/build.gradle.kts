dependencies {
	implementation(project(":common:enum"))
	implementation(project(":common:util"))
    compileOnly(project(":domain"))
    implementation("org.springframework:spring-context")
}
