package com.android.installreferrer.api;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ReferrerDetails {
    private static final String KEY_GOOGLE_PLAY_INSTANT = "google_play_instant";
    private static final String KEY_INSTALL_BEGIN_TIMESTAMP = "install_begin_timestamp_seconds";
    private static final String KEY_INSTALL_BEGIN_TIMESTAMP_SERVER = "install_begin_timestamp_server_seconds";
    private static final String KEY_INSTALL_REFERRER = "install_referrer";
    private static final String KEY_INSTALL_VERSION = "install_version";
    private static final String KEY_REFERRER_CLICK_TIMESTAMP = "referrer_click_timestamp_seconds";
    private static final String KEY_REFERRER_CLICK_TIMESTAMP_SERVER = "referrer_click_timestamp_server_seconds";
    private final Bundle mOriginalBundle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReferrerDetails(Bundle bundle) {
        this.mOriginalBundle = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getGooglePlayInstantParam() {
        return this.mOriginalBundle.getBoolean(KEY_GOOGLE_PLAY_INSTANT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getInstallBeginTimestampSeconds() {
        return this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getInstallBeginTimestampServerSeconds() {
        return this.mOriginalBundle.getLong(KEY_INSTALL_BEGIN_TIMESTAMP_SERVER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getInstallReferrer() {
        return this.mOriginalBundle.getString(KEY_INSTALL_REFERRER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getInstallVersion() {
        return this.mOriginalBundle.getString(KEY_INSTALL_VERSION);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getReferrerClickTimestampSeconds() {
        return this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getReferrerClickTimestampServerSeconds() {
        return this.mOriginalBundle.getLong(KEY_REFERRER_CLICK_TIMESTAMP_SERVER);
    }
}
