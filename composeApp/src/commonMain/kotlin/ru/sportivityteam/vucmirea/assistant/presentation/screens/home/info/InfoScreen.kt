package ru.sportivityteam.vucmirea.assistant.presentation.screens.home.info

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import cafe.adriel.voyager.koin.getScreenModel
import ru.sportivityteam.vucmirea.assistant.presentation.ui.component.BaseScreen
import ru.sportivityteam.vucmirea.assistant.presentation.ui.component.InfoList
import ru.sportivityteam.vucmirea.assistant.presentation.ui.extensions.dial
import ru.sportivityteam.vucmirea.assistant.presentation.ui.extensions.sendMail
import ru.sportivityteam.vucmirea.assistant.presentation.ui.mvi.observeAsState

class InfoScreen : BaseScreen() {
    @Composable
    override fun ScreenContent() {
        val context = LocalContext.current
        val clipboardManager = LocalClipboardManager.current
        val screenModel = getScreenModel<InfoSM>()
        val state = screenModel.viewStates().observeAsState()
        val action = screenModel.viewActions().observeAsState()
        val uriHandler = LocalUriHandler.current

        action.value?.let { viewAction ->
            when (viewAction) {
                is InfoViewAction.OpenAddress -> clipboardManager.setText(AnnotatedString(viewAction.address))
                is InfoViewAction.OpenEmail -> context.sendMail(viewAction.email)
                is InfoViewAction.OpenPhoneNumber -> context.dial(viewAction.phoneNumber)
                is InfoViewAction.OpenTelegram -> uriHandler.openUri(viewAction.uri)
            }
        }
        InfoList(
            items = state.value.items,
            futureItems = state.value.futureItems
        )

        OnPause {
            screenModel.obtainEvent(InfoViewEvent.Clear)
        }
    }
}
