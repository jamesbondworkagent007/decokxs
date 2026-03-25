package com.okinc.web3.security.utils.internal;

import o.pUU;

/* JADX INFO: loaded from: classes12.dex */
public final class MemoryReclaimDetector {
    public static final int $stable;
    private static final String TAG = "MemoryReclaimDetector";
    public static final MemoryReclaimDetector INSTANCE = new MemoryReclaimDetector();
    private static volatile String canary = "loaded_at_" + System.currentTimeMillis();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMemoryReclaimed() {
        return canary == null;
    }

    private MemoryReclaimDetector() {
    }

    static {
        pUU.KWHzl(TAG, "MemoryReclaimDetector initialized with canary: " + canary);
        $stable = 8;
    }
}
