/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.annotation.PluralsRes
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.model.PuppyProvider
import com.example.androiddevchallenge.ui.PuppyDetails
import com.example.androiddevchallenge.ui.PuppyList
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    MaterialTheme {
        Surface(color = MaterialTheme.colors.background) {
            val navController = rememberNavController()
            val actions = remember(navController) { Actions(navController) }
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text(
                                text = stringResource(R.string.app_name)
                            )
                        },
                        actions = {
                            IconButton(onClick = { /* doSomething() */ }) {
                                Icon(Icons.Filled.Favorite, contentDescription = null)
                            }
                        }
                    )
                }
            ) {
                NavHost(navController, startDestination = "puppyList") {
                    composable("puppyList") {
                        PuppyList(
                            PuppyProvider.PUPPIES,
                            actions.puppyDetails
                        )
                    }
                    composable("puppyDetails/{puppyId}") { backStackEntry ->
                        val puppyId = backStackEntry.arguments?.getString("puppyId")
                        PuppyDetails(PuppyProvider.getById(puppyId))
                    }
                }
            }
        }
    }
}

class Actions(navController: NavController) {
    val puppyDetails: (String) -> Unit = { puppyId ->
        navController.navigate("puppyDetails/$puppyId")
    }
}

@Composable
fun quantityStringResource(@PluralsRes id: Int, quantity: Int, vararg formatArgs: Any): String {
    return LocalContext.current.resources.getQuantityString(id, quantity, *formatArgs)
}
