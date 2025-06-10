package br.com.educacaocrescer.agendaescolinacrescer

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.com.educacaocrescer.agendaescolinacrescer.databinding.ActivityBoasVindasBinding

class BoasVindasActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityBoasVindasBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnProfessor.setOnClickListener {
            startActivity(
                Intent(this,LoginProfessorActivity::class.java)
            )
        }
        binding.btnResponsavel.setOnClickListener {
            startActivity(
                Intent(this,LoginResponsavelActivity::class.java)
            )
        }



    }
}