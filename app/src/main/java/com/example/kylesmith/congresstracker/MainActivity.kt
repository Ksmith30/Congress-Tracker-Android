package com.example.kylesmith.congresstracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val service: ProPublicaApiService = ProPublicaApiService.create(getString(R.string.key))
        service.getCongressMembers("senate")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe ({
                    result ->
                    Log.d("Results: ", result.copyright)
                }, error("ERRRRRRROOORR")
                )
    }
}
