import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    kotlin("plugin.compose")
    id("org.jetbrains.compose")
    id("com.android.application")
}

kotlin {
    jvmToolchain(17)

    jvm()
    androidTarget()

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets.commonMain.dependencies {
        implementation(compose.foundation)
        implementation(compose.material3)
        implementation(compose.runtime)
    }

    sourceSets.androidMain.dependencies {
        implementation("androidx.activity:activity-compose:1.9.0")
        implementation("androidx.appcompat:appcompat:1.7.0")
    }

    sourceSets.jvmMain.dependencies {
        implementation(compose.desktop.currentOs)
    }
}

/* Android Configuration */
android {
    compileSdk = 34
    namespace = "io.sellmair.kmp.getting.started"

    defaultConfig {
        minSdk = 29
        applicationId = "io.sellmair.kmp.getting.started"
    }
}

/* iOS Configuration */
kotlin.targets.withType<KotlinNativeTarget>().configureEach {
    binaries.framework {
        baseName = "KmpApp"
        isStatic = true
    }
}
