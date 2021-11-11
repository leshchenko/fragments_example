package com.trackimo.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.lifecycle.ViewModelProvider
import com.trackimo.myapplication.fragment_one.FragmentListClickListener
import com.trackimo.myapplication.fragment_two.FragmentDetails

class MainActivity : AppCompatActivity(), FragmentListClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    override fun onItemClick() {
        (supportFragmentManager.findFragmentByTag(
                "tag_details"
        ) as? FragmentDetails)?.buttonPressed()
    }

}