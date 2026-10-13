package com.example.mobileappdemos.campus

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileappdemos.R
import com.example.mobileappdemos.ui.theme.MobileAppDemosTheme

@Composable
fun CafeteriaScreen() {
    CampusContent(
        titleRes = R.string.cafeteria_title,
        descriptionRes = R.string.cafeteria_description,
        imageRes = R.drawable.campus_building,
        imageDescriptionRes = R.string.cafeteria_image_description,
        factsRes = R.string.cafeteria_facts
    )
}

@Preview(showBackground = true)
@Composable
private fun CafeteriaScreenPreview() {
    MobileAppDemosTheme { CafeteriaScreen() }
}
