package ge.msda.intentfirst

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import kotlin.system.exitProcess

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val name = intent?.extras?.getString("NAME", "ვერ მოიძებნა :/")
        val email = intent?.extras?.getString("EMAIL", "ვერ მოიძებნა :/")
        val sex = intent?.extras?.getString("SEX", "ვერ მოიძებნა :/")

        displayName.text = name
        displayEmail.text = email
        displaySex.text = sex

        exitApp.setOnClickListener { exitProcess(0) }
    }
}
