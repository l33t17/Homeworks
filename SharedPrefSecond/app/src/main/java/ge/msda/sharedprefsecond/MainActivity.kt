package ge.msda.sharedprefsecond

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prefs = getSharedPreferences("Welcome_Text", Context.MODE_PRIVATE)
        val editPrefs = prefs.edit()

        val msg = prefs.getString("msg", "Welcome, Guest!")
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

        addBtn.setOnClickListener {
            if(userInput.text.toString().isNotEmpty())
            {
                editPrefs.putString("msg", userInput.text.toString())
                editPrefs.apply()
                Toast.makeText(this, "Welcome text has been saved.", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Enter the text!", Toast.LENGTH_LONG).show()
            }
        }
    }
}