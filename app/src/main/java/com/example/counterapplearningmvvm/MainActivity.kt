package com.example.counterapplearningmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counterapplearningmvvm.ui.theme.CounterAppLearningMVVMTheme
import com.example.counterapplearningmvvm.ui.theme.CounterModelView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val viewModel: CounterModelView = viewModel()
            CounterAppLearningMVVMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CouterApp(viewModel)

                }
            }
        }
    }
}


@Composable
fun CouterApp(viewModel:CounterModelView)
{
   // var count by remember { mutableStateOf(0)}



  /*  fun increment()
    {
        count=count+1
    }
    fun decrement()
    {
        count=count-1
    }*/
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Text(text = "Count : ${viewModel.count.value}",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        
        Spacer(modifier = Modifier.padding(16.dp))
        
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp), horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = { viewModel.increment()}) {
                
                Text(text = "Increment")
                
            }
            
            Button(onClick = { viewModel.decrement()}) {
                
                Text(text = "Decrement")
            }
        }



        // so if we run this program then we will seee that while changing the orientation the data get lost so that it
        // not occured we use MVVM to get the data store in a place

        




    }

}

