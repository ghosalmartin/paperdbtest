package com.example.mgh01.paperdbtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.paperdb.Paper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Paper.init(applicationContext)

        val source = Source()

        source.write().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe { success, failure ->

            success?.let {
                Log.d("RESULT", "SUCCESS")
            }

            failure?.let {
                Log.d("RESULT", "FAILURE")

            }

        }


    }
}
