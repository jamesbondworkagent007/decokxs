package com.welie.blessed;

/* JADX INFO: loaded from: classes17.dex */
public enum ScanFailure {
    ALREADY_STARTED(1),
    APPLICATION_REGISTRATION_FAILED(2),
    INTERNAL_ERROR(3),
    FEATURE_UNSUPPORTED(4),
    OUT_OF_HARDWARE_RESOURCES(5),
    SCANNING_TOO_FREQUENTLY(6),
    UNKNOWN(-1);

    public final int value;

    ScanFailure(int i) {
        this.value = i;
    }

    public static ScanFailure fromValue(int i) {
        for (ScanFailure scanFailure : values()) {
            if (scanFailure.value == i) {
                return scanFailure;
            }
        }
        return UNKNOWN;
    }
}
