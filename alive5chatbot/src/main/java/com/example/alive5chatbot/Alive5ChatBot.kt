package com.example.alive5chatbot

import android.widget.Toast
import android.content.Context
import android.content.Intent



class Alive5ChatBot {

    fun Alive5ChatBot.show(c: Context, id: String) {

     val intent = Intent(c,ChatBotView::class.java)
        intent.putExtra("id",id)

    c.startActivity(intent)


    }

}