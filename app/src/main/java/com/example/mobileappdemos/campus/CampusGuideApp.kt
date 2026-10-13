package com.example.mobileappdemos.campus

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.mobileappdemos.R

private enum class CampusScreen(val titleRes: Int) {
    Library(R.string.library_title),
    ComputingLabs(R.string.computing_title),
    Cafeteria(R.string.cafeteria_title),
    SportsCentre(R.string.sports_title),
    StudentSupport(R.string.support_title)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampusGuideApp(onExit: () -> Unit) {
    var selectedScreen by rememberSaveable {
        mutableStateOf<CampusScreen?>(null)
    }
    val currentScreen = selectedScreen
    val onBack: () -> Unit = {
        if (currentScreen == null) onExit() else selectedScreen = null
    }
    BackHandler(onBack = onBack)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(currentScreen?.titleRes ?: R.string.campus_heading))
                },
                navigationIcon = {
                    TextButton(onClick = onBack) {
                        Text(stringResource(R.string.back_label))
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .consumeWindowInsets(innerPadding)
        ) {
            when (currentScreen) {
                null -> CampusMenu(onSelect = { selectedScreen = it })
                CampusScreen.Library -> LibraryScreen()
                CampusScreen.ComputingLabs -> ComputingLabsScreen()
                CampusScreen.Cafeteria -> CafeteriaScreen()
                CampusScreen.SportsCentre -> SportsCentreScreen()
                CampusScreen.StudentSupport -> StudentSupportScreen()
            }
        }
    }
}

@Composable
private fun CampusMenu(onSelect: (CampusScreen) -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState()).padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(stringResource(R.string.campus_heading),
            style = MaterialTheme.typography.headlineMedium)
        Text(stringResource(R.string.campus_intro))
        CampusScreen.entries.forEach { screen ->
            Card(onClick = { onSelect(screen) }, modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(stringResource(screen.titleRes),
                        style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }
}
