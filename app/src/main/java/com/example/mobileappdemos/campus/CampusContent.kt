package com.example.mobileappdemos.campus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mobileappdemos.R

@Composable
fun CampusContent(titleRes: Int, descriptionRes: Int, imageRes: Int,
                  imageDescriptionRes: Int, factsRes: Int) {
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState()).padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(stringResource(titleRes), style = MaterialTheme.typography.headlineMedium)
        Image(
            painter = painterResource(imageRes),
            contentDescription = stringResource(imageDescriptionRes),
            modifier = Modifier.fillMaxWidth().height(180.dp),
            contentScale = ContentScale.Fit
        )
        Text(stringResource(descriptionRes))
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                contentColor = MaterialTheme.colorScheme.onSurfaceVariant
            )
        ) {
            Column(modifier = Modifier.padding(16.dp),
                   verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(stringResource(R.string.facilities_heading),
                     style = MaterialTheme.typography.titleMedium)
                Text(stringResource(factsRes))
            }
        }
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp),
                   verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(stringResource(R.string.example_hours_heading),
                     style = MaterialTheme.typography.titleMedium)
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(stringResource(R.string.opens_label))
                        Text(stringResource(R.string.opens_time))
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(stringResource(R.string.closes_label))
                        Text(stringResource(R.string.closes_time))
                    }
                }
            }
        }
    }
}
