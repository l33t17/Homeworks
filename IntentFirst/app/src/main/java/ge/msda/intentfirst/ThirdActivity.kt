package ge.msda.intentfirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val name = intent.extras?.getString("NAME", "")
        val email = intent.extras?.getString("EMAIL", "")

        var sex = ""

        radioGroupSex.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId){
                1 -> sex = "მამრობითი"
                2 -> sex = "მდედრობითი"
                3 -> sex = "ორივე"
                else -> Toast.makeText(this, "აირჩიეთ სქესი!", Toast.LENGTH_LONG).show()
            }
        }

        toFinish.setOnClickListener {
            if(sex != "")
                startActivity(Intent(this, FinishActivity::class.java)
            .putExtra("SEX", sex)
            .putExtra("NAME", name)
            .putExtra("EMAIL", email))
        }
    }
}
