package com.mtw.josealejandrosanchezortega.keyboardsamples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.mtw.josealejandrosanchezortega.keyboardsamples.R.id.editText_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showText(view: View) {
        if (editText_main != null)
            Toast.makeText(this, editText_main.text.toString(), Toast.LENGTH_SHORT).show()
    }
}
