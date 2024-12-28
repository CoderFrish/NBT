# NBT

[![MIT License](https://img.shields.io/github/license/XieFrish2021/NBT?style=flat-square)](LICENSE)
![Version](https://img.shields.io/badge/version-preview-version?style=flat-square)
![GitHub all releases](https://img.shields.io/github/downloads/XieFrish2021/NBT/total?style=flat-square)

> 注意：该版本为Preview版本，如有bug请反馈Issues

NBT(全称：二进制命名标签(`N`amed`B`inary `T`ags))\
是Minecraft游戏存档及一些游戏数据的存储格式。\
版本更新：[CHANGES.md](CHANGES.md)

## (1) 用法
Maven
```xml
<repositories>
    <repository>
        <id>mentha-mc</id>
        <url>https://repo.menthamc.com/repository/maven-public/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>io.github.xiefrish2021</groupId>
        <artifactId>nbt</artifactId>
        <version>${LATEST_VERSION}</version>
    </dependency>
</dependencies>
```

Gradle
```groovy
repositories {
    maven {
        url 'https://repo.menthamc.com/repository/maven-public/'
        name 'mentha-mc'
    }
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation group: 'io.github.xiefrish2021', name: 'nbt', version: '${LATEST_VERSION}'
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
    implementation("io.github.xiefrish2021:nbt:${LATEST_VERSION}")
}
```

## (2) 其他
接下来的基本就是Bug修复，性能优化，Chunk区块的格式什么的。这个NBT库也没什么可以更新的。\
如果要贡献代码的话可以把仓库Fork下来，写上你的代码，并把写了你的代码的Fork 仓库地址通过邮件发送给我。
邮件：`1573880184@qq.com`
如果有BUG，请发布Issues.

## (3) 最后
该NBT库的其他用法就靠你自己发掘把 :)\
那些比如IntArray，ByteArray，List可以自己看test模块或者源码。
