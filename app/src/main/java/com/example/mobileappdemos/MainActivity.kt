package com.example.mobileappdemos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobileappdemos.campus.CampusGuideApp
import com.example.mobileappdemos.demos.MobileAppDemos
import com.example.mobileappdemos.exercises.Exercise1StaticProfile
import com.example.mobileappdemos.exercises.Exercise2Counter
import com.example.mobileappdemos.exercises.Exercise3NameInput
import com.example.mobileappdemos.exercises.Exercise4InteractiveProfile
import com.example.mobileappdemos.exercises.Exercise5ShoppingList
import com.example.mobileappdemos.ui.theme.MobileAppDemosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileAppDemosTheme {
                MaterialTheme {
                    Surface {
//Exercise1StaticProfile()
                       // Exercise2Counter()
                        //Exercise3NameInput()
                        //Exercise4InteractiveProfile()
                        //Exercise5ShoppingList()
                        //MobileAppDemos()
                        CampusGuideApp(
                            onExit = { finish() }
                        )
                    }
                }
                }
            }
        }
    }


