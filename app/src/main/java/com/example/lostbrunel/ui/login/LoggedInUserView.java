package com.example.lostbrunel.ui.login;

import com.example.lostbrunel.MapsActivity;

/**
 * Class exposing authenticated user details to the UI.
 */
class LoggedInUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI

    LoggedInUserView(String displayName) {
        this.displayName = displayName;
    }
  //for another session here is where home page needs to be displayed

    String getDisplayName() {
        return displayName;
    }
}
