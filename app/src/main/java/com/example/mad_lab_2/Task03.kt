package com.example.mad_lab_2

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

class TaskThree : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MAD_LAB_2Theme {
                // A surface container using the 'background' color from the theme


              Column {
                  FillScreenWithRows()
                  FillScreenWithRows()
                  FillScreenWithRows()
                  FillScreenWithRows()
                  FillScreenWithRows()
                  FillScreenWithRows()
                  FillScreenWithRows()
              }


            }
        }
    }
}





//@Preview(showBackground = true, backgroundColor = 0x3FFFFFFF)

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FillScreenWithRows(modifier: Modifier = Modifier) {


    Card (

        modifier = modifier
            .padding(10.dp)
            .size(width = 380.dp, height = 100.dp)
            .clip((RoundedCornerShape(5.dp))),
//            .border(2.dp, Color.Black)

                elevation = CardDefaults.cardElevation(
                defaultElevation = 16.dp
                ),

    ){

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {

            SizedImage(
                painter = painterResource(id = R.drawable.noshads_image),
                contentDescription = "Artist image",
                imageSize = 100 // Set the desired size here
            )

            ArtistCardColumn()
        }
    }

}

@Composable
fun SizedImage(
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
            .padding(16.dp)
            .clip(RoundedCornerShape(10.dp)),
        contentScale = ContentScale.Crop // Adjust content scale if necessary
    )

}


@Composable
fun ArtistCardColumn() {
    Column {
        Text("Iron Man",

            fontSize = 30.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
//            modifier = Modifier.padding(16.dp)
        )
        Text("Age: 45" ,

            fontSize = 20.sp,
            fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
//            modifier = Modifier.padding(16.dp)
        )
    }
}