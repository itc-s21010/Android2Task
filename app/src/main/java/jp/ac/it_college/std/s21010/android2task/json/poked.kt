package jp.ac.it_college.std.s21010.android2task.json

import android.os.DropBoxManager

data class PokedexJson(
    val pokedex: List<poked>
)

data class poked(
    val id: Int,
    val name: String,
    val entries: List<DropBoxManager.Entry>
)


data class Entry(
    val entry_number: Int,
    val pokemon_id: Int
)
