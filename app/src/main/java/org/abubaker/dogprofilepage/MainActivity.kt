package org.abubaker.dogprofilepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.abubaker.dogprofilepage.ui.theme.DogProfilePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // onCreate()
        super.onCreate(savedInstanceState)

        // Initialize...
        setContent {

            // Theme
            DogProfilePageTheme {

                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    // Declare the text for the Greeting()
                    Greeting("Android")

                }

            }

        }

    }
}

/**
 * UI Components created using JetPack Compose
 */
@Composable
fun Greeting(name: String) {

    //
    Text(text = "Hello $name!")

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DogProfilePageTheme {
        Greeting("Android")
    }
}