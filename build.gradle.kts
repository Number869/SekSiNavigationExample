buildscript {
	val agp_version by extra("8.1.0-alpha09")
	val agp_version1 by extra("8.2.0-alpha01")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
	id("com.android.application") version "8.2.0-alpha04" apply false
	id("com.android.library") version "8.1.0-alpha08" apply false
	id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}