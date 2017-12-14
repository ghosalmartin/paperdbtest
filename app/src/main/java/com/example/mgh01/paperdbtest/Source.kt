package com.example.mgh01.paperdbtest

import io.paperdb.Paper
import io.reactivex.Single

class Source(){

    fun write(): Single<String> = Single.defer {
        Paper.book().write("KEY", Model())
        Single.just("")
    }

}