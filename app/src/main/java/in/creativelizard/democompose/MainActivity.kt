package `in`.creativelizard.democompose

import `in`.creativelizard.democompose.ui.page_components.LoginPage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import `in`.creativelizard.democompose.ui.theme.DemoComposeTheme
import android.content.Intent
import android.os.Handler
import android.os.Looper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DemoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    LoginPage("Simple Jetpack Compose Demo")
                }
            }
        }

        initialize()
    }

    private fun initialize(){
        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this,DashboardActivity::class.java))
        },1000)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoComposeTheme {
        LoginPage("Demo Compose")
    }
}