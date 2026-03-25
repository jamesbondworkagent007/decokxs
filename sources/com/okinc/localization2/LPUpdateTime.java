package com.okinc.localization2;

import android.os.SystemClock;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class LPUpdateTime {
    private static final int MIN_GAP_MS = 60000;
    public static final LPUpdateTime INSTANCE = new LPUpdateTime();
    private static long successTime = -1;
    public static final int $stable = 8;

    private LPUpdateTime() {
    }

    public final void updateSuccessTime() {
        successTime = SystemClock.elapsedRealtime();
    }

    public final boolean isUpdateSuccessRecently() {
        if (successTime < 0) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = successTime;
        boolean z = jElapsedRealtime - j < 60000;
        if (z) {
            pUU.KWHzl("LocalizeCoreManager", "updateSuccessRecently is true. last:" + j + ", current:" + jElapsedRealtime);
        }
        return z;
    }
}
