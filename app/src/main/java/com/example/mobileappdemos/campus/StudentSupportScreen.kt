package com.example.mobileappdemos.campus

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileappdemos.R
import com.example.mobileappdemos.ui.theme.MobileAppDemosTheme

@Composable
fun StudentSupportScreen() {
    CampusContent(
        titleRes = R.string.support_title,
        descriptionRes = R.string.support_description,
        imageRes = R.drawable.campus_building,
        imageDescriptionRes = R.string.support_image_description,
        factsRes = R.string.support_facts
    )
}

@Preview(showBackground = true)
@Composable
private fun StudentSupportScreenPreview() {
    MobileAppDemosTheme { StudentSupportScreen() }
}
