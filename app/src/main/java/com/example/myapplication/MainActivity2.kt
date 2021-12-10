package com.example.myapplication

import android.accounts.Account
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }


    fun button_click(view: View)
    {
        var Card_label: TextView = findViewById(R.id.textView4)
        var Card_name: TextView = findViewById(R.id.textView8)
        var Card_cost: TextView = findViewById(R.id.textView5)
        var Account_label: TextView = findViewById(R.id.textView6)
        var Account_name: TextView = findViewById(R.id.textView9)
        var Account_cost: TextView = findViewById(R.id.textView7)

        if (Card_name.visibility === View.VISIBLE) {
            (view as TextView).text = "Показать"
        }else
        {
            (view as TextView).text = "Скрыть"
        }
        Card_name.setVisibility(if (Card_name.getVisibility() === View.VISIBLE) View.INVISIBLE else View.VISIBLE)
        Card_cost.setVisibility(if (Card_cost.getVisibility() === View.VISIBLE) View.INVISIBLE else View.VISIBLE)
        Account_cost.setVisibility(if (Account_cost.getVisibility() === View.VISIBLE) View.INVISIBLE else View.VISIBLE)
        Account_name.setVisibility(if (Account_name.getVisibility() === View.VISIBLE) View.INVISIBLE else View.VISIBLE)
        Account_label.setVisibility(if (Account_label.getVisibility() === View.VISIBLE) View.INVISIBLE else View.VISIBLE)

    }
}