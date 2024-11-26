package com.example.dependencias

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun DependenciesScreenPrincipal(modifier: Modifier=Modifier){
    DependenciesContentPrincipal(modifier)
}


@Composable
private fun DependenciesContentPrincipal(modifier: Modifier=Modifier)
{
    Column {
        HorizontalDivider()
        Row {
            Spacer( modifier=modifier.size(20.dp))
            TopBarWithMenuIcon( )
        }
        HorizontalDivider()
        Box(
            modifier = Modifier.fillMaxSize()
        )
        {
            FloatingActionButton(
                onClick = { },
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),
                containerColor = Color.Black,
                contentColor = Color.White,
            ) {
                Icon(Icons.Filled.Add,"Añadir Dependencia")
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarWithMenuIcon(modifier: Modifier=Modifier) {
    TopAppBar(
        title = {   Text(
            text = "Inventory",
            fontSize = 20.sp,
            ) },
        navigationIcon = {

                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menú"
                )
        },
        actions =
        {
            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.filter),
                    contentDescription = "Editar"
                )
            }
            IconButton(
                onClick = { }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.sort),
                    contentDescription = "Ordenar"
                )
            }
            IconButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Filtrar"
                )
            }
        }
    )
}