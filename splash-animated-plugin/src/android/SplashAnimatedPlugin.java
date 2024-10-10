package com.example.splashanimated;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SplashAnimatedPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showSplashAnimated")) {
            this.showSplashAnimated();
            callbackContext.success();
            return true;
        }
        return false;
    }

    private void showSplashAnimated() {
        // Lógica para exibir a splash screen animada no Android
    }
}
