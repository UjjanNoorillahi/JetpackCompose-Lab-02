package com.example.mad_lab_2

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_lab_2.ui.theme.MAD_LAB_2Theme

class TaskTwo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MAD_LAB_2Theme {
                // A surface container using the 'background' color from the theme

                    ArtistCardRow()


            }
        }
    }
}

//@Composable
//fun LayoutBox() {
//
//    Row {
//       Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "icon")
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//
//
//        }
//    }
//
//}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtistCardRow(modifier: Modifier = Modifier) {


    Card (

        modifier = modifier
            .padding(16.dp)
//            .size(30.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(2.dp, Color.Black)

    ){

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {

            SizedImageOne(
                painter = painterResource(id = R.drawable.noshads_image),
                contentDescription = "Artist image",
                imageSize = 150 // Set the desired size here
            )

            ArtistCardColumnOne()
        }
    }

}

@Composable
fun SizedImageOne(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    imageSize: Int // Desired size of the image
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = modifier
            .size(imageSize.dp) // Set the desired size here
            .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Crop // Adjust content scale if necessary
    )

}


@Composable
fun ArtistCardColumnOne() {
    Column {
        Text("Noshad Ali",

            fontSize = 20.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text("+92 303 0142282",

            fontSize = 20.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            modifier = Modifier.padding(16.dp))
    }
}