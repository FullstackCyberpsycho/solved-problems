plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    //testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.11.3'
    // https://mvnrepository.com/artifact/org.mockito/mockito-core
    //testImplementation group: 'org.mockito', name: 'mockito-core', version: '5.14.2'

    //testImplementation("org.junit.jupiter: junit-jupiter-api: 5.11.3")
    //testImplementation("org.mockito: mockito-core: 5.14.2")

    // https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.3")

    // https://mvnrepository.com/artifact/org.mockito/mockito-core
    testImplementation("org.mockito:mockito-core:5.14.2")


}

tasks.test {
    useJUnitPlatform()
}