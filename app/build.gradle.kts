plugins {
    kotlin("multiplatform")
    id("com.android.application")
}

kotlin {
    jvm()
    androidTarget()

    iosX64()
    iosArm64()
    iosSimulatorArm64()
}

android {
    compileSdk = 34
    namespace = "io.sellmair.kmp.getting.started"

    defaultConfig {
        minSdk = 29
        applicationId = "io.sellmair.kmp.getting.started"
    }
}