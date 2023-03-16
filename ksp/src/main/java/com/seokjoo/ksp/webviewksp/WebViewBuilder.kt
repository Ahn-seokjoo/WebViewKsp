package com.seokjoo.ksp.webviewksp

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.PROPERTY)
annotation class WebViewBuilder(
    val url: String,
    val autoSet: Boolean
)
