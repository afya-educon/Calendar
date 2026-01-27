import com.kizitonwose.calendar.buildsrc.Config
import com.kizitonwose.calendar.buildsrc.Version

plugins {
    alias(libs.plugins.kotlinJvm)
}

java {
    toolchain {
        languageVersion.set(Config.compatibleJavaLanguageVersion)
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(Config.compatibleJavaLanguageVersion)
    }
}

dependencies {
    compileOnly(libs.compose.runtime) // Only needed for @Immutable annotation.
}


