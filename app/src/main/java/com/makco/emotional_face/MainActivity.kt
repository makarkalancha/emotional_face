package com.makco.emotional_face

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.makco.emotional_face.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.happyButton.setOnClickListener({
            binding.emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
        })

        binding.sadButton.setOnClickListener({
            binding.emotionalFaceView.happinessState = EmotionalFaceView.SAD
        })
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Emotional_faceTheme {
//        Greeting("Android")
//    }
//}