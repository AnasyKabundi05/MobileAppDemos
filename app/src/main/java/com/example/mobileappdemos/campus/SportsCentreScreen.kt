package com.example.mobileappdemos.campus

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileappdemos.R
import com.example.mobileappdemos.ui.theme.MobileAppDemosTheme

@Composable
fun SportsCentreScreen() {
    CampusContent(
        titleRes = R.string.sports_title,
        descriptionRes = R.string.sports_description,
        imageRes = R.drawable.campus_building,
        imageDescriptionRes = R.string.sports_image_description,
        factsRes = R.string.sports_facts
    )
}

@Preview(showBackground = true)
@Composable
private fun SportsCentreScreenPreview() {
    MobileAppDemosTheme { SportsCentreScreen() }
}
