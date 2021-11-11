package com.trackimo.myapplication.fragment_two

import android.widget.TextView
import androidx.fragment.app.Fragment
import com.trackimo.myapplication.R

class FragmentDetails : Fragment(R.layout.fragment_details) {
    fun buttonPressed() {
        view?.findViewById<TextView>(R.id.text)?.text = "Button was pressed"
    }
}