package com.example.Secciones
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun DependenciesScreenAñadir(modifier: Modifier = Modifier){
    DependenciesContentAñadir(modifier)
}

@Composable
fun DependenciesContentAñadir(modifier: Modifier)
{
    //Esta mal puesto esto aqui solo lo he puesto para ver que escribe
    var Nombre by remember { mutableStateOf("") }
    var NombreCorto by remember { mutableStateOf("") }
    var Descripcion by remember { mutableStateOf("") }
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "AÑADIR SECCION",
                fontSize = 30.sp,
                modifier = Modifier.padding(bottom = 23.dp)
            )
            TextField(
                value = Nombre,
                onValueChange = { newNom -> Nombre = newNom },
                label = { Text("Nombre") },
                singleLine = true,
                //Sacado de Internet he preguntado para saber tonalidades profesionales
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFF1F1F1),
                    focusedTextColor = Color.Black,
                    focusedLabelColor = Color(0xFF6200EE)
                )
            )



            Spacer(modifier.size(10.dp))

            TextField(
                value = NombreCorto,
                onValueChange = { newNomCor -> NombreCorto = newNomCor },
                label = { Text("Nombre Corto") },
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFF1F1F1),
                    focusedTextColor = Color.Black,
                    focusedLabelColor = Color(0xFF6200EE)
                )
            )
            Spacer(modifier.size(10.dp))
            Box(
                modifier = modifier.size(300.dp)
            )
            {
                OutlinedTextField(
                    value = Descripcion,
                    onValueChange = { newDesc -> Descripcion = newDesc  },
                    label = { Text("Descripción") },
                    modifier = Modifier.fillMaxSize(),
                    maxLines = 3,
                )
            }
            Spacer(modifier.size(8.dp))
            TextButton(
                onClick = {},
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color.Green,
                    contentColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(8.dp)

            ) {
                Text(
                    text = "Añadir",
                )
            }

        }


    }
}

