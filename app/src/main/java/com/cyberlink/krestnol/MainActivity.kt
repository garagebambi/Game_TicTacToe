package com.cyberlink.krestnol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var winresx = "Кресты разъебали"
    var winreso = "Нули разъебали"
    var zeroBtn = ""
    val znakX:String = "x"
    val znakO:String = "O"
//    var znaks = mutableListOf<Int>()
    var znaks = mutableListOf("","","","","","","","","")
    var nowStep = "X"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var knopki = listOf(btn10, btn11, btn12, btn20, btn21, btn22, btn30, btn31, btn32 )
        for (i in 0..8){
            knopki[i].setOnClickListener {
                if(nowStep == "X"){
                    znaks[i] = znakX
//                    znaks.add(1)
                    knopki[i].text = znakX
                    nowStep = "O"

                }else{
                    znaks[i] = znakO
//                    znaks.add(1)
                    knopki[i].text = znakO
                    nowStep= "X"

                }
                knopki[i].isEnabled = false
                checkNew()
                notwin()
                if (winRes.text.isNotEmpty()){
                    knopki.forEach {
                        it.isEnabled = false
                    }
                }

            }
        }

        restart.setOnClickListener {
             znaks = mutableListOf("","","","","","","","","")
//            var znaks : MutableList<Int> = arrayListOf()
            winRes.text = ""
            nowStep = "X"
            knopki.forEach {
                it.text = zeroBtn
                it.isEnabled = true
            }



        }
    }

    fun checkNew(){
        if ((btn10.text.equals(znakX))&&(btn11.text.equals(znakX))&&(btn12.text.equals(znakX))) {
            winRes.text = winresx
        }
        if ((btn10.text.equals(znakX))&&(btn20.text.equals(znakX))&&(btn30.text.equals(znakX))) {
            winRes.text = winresx
        }
        if ((btn10.text.equals(znakX))&&(btn21.text.equals(znakX))&&(btn32.text.equals(znakX))) {
            winRes.text = winresx
        }
        if ((btn11.text.equals(znakX))&&(btn21.text.equals(znakX))&&(btn31.text.equals(znakX))) {
            winRes.text = winresx
        }
        if ((btn12.text.equals(znakX))&&(btn22.text.equals(znakX))&&(btn32.text.equals(znakX))) {
            winRes.text = winresx
        }
        if ((btn20.text.equals(znakX))&&(btn21.text.equals(znakX))&&(btn22.text.equals(znakX))) {
            winRes.text = winresx
        }
        if ((btn30.text.equals(znakX))&&(btn31.text.equals(znakX))&&(btn32.text.equals(znakX))) {
            winRes.text = winresx
        }
        if ((btn12.text.equals(znakX))&&(btn22.text.equals(znakX))&&(btn32.text.equals(znakX))) {
            winRes.text = winresx
        }
        /**Ниже проверка для О*/

        if ((btn10.text.equals(znakO))&&(btn11.text.equals(znakO))&&(btn12.text.equals(znakO))) {
            winRes.text = winreso
        }
        if ((btn10.text.equals(znakO))&&(btn20.text.equals(znakO))&&(btn30.text.equals(znakO))) {
            winRes.text = winreso
        }
        if ((btn10.text.equals(znakO))&&(btn21.text.equals(znakO))&&(btn32.text.equals(znakO))) {
            winRes.text = winreso
        }
        if ((btn11.text.equals(znakO))&&(btn21.text.equals(znakO))&&(btn31.text.equals(znakO))) {
            winRes.text = winreso
        }
        if ((btn12.text.equals(znakO))&&(btn22.text.equals(znakO))&&(btn32.text.equals(znakO))) {
            winRes.text = winreso
        }
        if ((btn20.text.equals(znakO))&&(btn21.text.equals(znakO))&&(btn22.text.equals(znakO))) {
            winRes.text = winreso
        }
        if ((btn30.text.equals(znakO))&&(btn31.text.equals(znakO))&&(btn32.text.equals(znakO))) {
            winRes.text = winreso
        }
        if ((btn12.text.equals(znakO))&&(btn22.text.equals(znakO))&&(btn32.text.equals(znakO))) {
            winRes.text = winreso
        }


    }

    fun notwin(){
        for (i in 0..8) {
            if (znaks[i].isEmpty()) {
            return
                        }
        }
        winRes.text = "НИЧЬЯ"
    }

//    fun notwin() {
//        if ((znaks.sum() > 8) && (winRes.text.isEmpty())) {
//            winRes.text = "НИЧЬЯ"
//        }
//
//
//    }
}









