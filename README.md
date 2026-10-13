# Lab 3 Campus Guide source additions

Open Lab-3-red-code.html in a browser to view added/changed code in red.

This is source code for your EXISTING Android project, not a standalone Gradle project.
1. Back up the existing project.
2. Replace the old demo composables/enum with app/src/main/java/com/example/mobileappdemos/MobileAppDemos.kt. Keep the activity class and existing previews. Avoid duplicate functions.
3. Add the campus directory at the supplied package path.
4. Add lab3_strings.xml to res/values. Keep existing strings.xml. Alternatively merge its entries inside the existing resources element, without duplicating names.
5. Add campus_building.xml to res/drawable.
6. Keep the supplied Theme.kt and Typography.kt unchanged.
7. Keep MainActivity calling MobileAppDemos() inside MobileAppDemosTheme. No new Scaffold around that call.
8. Sync/build and test on your emulator.

The supplied building icon is a placeholder. Add five resized JPG/PNG/WebP photographs to res/drawable-nodpi and change each screen imageRes to its resource. For photographs, change ContentScale.Fit to ContentScale.Crop if suitable and update the image descriptions.

This includes clickable menu cards and string resources as lecturer solutions/extensions to Campus Guide. Shared CampusContent is a reusable-component extension; each destination still has its own Kotlin file and Preview.

All facility details and opening times are sample values. They are not verified campus facts.

Review performed: resource references, XML parsing, integration routes and preservation of previous exercise bodies. Not compiled in Android Studio: no Gradle project or Android SDK was supplied.
