package com.example.questadvancelayout_086

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(modifier = Modifier.padding(top=100.dp)
        .fillmax(),
        horizontalAllignment = Alignment.CenterHorizontally
    ) {
        Text(text = StringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontweight = FontWeight.Bold)
    }
}