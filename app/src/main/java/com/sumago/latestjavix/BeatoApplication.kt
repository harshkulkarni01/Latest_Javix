package com.sumago.latestjavix

import `in`.sunfox.healthcare.commons.android.spandan_sdk.OnInitializationCompleteListener
import `in`.sunfox.healthcare.commons.android.spandan_sdk.SpandanSDK
import android.app.Application

class BeatoApplication :Application() {

    var token : String?=null

    /**
     * step :-1
     * sdk initialization*/
    override fun onCreate() {
        super.onCreate()
        SpandanSDK.initialize(this@BeatoApplication,"kV29xQrTACRJT9Cw",object : OnInitializationCompleteListener{
            override fun onInitializationSuccess(authenticationToken: String) {
                token = authenticationToken
            }

            override fun onInitializationFailed(message: String) {

            }

        })
    }
}