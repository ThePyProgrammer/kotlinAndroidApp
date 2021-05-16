package com.example.kotlinandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    /*
    An activity represents a single screen with a user interface,in-short Activity performs actions
    on the screen. For example, an email application might have one activity that shows a list of
    new emails, another activity to compose an email, and another activity for reading emails. If
    an application has more than one activity, then one of them should be marked as the activity
    that is presented when the application is launched.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
    }

    /*
    fun startService(view: View) {
        startService(Intent(getBaseContext(), MyService))
    }

    // Method to stop the service
    public fun stopService(view: View) {
        stopService(Intent(getBaseContext(), MyService))
    }
    */
}