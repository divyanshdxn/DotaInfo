package com.dxn.dotainfo.core

sealed class ProgressBarState {
    object Loading: ProgressBarState()
    object Idle: ProgressBarState()
}