package com.coding404.myfirstapp

data class QuizDTO(
    val id : Int,
    val quiz : String,
    val img : Int,
    val one : String,
    val two : String,
    val three : String,
    val four : String,
    val answer : Int //정답값
)