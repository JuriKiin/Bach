package com.jurikiin.bach.components.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun H1(text: String) = Text(text = text, fontSize = 24.sp, fontWeight = FontWeight.Bold)

@Composable
fun H2(text: String) = Text(text = text, fontSize = 18.sp, fontWeight = FontWeight.Bold)

@Composable
fun H3(text: String) = Text(text = text, fontSize = 16.sp, fontWeight = FontWeight.Normal)
