package com.suleymankorkmaz.hissesenedihesab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Toast
import com.suleymankorkmaz.hissesenedihesab.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding




class MainActivity : AppCompatActivity() {

    var sonuc1 : Int? = null
    var toplamHisseDegerinizInteger : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.hesapla1.setOnClickListener {
            sirketHisseHesabı()
        }

        binding.hesapla2.setOnClickListener {
            sahsiHisseHesabı()
        }

    }


    fun sirketHisseHesabı() {

        val sirketDegeriString = binding.sirketDegeriText.text.toString()
        val hisseSayısıString = binding.hisseSayisiText.text.toString()

        if (sirketDegeriString.isEmpty() || sirketDegeriString.toInt()==0 || hisseSayısıString.isEmpty() || hisseSayısıString.toInt()==0) {

            Toast.makeText(this, "Değer giriniz", Toast.LENGTH_SHORT).show()

        } else {
            sonuc1 = sirketDegeriString.toInt() / hisseSayısıString.toInt()

            binding.birHisseninDegeriText.text = sonuc1.toString()
        }

    }


    fun sahsiHisseHesabı() {


        val hisseSayınızString = binding.trText.text.toString()

        if (hisseSayınızString.isEmpty() || hisseSayınızString.toInt() == 0) {
            Toast.makeText(this, "Değer giriniz", Toast.LENGTH_SHORT).show()
        } else {
            toplamHisseDegerinizInteger = sonuc1!! * hisseSayınızString.toInt()

            binding.toplamHisseDegeriniz.text = toplamHisseDegerinizInteger.toString()
        }







    }






























}