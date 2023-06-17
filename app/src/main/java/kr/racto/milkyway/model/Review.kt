package kr.racto.milkyway.model

data class Review(
    val title: String,
    val description: String,
    val rating: Int,
    val userEmail: String,
    val roomId: Int
)
