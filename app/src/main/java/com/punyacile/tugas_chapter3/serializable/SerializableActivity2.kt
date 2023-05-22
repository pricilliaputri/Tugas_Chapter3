package com.punyacile.tugas_chapter3.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.tugas_chapter3.R
import com.punyacile.tugas_chapter3.databinding.ActivitySerializable2Binding

@Suppress("DEPRECATION")
class SerializableActivity2 : AppCompatActivity() {

    lateinit var binding: ActivitySerializable2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivitySerializable2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val menDapatkanData = intent.getSerializableExtra("DATAUSER") as MyDataClass
        val name2 = menDapatkanData.name
        val email2 = menDapatkanData.email
        val phone2 = menDapatkanData.numberPhone
        val adress2 = menDapatkanData.address
        val age2 = menDapatkanData.age
        binding.textName.text = name2
        binding.textEmail.text = email2
        binding.textPhone.text = phone2
        binding.textAddress.text = adress2
        binding.textAge.text = age2

    }
}