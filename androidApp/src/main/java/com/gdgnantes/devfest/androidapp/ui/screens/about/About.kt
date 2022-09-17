package com.gdgnantes.devfest.androidapp.ui.screens.about

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdgnantes.devfest.androidapp.ui.components.GithubCard
import com.gdgnantes.devfest.androidapp.ui.screens.about.partners.Partners
import com.gdgnantes.devfest.androidapp.ui.theme.DevFest_NantesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About(
    modifier: Modifier = Modifier,
    onWeblinkClick: (String) -> Unit
) {
    Scaffold {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(it)
                .verticalScroll(state = rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            AboutHeader(modifier.padding(horizontal = 8.dp))

            AboutLinks(
                modifier.padding(horizontal = 8.dp),
                onWeblinkClick = onWeblinkClick
            )

            AboutSocial(
                modifier.padding(horizontal = 8.dp),
                onWeblinkClick = onWeblinkClick
            )

            Partners(
                modifier.padding(horizontal = 8.dp),
                onWeblinkClick = onWeblinkClick
            )

            AboutLocalCommunities(
                modifier.padding(horizontal = 8.dp),
                onWeblinkClick = onWeblinkClick
            )

            GithubCard(
                modifier
                    .padding(horizontal = 8.dp)
                    .align(Alignment.CenterHorizontally),
                onWeblinkClick = onWeblinkClick
            )

            AboutVersion(modifier.padding(8.dp))
        }
    }
}

@Preview
@Composable
fun AboutPreview() {
    DevFest_NantesTheme {
        About(onWeblinkClick = {})
    }
}