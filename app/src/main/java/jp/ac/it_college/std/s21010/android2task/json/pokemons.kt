package jp.ac.it_college.std.s21010.android2task.json

data class pokemons(
    val pokemon: List<Pokemon>
)

data class Pokemon(
    val id: Int,
    val name: String
)
