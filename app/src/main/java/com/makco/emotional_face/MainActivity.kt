package com.makco.emotional_face

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

//import com.makco.emotional_face.ui.theme.Emotional_faceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "Hello Custom View"
        setContentView(textView)


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