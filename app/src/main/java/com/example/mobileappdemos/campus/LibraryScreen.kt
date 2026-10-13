package com.example.mobileappdemos.campus

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileappdemos.R
import com.example.mobileappdemos.ui.theme.MobileAppDemosTheme

@Composable
fun LibraryScreen() {
    CampusContent(
        titleRes = R.string.library_title,
        descriptionRes = R.string.library_description,
        imageRes = R.drawable.campus_library,
        imageDescriptionRes = R.string.library_image_description,
        factsRes = R.string.library_facts
    )
}

@Preview(showBackground = true)
@Composable
private fun LibraryScreenPreview() {
    MobileAppDemosTheme { LibraryScreen() }
}
