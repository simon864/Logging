package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var Button_Log: Button
    private lateinit var Button_Timber: Button
    private lateinit var Edit_Text: EditText
    private val TAG = "From EditText"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button_Log = findViewById(R.id.button_Log)
        Button_Timber = findViewById(R.id.button_Timber)
        Edit_Text = findViewById(R.id.editTextText2)

        Button_Log.setOnClickListener() {
            Log.v(TAG, Edit_Text.text.toString())
        }

        Timber.plant(Timber.DebugTree())

        Button_Timber.setOnClickListener() {
            Timber.v(Edit_Text.text.toString())
        }
    }

}