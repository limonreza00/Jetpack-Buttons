package com.coderscastle.button

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coderscastle.button.ui.theme.ButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MyButton()
        }
    }
}


@Composable
fun MyButton (){
    Column (
        modifier = Modifier.fillMaxSize().padding(top = 16.dp),
        verticalArrangement = spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally){

        //Button 1
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp)
        )

        {

            Text(text = "Rounded Corner Button")
        }


        //Button 2
        Button( onClick = { /*TODO*/ },
            shape = CutCornerShape(10.dp)
        ) {

            Text(text = "Cut Corner Button")
        }


        //Button 3
        Button( onClick = { /*TODO*/ },
            modifier = Modifier.size(100.dp),
            shape = CircleShape) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }

        //Button 4
        Button( onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow, contentColor = Color.Black),
            border = ButtonDefaults.outlinedButtonBorder
        ) {

            Text(text = "Random Button ")
            Icon(imageVector = Icons.Default.Face, contentDescription = null)
        }

        //Button 5

        ElevatedButton(onClick = {},
            ) {
            Text(text = "Elevated Button")
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
        }

        //Button 6
        FilledTonalButton(onClick = {}) { Text(text = "Filled Tonal Button") }

        //Button 7
        OutlinedButton(onClick = {}) { Text(text = "Outlined Button") }

        //Button 8
        TextButton(onClick = {}) { Text(text = "Text Button") }
    }
}


@Preview(showBackground = true , showSystemUi = true)
@Composable
fun MyButtonPreview() {
    ButtonTheme {
        MyButton()
    } }