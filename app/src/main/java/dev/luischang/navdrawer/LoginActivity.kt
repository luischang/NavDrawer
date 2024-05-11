package dev.luischang.navdrawer

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btLogin: Button = findViewById(R.id.btLogin)

        btLogin.setOnClickListener {
            val email: String = etEmail.text.toString()
            val password: String = etPassword.text.toString()

            if(email == "invitado@esan.com" && password == "invitado123")
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            Toast.makeText(this
                    , "Credenciales inválidas"
                    ,Toast.LENGTH_LONG).show()
//            val rootView: View = findViewById(android.R.id.content)
//            Snackbar.make(rootView
//                            ,"Credenciales inválidas"
//                            , Snackbar.LENGTH_LONG).show()
        }




    }
}