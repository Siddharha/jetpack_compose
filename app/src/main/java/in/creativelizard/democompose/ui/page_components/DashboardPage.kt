package `in`.creativelizard.democompose.ui.page_components

import `in`.creativelizard.democompose.models.Item
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.annotations.Nullable

@Composable
fun DashboardList(messages: Array<Item>, onItemClick:(itm:Item) -> Unit = { }){
    Scaffold (){
        ItemList(messages,onItemClick)
    }
}

@Composable
fun ItemList(messages: Array<Item>,onItemClick:(itm:Item)->Unit) {
    Column (modifier = Modifier.fillMaxSize()){
        messages.forEach { message ->

            ItemCell(message,onItemClick)
        }
    }
}

@Composable
fun ItemCell(itm: Item, onItemClick: (itm:Item) -> Unit) {
    Box(modifier = Modifier
        .padding(2.dp)
    ) {
            Card(modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp)
                .clickable(enabled = true, onClick = {
                    onItemClick(itm)
                })
                ) {
                Column (modifier = Modifier.fillMaxWidth()){
                    Text(text = itm.name,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier.absolutePadding( left = 5.dp,right = 5.dp))
                    Text(text = itm.message,
                        modifier = Modifier.absolutePadding( left = 5.dp,right = 5.dp))

                }
            }


    }



}
