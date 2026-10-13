package com.example.mobileappdemos.exercises
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Exercise2Counter() {
    var score by rememberSaveable() { mutableIntStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Score: $score", fontSize = 28.sp)
        Button(onClick = { score++ }) {
            Text("Increase score")
        }
        OutlinedButton(
            onClick = { if (score > 0) score-- },
            enabled = score > 0
        ) {
            Text("Decrease score")
        }
        OutlinedButton(onClick = { score = 0 }) {
            Text("Reset score")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Exercise2Preview() {
    Exercise2Counter()
}