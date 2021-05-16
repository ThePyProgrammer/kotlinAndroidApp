package com.example.kotlinandroidapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {
    /** indicates how to behave if the service is killed  */
    var mStartMode = 0

    /** interface for clients that bind  */
    var mBinder: IBinder? = null

    /** indicates whether onRebind should be used  */
    var mAllowRebind = false

    /** Called when the service is being created.  */
    override fun onCreate() {}
    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        // Let it continue running until it is stopped.
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show()
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show()
    }

    override fun onBind(intent: Intent): IBinder? {
        return mBinder
    }

    /** Called when all clients have unbound with unbindService()  */
    override fun onUnbind(intent: Intent): Boolean {
        return mAllowRebind
    }

    /** Called when a client is binding to the service with bindService() */
    override fun onRebind(intent: Intent) {}
}