package com.punyacile.tugas_chapter3.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.tugas_chapter3.databinding.ActivityParcelableBinding

class ParcelableActivity : AppCompatActivity() {

    lateinit var binding: ActivityParcelableBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityParcelableBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnParcelable.setOnClickListener{
            val nameParce = binding.inputNama.text.toString()
            val emailParce = binding.inputEmail.text.toString()
            val phoneParce = binding.inputPhoneNumber.text.toString().toInt()
            val addressParce = binding.inputAddress.text.toString()
            val ageParce = binding.inputAge.text.toString().toInt()

            val myDataUser = DataUser(nameParce, emailParce, phoneParce, addressParce, ageParce)
            val move = Intent(this, ParcelableActivity2::class.java)
            move.putExtra("KUNCIDATA", myDataUser)
            startActivity(move)
        }
    }
}