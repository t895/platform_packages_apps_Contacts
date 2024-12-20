pluginManagement {
    repositories {
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(":app")
include(":lib:platform_external_libphonenumber")
include(":lib:platform_frameworks_ex:common")
include(":lib:platform_frameworks_opt_vcard")
include(":lib:platform_packages_apps_PhoneCommon")