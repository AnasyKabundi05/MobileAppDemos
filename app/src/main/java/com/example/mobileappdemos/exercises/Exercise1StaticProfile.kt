package com.example.mobileappdemos.exercises

import android.R.attr.name
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Exercise1StaticProfile(
    name: String = "Lucy",
    score: Int = 0)
{
    Column( modifier = Modifier.fillMaxSize().padding(24.dp), verticalArrangement = Arrangement.spacedBy(12.dp))

    {
        Text("Exercise 1")
        Text("Name: $name")
        Text("Score: $score")
    }

}


