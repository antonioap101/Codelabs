package es.ulpgc.codelabs2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import es.ulpgc.codelabs2.ui.theme.Codelabs2Theme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Codelabs2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFDAF0B3)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            ProfileImage()
            Spacer(modifier = Modifier.height(16.dp))
            ProfileInfo("Antonio Aparicio")
            Spacer(modifier = Modifier.height(16.dp))
            ContactInfo()
        }
    }
}

@Composable
fun ProfileImage() {
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = null,
        modifier = Modifier.size(200.dp)
    )
}

@Composable
fun ProfileInfo(name: String) {
    Text(
        text = name,
        style = TextStyle(fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    )
    Text(
        text = "Junior Android Developer",
        style = TextStyle(fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFFA600FF)
        )
    )
}

@Composable
fun ContactInfo() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = Icons.Default.Phone, contentDescription = null, tint = Color.Black,
             modifier = Modifier.size(30.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "+34 123 456 789",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal))
    }
    Spacer(modifier = Modifier.height(8.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = Icons.Default.Email, contentDescription = null, tint = Color.Black,
             modifier = Modifier.size(30.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "antonio.aparicio@ulpgc.com",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal))
    }
    Spacer(modifier = Modifier.height(8.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = Icons.Default.LocationOn, contentDescription = null, tint = Color.Black,
             modifier = Modifier.size(30.dp))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "ULPGC",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal))
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Codelabs2Theme {
        BusinessCard()
    }
}
