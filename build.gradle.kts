plugins {
	id("java-platform")
}

description = "Example of my BOM"

javaPlatform {
	allowDependencies()
}

dependencies {
	constraints {
		api("org.apache.poi:poi:5.3.0")
		api("org.apache.poi:poi-ooxml:5.3.0")
	}
}