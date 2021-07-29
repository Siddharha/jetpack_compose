package `in`.creativelizard.democompose

import `in`.creativelizard.democompose.models.Item
import `in`.creativelizard.democompose.ui.page_components.DashboardList
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class DashboardActivity : ComponentActivity() {
    private val messages = arrayOf(
        Item(0,"data 1","Test Message"),
        Item(1,"data 2","Test Message"),
        Item(2,"data 3","Test Message"),
        Item(3,"data 4","Test Message"),
        Item(4,"data 5","Test Message"),
        Item(5,"data 6","Test Message"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                DashboardList(messages,
                onItemClick = {
                    Toast.makeText(this, "Clicked : ${it.name}", Toast.LENGTH_SHORT).show()
                })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
        DashboardList(
            messages = arrayOf(
                Item(0,"data 1","Test Message"),
                Item(1,"data 2","Test Message"),
            ))
}
