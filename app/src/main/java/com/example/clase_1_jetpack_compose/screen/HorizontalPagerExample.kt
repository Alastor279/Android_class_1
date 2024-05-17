package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Pager() {
    val pagerState = rememberPagerState(initialPage = 0) {
        3
    }
    var po by remember {
        mutableIntStateOf(pagerState.pageCount)
    }
    LaunchedEffect(po) {
        pagerState.scrollToPage(po)
    }
    LaunchedEffect(pagerState.pageCount) {
        po = pagerState.currentPage
    }

    Column {
        TabRow(selectedTabIndex = po) {
            for (index in 0 until pagerState.pageCount ){
                Tab(selected = index == po, onClick = { po = index }){
                    Text(text = "tab $index", modifier = Modifier.padding(vertical = 8.dp))
                }
            }
        }
        HorizontalPager(state = pagerState) {
            currentPage -> ScreenOne(pageNumber = currentPage.toString())
        }
    }
}

@Composable
fun ScreenOne(pageNumber:String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize())
    {
        Text(text = pageNumber)
    }

}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun Total() {
    Pager()
}