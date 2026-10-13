package com.example.mobileappdemos.campus

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileappdemos.R
import com.example.mobileappdemos.ui.theme.MobileAppDemosTheme

@Composable
fun ComputingLabsScreen() {
    CampusContent(
        titleRes = R.string.computing_title,
        descriptionRes = R.string.computing_description,
        imageRes = R.drawable.campus_building,
        imageDescriptionRes = R.string.computing_image_description,
        factsRes = R.string.computing_facts
    )
}

@Preview(showBackground = true)
@Composable
private fun ComputingLabsScreenPreview() {
    MobileAppDemosTheme { ComputingLabsScreen() }
}
