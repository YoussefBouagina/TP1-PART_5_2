package com.example.gestionnairedetches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gestionnairedetches.ui.theme.GestionnaireDeTâchesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GestionnaireDeTâchesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
                    TaskCompletionScreen(modifier = Modifier.padding(paddingValues))
                }
            }
        }
    }
}

@Composable
fun TaskCompletionScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            DisplayTaskImage()
            DisplayCompletionMessage()
            DisplayEncouragementMessage()
        }
    }
}

@Composable
fun DisplayTaskImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_task_completed),
        contentDescription = "Task completed",
        modifier = Modifier
            .size(100.dp)
            .padding(bottom = 16.dp)
    )
}

@Composable
fun DisplayCompletionMessage() {
    Text(
        text = "All tasks completed",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
    )
}

@Composable
fun DisplayEncouragementMessage() {
    Text(
        text = "Nice work!",
        fontSize = 16.sp
    )
}

@Preview(showBackground = true)
@Composable
fun TaskCompletionScreenPreview() {
    GestionnaireDeTâchesTheme {
        TaskCompletionScreen()
    }
}
