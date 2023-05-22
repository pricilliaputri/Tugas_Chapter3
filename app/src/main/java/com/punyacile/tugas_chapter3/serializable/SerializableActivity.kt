package com.punyacile.tugas_chapter3.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.tugas_chapter3.R
import com.punyacile.tugas_chapter3.databinding.ActivitySerializable2Binding
import com.punyacile.tugas_chapter3.databinding.ActivitySerializableBinding

class SerializableActivity : AppCompatActivity() {

    lateinit var binding: ActivitySerializableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySerializableBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSerializable.setOnClickListener{
            val name1 = binding.inputName.text.toString()
            val email1 = binding.inputEmail.text.toString()
            val phone1 = binding.inputPhone.text.toString()
            val addres1 = binding.inputAddress.text.toString()
            val age1 = binding.inputAge.text.toString()

            val myData = MyDataClass(name1,email1, phone1, addres1, age1)
            val pindah = Intent(this, SerializableActivity2::class.java)
            pindah.putExtra("DATAUSER", myData)
            startActivity(pindah)
        }

    }
}