plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.dagger.hilt)
    id("kotlin-kapt")
}

android {
    namespace = "vn.edu.stu.tranthanhsang.finly"
    compileSdk = 36

    defaultConfig {
        applicationId = "vn.edu.stu.tranthanhsang.finly"
        minSdk = 28
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.datastore.preferences)

    //Dùng để bảo vệ ứng dụng bằng sinh trắc học
    implementation(libs.androidx.biometric)

    //Gửi thông báo nhắc nhở chi tiêu hàng ngày/tuần
    implementation(libs.androidx.work.runtime.ktx)

    //Vẽ biểu đồ tròn, cột để hiển thị thống kê chi tiêu
    implementation(libs.mpandroidchart)

    //Quản lý status bar, quyền runtime, hiệu ứng chuyển cảnh
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.google.accompanist.permissions)

    //Load image
    implementation(libs.coil.compose)

    //Logging
    implementation(libs.timber)

    //Hilt
    implementation(libs.hilt.android)
    kapt(libs.dagger.hilt.compiler)

    //Room
    implementation(libs.androidx.room.runtime)
    kapt(libs.room.compiler)
    implementation(libs.androidx.room.ktx)

}