package ru.sportivityteam.vucmirea.assistant.domain.usecase.auth

import kotlinx.coroutines.flow.Flow
import ru.sportivityteam.vucmirea.assistant.domain.repository.auth.AuthRepository
import ru.sportivityteam.vucmirea.assistant.domain.util.State

interface GetUserLoginUseCase : () -> Flow<State<Boolean>>

class GetUserLoginUseCaseImpl(
    private val authRepository: AuthRepository
) : GetUserLoginUseCase {
    override operator fun invoke() = authRepository.isUserLogin
}