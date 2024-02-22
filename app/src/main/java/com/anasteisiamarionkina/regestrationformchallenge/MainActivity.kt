package com.anasteisiamarionkina.regestrationformchallenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.anasteisiamarionkina.regestrationformchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spinnerList = arrayOf("Android developer", "Android engineer", "Junior android programmer")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, spinnerList)
        binding.spinner.adapter = spinnerAdapter

        binding.buttonSend.setOnClickListener {
            val intent = Intent(this, PreviewActivity::class.java)
            intent.putExtra("name", binding.editTextName.text.toString())
            intent.putExtra("last_name", binding.editTextLastName.text.toString())
            intent.putExtra("title", binding.spinner.selectedItem?.toString())
            intent.putExtra("email", binding.editTextEmail.text.toString())
            intent.putExtra("phone", binding.editTextPhone.text.toString())
            startActivity(intent)
        }
    }
}