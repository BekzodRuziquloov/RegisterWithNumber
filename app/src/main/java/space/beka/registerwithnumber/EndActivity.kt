package space.beka.registerwithnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import space.beka.registerwithnumber.databinding.ActivityEndBinding

class EndActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEndBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndBinding.inflate(layoutInflater)
        setContentView(binding.root)
//binding.tvNumber.text
    }
}