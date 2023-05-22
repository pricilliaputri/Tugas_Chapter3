package com.punyacile.tugas_chapter3.bundle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.tugas_chapter3.databinding.ActivityBundle2Binding

class BundleActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityBundle2Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBundle2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val getbundle = intent.extras
        val name = getbundle?.getString("Halo")
        val umur = getbundle?.getInt("Umur Kamu")
        binding.tvNama.text = "halo, $name"
        binding.tvUmur.text = "umur kamu adalah : $umur"

    }
}