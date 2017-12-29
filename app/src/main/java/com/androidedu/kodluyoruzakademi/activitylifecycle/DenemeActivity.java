package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;

/*



 */
public class DenemeActivity extends AppCompatActivity {
    String activityname = "DenemeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deneme);
        Log.e(activityname, "onCreate metodu");
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        Log.e(activityname, "OnContentChangedMetodu");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(activityname, "OnStart");

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(activityname, "OnRestoreInstanceState");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.e(activityname, "OnpostCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(activityname, "onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.e(activityname, "onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e(activityname, "onAttachtoWindow");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.e(activityname, "OnCreateOptionsmenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Log.e(activityname, "OnPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(activityname, "OnPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e(activityname, "OnSaveINstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(activityname, "onStop");
    }

    @Override
    protected void onDestroy() {
        Log.e(activityname, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        Log.e(activityname, "onUserİteraction");
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Log.e(activityname, "onUseLeaveHint");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(activityname, "onActivityResult");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(activityname, "onRestart");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(activityname, "onAttachFragment");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(activityname, "onConfigurationChanged");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(activityname, "onBackPressed");
    }
}
