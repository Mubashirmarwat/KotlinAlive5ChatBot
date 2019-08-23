package com.example.alive5chatbot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_chat_bot_view.*

class ChatBotView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_bot_view)

        var id:String = intent.getStringExtra("id")
        var url = "http://s3.amazonaws.com/alive5cdn/stage_chat_window.html?wid="+id
webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}
