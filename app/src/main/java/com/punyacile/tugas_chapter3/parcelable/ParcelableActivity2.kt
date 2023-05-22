package com.punyacile.tugas_chapter3.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.punyacile.tugas_chapter3.R
import com.punyacile.tugas_chapter3.databinding.ActivityParcelable2Binding

class ParcelableActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityParcelable2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityParcelable2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val getDataUser = intent.getParcelableExtra("KUNCIDATA") as DataUser?
        val namaP2 = getDataUser!!.name
        val emailP2 = getDataUser.email
        val numberPhone2 = getDataUser.phone
        val addressP2 = getDataUser.address
        val ageP2 = getDataUser.age

        binding.textNameParce.text = namaP2
        binding.textEmailParce.text = emailP2
        binding.textPhoneParce.text = numberPhone2.toString()
        binding.textAddressParce.text = addressP2
        binding.textAgeParce.text = ageP2.toString()


    }
}