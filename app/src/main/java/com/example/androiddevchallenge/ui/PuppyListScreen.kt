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
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.quantityStringResource
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun PuppyList(
    puppies: List<Puppy>,
    navigateToDetails: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(puppies) { puppy ->
                PuppyListItem(puppy, navigateToDetails)
            }
        }
    }
}

@Composable
fun PuppyListItem(
    puppy: Puppy,
    navigateToDetails: (String) -> Unit
) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 8.dp
    ) {
        Column(Modifier.fillMaxWidth()) {
            GlideImage(
                data = puppy.pic,
                contentDescription = puppy.name,
                fadeIn = true,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
            )
        }
        Spacer(Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp, 190.dp, 8.dp, 8.dp)
        ) {
            Column {

                Text(
                    puppy.name,
                    style = typography.h6
                )
                Text(
                    text = "${
                    quantityStringResource(
                        R.plurals.months,
                        puppy.age,
                        puppy.age
                    )
                    }, ${puppy.location}",
                    style = typography.body2
                )
            }
            Column {
                OutlinedButton(
                    onClick = { navigateToDetails(puppy.id) },
                    modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                ) {
                    Text(stringResource(id = R.string.adopt_me))
                }
            }
        }
    }
}
