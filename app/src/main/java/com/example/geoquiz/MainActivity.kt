package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        trueButton.setOnClickListener { view: View ->
//            Toast.makeText(
//                this,
//                R.string.correct_toast,
//                Toast.LENGTH_SHORT
//            ).show()
            val snackbar=Snackbar.make(
                view,
                R.string.correct_toast,
                BaseTransientBottomBar.LENGTH_SHORT
            )
            snackbar.show();
            snackbar.setAction("Undo"){

            }





// Do something in response to the click here
        }
        falseButton.setOnClickListener { view: View ->
// Do something in response to the click here
//            Toast.makeText(
//                this,
//                R.string.incorrect_toast,
//                Toast.LENGTH_SHORT
//            ).show()
            val snackbar = Snackbar.make(
                view,
                R.string.incorrect_toast,
                BaseTransientBottomBar.LENGTH_SHORT
            )
            snackbar.show();

            snackbar.setAction("Retry"){

            }
        }


    }
}