package com.welie.blessed;

/* JADX INFO: loaded from: classes24.dex */
public enum AdvertiseError {
    DATA_TOO_LARGE(1),
    TOO_MANY_ADVERTISERS(2),
    ALREADY_STARTED(3),
    INTERNAL_ERROR(4),
    FEATURE_UNSUPPORTED(5),
    UNKNOWN_ERROR(-1);

    public final int value;

    AdvertiseError(int i) {
        this.value = i;
    }

    public static AdvertiseError fromValue(int i) {
        for (AdvertiseError advertiseError : values()) {
            if (advertiseError.value == i) {
                return advertiseError;
            }
        }
        return UNKNOWN_ERROR;
    }
}
