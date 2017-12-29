package com.androidedu.kodluyoruzakademi.activitylifecycle

import android.app.Fragment
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu

class BacisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacis)
        Log.e(activityname, "onCreate metodu")
        //Çalıştı
    }

    internal var activityname = "BacisActivity"
    override fun onContentChanged() {
        super.onContentChanged()
        Log.e(activityname, "OnContentChangedMetodu")
        //Çalıştı
    }

    override fun onStart() {
        super.onStart()
        Log.e(activityname, "OnStart")
        //Çalıştı
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e(activityname, "OnRestoreInstanceState")
        //Ekranın döndürülmesi ile çalıştı
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.e(activityname, "OnpostCreate")
        //Çalıştı
    }

    override fun onResume() {
        super.onResume()
        Log.e(activityname, "onResume")
        //Onstartın ardından çalıştı
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.e(activityname, "onPostResume")
        //Çalıştı.
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e(activityname, "onAttachtoWindow")
        //Çalıştı
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        Log.e(activityname, "OnCreateOptionsmenu")
        return super.onCreateOptionsMenu(menu)
        //Çalıştı
    }

    override fun onPrepareOptionsMenu(menu: Menu): Boolean {
        Log.e(activityname, "OnPrepareOptionsMenu")
        return super.onPrepareOptionsMenu(menu)
        //Çalıştı
    }

    override fun onPause() {
        super.onPause()
        Log.e(activityname, "OnPause")
        //Alta alınmak suretiyle çalıştı.
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.e(activityname, "OnSaveINstanceState")
        //Çalışmadı  outPersistentState: PersistableBundle kullanıldığı için çalışmadı
    }

    override fun onStop() {
        super.onStop()
        Log.e(activityname, "onStop")
        //Çalıştı
    }

    override fun onDestroy() {
        Log.e(activityname, "onDestroy")
        super.onDestroy()
        //Çalıştı kapatılırken
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.e(activityname, "onUserİteraction")
        //Uygulamanın içine dokununca çalıştı.
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        Log.e(activityname, "onUseLeaveHint")
        //Çalıştı
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.e(activityname, "onActivityResult")
        //Çalışmadı çünkü herhangi bir aktiviteden cevap alınmadı.
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(activityname, "onRestart")
        //Çalıştı
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        Log.e(activityname, "onAttachFragment")
        //Çalışmadı bir fragment eklenmediği için activitye
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.e(activityname, "onConfigurationChanged")
        //Calışmadı
        //Manifestte şu bildirimler olmadığı için çalışmadı
        //android:configChanges="keyboardHidden|orientation|screenSize"
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.e(activityname, "onBackPressed")
        //Back Tuşuna basılması ile çalıştı.
    }
}
