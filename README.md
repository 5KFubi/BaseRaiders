## Installation
Add this to your `pom.xml` accordingly:

# Maven
```xml
<repository>
  <id>jitpack.io</id>
  <url>https://jitpack.io</url>
</repository>

<dependency>
  <groupId>com.github.5KFubi</groupId>
  <artifactId>BaseRaiders</artifactId>
  <version>2.0</version> <!-- Make sure to match with the plugin's version -->
  <scope>provided</scope>
</dependency>
```

# Gradle (Groovy)
```xml
repositories {
  mavenCentral()
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.5KFubi:BaseRaiders:2.0' <!-- Make sure to match with the plugin's version -->
}
```

# Gradle (Kotlin DSL)
```xml
repositories {
  mavenCentral()
  maven("https://jitpack.io")
}

dependencies {
  implementation("com.github.5KFubi:BaseRaiders:2.0") <!-- Make sure to match with the plugin's version -->
}
```

---

# Provider
```java
public BaseRaidersProvider provider = BaseRaidersAPI.get();
```
