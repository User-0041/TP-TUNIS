package com.example.tprecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tprecycle.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val GovID = intent.getIntExtra(GOV_ID_EXTRA, -1)
        val Gov = GovFromID(GovID)
        if(Gov != null)
        {
            binding.cover.setImageResource(Gov.cover)
            binding.title.text = Gov.title

        }
    }

    private fun GovFromID(GovID: Int): Gov? {
        for(Gov in GovList)
        {
            if(Gov.id == GovID)
                return Gov
        }
        return null

    }
}