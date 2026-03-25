package com.amplitude.android.storage;

/* JADX INFO: loaded from: classes2.dex */
public enum StorageVersion {
    V3(3);

    private final int rawValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRawValue() {
        return this.rawValue;
    }

    StorageVersion(int i) {
        this.rawValue = i;
    }
}
