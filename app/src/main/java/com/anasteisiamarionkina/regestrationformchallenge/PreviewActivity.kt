package com.anasteisiamarionkina.regestrationformchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anasteisiamarionkina.regestrationformchallenge.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val lastName = intent.getStringExtra("last_name")
        val title = intent.getStringExtra("title")

        val previewMessage = """
            Hi, I'm $name $lastName.
            
            I very interested in your vacancy as $title.
            
            If you want contact with me below my contacts. 
            
            Thanks and wish you best regards.
        """.trimIndent()

        binding.textViewPreview.text = previewMessage
        val email = intent.getStringExtra("email")
        binding.previewTextViewEmail.text = email
        val phone = intent.getStringExtra("phone")
        binding.previewTextViewPhone.text = phone

    }
}