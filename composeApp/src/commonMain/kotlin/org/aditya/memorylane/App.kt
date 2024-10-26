package org.aditya.memorylane

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.room.RoomDatabase
import kotlinx.coroutines.launch
import kotlinx.serialization.json.JsonNull.content
import org.jetbrains.compose.ui.tooling.preview.Preview

import org.aditya.memorylane.memoryFeature.data.repository.MemoryDatabase
import org.aditya.memorylane.memoryFeature.di.getRoomDatabase
import org.aditya.memorylane.memoryFeature.domain.Memory
import org.aditya.memorylane.utils.MediaType
import kotlin.random.Random

@Composable
@Preview
fun App(
   // databaseBuilder: RoomDatabase.Builder<MemoryDatabase>,
) {
//    MaterialTheme {
//        var showContent by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Button(onClick = { showContent = !showContent }) {
//                Text("Click me!")
//            }
//            AnimatedVisibility(showContent) {
//                val greeting = remember { Greeting().greet() }
//                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//                    Image(painterResource(Res.drawable.compose_multiplatform), null)
//                    Text("Compose: $greeting")
//                }
//            }
//        }
//    }

//    val scope = rememberCoroutineScope()
//
//    val database = remember { getRoomDatabase(databaseBuilder) }
//    val dao = remember { database.memoryDao() }
//    val items = dao.getAllAsFlow().collectAsState(initial = emptyList())
//    var tappedItem by remember { mutableStateOf<Memory?>(null) }
//
//    MaterialTheme(
//        typography = MaterialTheme.typography.copy(
//            body1 = MaterialTheme.typography.body1.copy(
//                color = Color.White
//            )
//        )
//    ) {
//        var showContent by remember { mutableStateOf(false) }
//        Column(
//            Modifier
//                .fillMaxSize()
//                .background(Color.Black),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Row(modifier = Modifier.padding(16.dp)) {
//                Button(onClick = {
//                   // val item = Memory(title = "item ${Random.nextInt()}", mediaPath = null, mediaType = MediaType.AUDIO, timestamp = 12)
//                    scope.launch {
//                     //   dao.insertMemory(item)
//                    }
//                }) {
//                    Text("Add item")
//                }
//                Spacer(Modifier.width(16.dp))
//
//                Button(onClick = {
//                    scope.launch {
//                        tappedItem = null
//                        //dao.deleteAll()
//                    }
//                }) {
//                    Text("Delete all")
//                }
//            }
//
//            tappedItem?.run {
//                Text("Tapped $title = $content")
//            }
//            Spacer(Modifier.height(32.dp))
//
//            Text("Current Items (tap to show content):")
//            LazyColumn {
//                items(items.value.size) { item ->
//                    Text(
//                        items.value[item].title,
//                        modifier = Modifier.clickable {
//                            scope.launch {
//                                tappedItem = dao.getById(items.value[item].id)
//                            }
//                        }
//                    )
//                }
//            }
//        }
//    }
}