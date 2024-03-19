package com.SOF304.yennth.Lab.Lab3.B5.service;

import com.SOF304.yennth.Lab.Lab3.B5.entity.B5_UserProfile;

public class B5_UserProfileManager {
    private B5_UserProfile profile;

    // Constructor
    public B5_UserProfileManager(B5_UserProfile profile) {
        this.profile = profile;
    }

    // Method to get user's name
    public String getUserName() {
        if (profile != null) {
            return profile.getName();
        } else {
            throw new NullPointerException("User profile is null");
        }
    }
}