<div align="center">
<h1>NBT</h1>

[![MIT License](https://img.shields.io/github/license/CoderFrish/NBT?style=flat-square)](LICENSE)
![Version](https://img.shields.io/badge/version-6.0.0_Preview-yellow?style=flat-square)
![Releases Downloads](https://img.shields.io/github/downloads/CoderFrish/NBT/total?style=flat-square)
![Repo Stars](https://shields.io/github/stars/CoderFrish/NBT?style=flat-square)
![Repo Forks](https://shields.io/github/forks/CoderFrish/NBT?style=flat-square)

[//]: # (![Version]&#40;https://img.shields.io/badge/version-6.0.0_Lastest-light_green?style=flat-square&#41;)

NBT (Full name: `N`amed`B`inary`T`ags)\
It is a format that Minecraft or some game saves data.

<a href="https://github.com/CoderFrish/NBT/wiki">Wiki</a>
&nbsp;|&nbsp;
<a href="https://github.com/CoderFrish/NBT/issues">Issues</a>
&nbsp;|&nbsp;
<a href="https://github.com/CoderFrish/NBT/blob/master/CHANGES.md">Updates</a>
&nbsp;|&nbsp;
[中文](README.md)
</div>

## (2) Usage
Maven
```xml
<repositories>
    <repository>
        <id>menthamc</id>
        <url>https://repo.menthamc.com/repository/maven-public/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>me.coderfrish.nbt</groupId>
        <artifactId>nbt</artifactId>
        <version>latest_version</version>
    </dependency>
</dependencies>
```

Gradle
```groovy
repositories {
    maven {
        url 'https://repo.menthamc.com/repository/maven-public/'
        name 'menthamc'
    }
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation group: 'me.coderfrish.nbt', name: 'nbt', version: 'latest_version'
}
```

Gradle (Kotlin)
```groovy
repositories {
    maven("https://repo.menthamc.com/repository/maven-public/")
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("me.coderfrish.nbt:nbt:latest_version")
}
```

## (3) Other
If you want to contribute your code, you can Fork this code repository and commit your code in your code repository.  \
If you found Bug, please you post Issue and we will try to help you.

## Star History
[![Star History Chart](https://api.star-history.com/svg?repos=CoderFrish/NBT&type=Date)](https://star-history.com/#CoderFrish/NBT&Date)
