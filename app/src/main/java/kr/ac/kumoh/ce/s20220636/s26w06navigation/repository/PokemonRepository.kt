package kr.ac.kumoh.ce.s20220636.s26w06navigation.repository

import kr.ac.kumoh.ce.s20220636.s26w06navigation.model.Pokemon

interface PokemonRepository {
    suspend fun getAllPokemon(): List<Pokemon>
    suspend fun getPokemonById(id: Int): Pokemon? // ?는 NULL일수도 있따.
    // suspend 펑션 - 작업을 비동기로 실행
}