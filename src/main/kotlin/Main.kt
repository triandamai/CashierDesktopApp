// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.components.*

@Composable
@Preview
fun App() {

    DesktopMaterialTheme(
        typography = Barrow
    ) {
        Column(
            modifier = Modifier.padding(all=16.dp).scrollable(
                state = rememberScrollableState { 0f },
                orientation = Orientation.Vertical
            ).background(ColorBackground2),
        ) {


            CardItemContent(active = false)
            Spacer(modifier = Modifier.height(10.dp))
            CardItemContent(active = true)
            Spacer(modifier = Modifier.height(10.dp))
            CardItemsCart()
            Spacer(modifier = Modifier.height(10.dp))
            CardDish()
            Spacer(modifier = Modifier.height(10.dp))
            CardSummary()
            Spacer(modifier = Modifier.height(10.dp))
            ButtonPrimary(text="Confirm Payment"){}
            ButtonSecondary(text = "Cancel"){}
            ButtonPrimaryIcon(Icons.Default.Add){}
            ButtonSecondaryIcon(Icons.Default.Add){}
            ButtonPrimaryTextIcon("Confirm Payment",Icons.Default.Add){}
            ButtonSecondaryTextIcon("Confirm Payment",Icons.Default.Add){}
        }


    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
