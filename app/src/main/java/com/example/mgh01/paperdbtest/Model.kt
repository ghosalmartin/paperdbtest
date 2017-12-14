package com.example.mgh01.paperdbtest

data class Model(val test: String = ""){

    private val foo by lazy {
        test
    }

}