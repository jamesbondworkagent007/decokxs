package com.reown.android.pairing.model;

import com.reown.android.internal.utils.Time;

/* JADX INFO: loaded from: classes12.dex */
public final class Expiration {
    public static final long getPairingExpiry() {
        return Time.getCurrentTimeInSeconds() + Time.getFiveMinutesInSeconds();
    }
}
