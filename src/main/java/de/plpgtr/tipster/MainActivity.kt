package de.plpgtr.tipster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.slider.Slider
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val percentageSlider = findViewById<Slider>(R.id.percentage_slider)
        val percentage = percentageSlider.values[0]
    }

}
