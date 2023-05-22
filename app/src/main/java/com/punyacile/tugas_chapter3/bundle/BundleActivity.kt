package com.punyacile.tugas_chapter3.bundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.tugas_chapter3.R
import com.punyacile.tugas_chapter3.databinding.ActivityBundleBinding

class BundleActivity : AppCompatActivity() {

    lateinit var binding : ActivityBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityBundleBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnSave.setOnClickListener{
            val namaUser = binding.insertName.text.toString()
            val umurUser = binding.tahunLahir.text.toString().toInt()
            val bundle = Bundle()
            val move = Intent(this,BundleActivity2::class.java)
            bundle.putString("Halo", namaUser)
            bundle.putInt("Umur Kamu", umurUser)
            move.putExtras(bundle)
            startActivity(move) // ctr + d = duplicate
        }

    }
}