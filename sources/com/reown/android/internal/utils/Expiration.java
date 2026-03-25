package com.reown.android.internal.utils;

/* JADX INFO: loaded from: classes12.dex */
public final class Expiration {
    public static final long getPROPOSAL_EXPIRY() {
        return Time.getCurrentTimeInSeconds() + Time.getFiveMinutesInSeconds();
    }

    public static final long getACTIVE_SESSION() {
        return Time.getCurrentTimeInSeconds() + Time.getWeekInSeconds();
    }
}
