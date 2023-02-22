plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
    kotlin("plugin.serialization") version Deps.kotlinVersion
}

android {
    namespace = "com.example.kmm_mvikotlin_koin.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.kmm_mvikotlin_koin.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Deps.composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(Deps.composeUi)
    implementation(Deps.composeUiTooling)
    implementation(Deps.composeUiToolingPreview)
    implementation(Deps.composeFoundation)
    implementation(Deps.composeMaterial)
    implementation(Deps.activityCompose)
    implementation(Deps.composeIconsExtended)
    implementation(Deps.composeNavigation)
    implementation(Deps.coilCompose)

    implementation(Deps.ktorAndroid)

    androidTestImplementation(Deps.testRunner)
    androidTestImplementation(Deps.composeTesting)
    debugImplementation(Deps.composeTestManifest)

}