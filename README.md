<div align="center">
<h1> NBT </h1>

[![MIT License](https://img.shields.io/github/license/CoderFrish/NBT?style=flat-square)](LICENSE)
![Version](https://img.shields.io/badge/version-6.0.0_Preview-yellow?style=flat-square)
![Releases Downloads](https://img.shields.io/github/downloads/CoderFrish/NBT/total?style=flat-square)
![Repo Stars](https://shields.io/github/stars/CoderFrish/NBT?style=flat-square)
![Repo Forks](https://shields.io/github/forks/CoderFrish/NBT?style=flat-square)

NBT(全称：二进制命名标签(`N`amed`B`inary `T`ags))\
是Minecraft游戏存档及一些游戏数据的存储格式。

<a href="https://github.com/CoderFrish/NBT/wiki">维基</a>
&nbsp;|&nbsp;
<a href="https://github.com/CoderFrish/NBT/issues">问题</a>
&nbsp;|&nbsp;
<a href="https://github.com/CoderFrish/NBT/blob/master/CHANGES.md">历史更新</a>
&nbsp;|&nbsp;
[English](README_EN.md)
</div>

## (2) 用法
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
        <version>最新版本</version>
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
    implementation group: 'me.coderfrish.nbt', name: 'nbt', version: '最新版本'
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
    implementation("me.coderfrish.nbt:nbt:最新版本")
}
```

## (3) 其他
如果要贡献代码的话可以把仓库Fork下来，并把你的代码提交到你的Fork上，并发布Pull Request。\
如果有BUG，请发布Issues，我们会尽量帮助你。

## 获标星历史
[![Star History Chart](https://api.star-history.com/svg?repos=CoderFrish/NBT&type=Date)](https://star-history.com/#CoderFrish/NBT&Date)
