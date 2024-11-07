plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    buildFeatures {
        viewBinding = true
    }

    namespace = "id.ac.polbeng.mithazalina.sharedpreferencesexample"
    compileSdk = 35

    defaultConfig {
        applicationId = "id.ac.polbeng.mithazalina.sharedpreferencesexample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17 // Update to a more recent version
        targetCompatibility = JavaVersion.VERSION_17 // Update to a more recent version
    }

    kotlinOptions {
        jvmTarget = "17" // Update to a more recent version
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
