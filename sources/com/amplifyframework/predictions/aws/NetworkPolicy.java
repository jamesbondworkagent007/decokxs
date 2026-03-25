package com.amplifyframework.predictions.aws;

import androidx.annotation.Nullable;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public enum NetworkPolicy {
    OFFLINE("offline"),
    AUTO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);

    private final String configurationKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getConfigurationKey() {
        return this.configurationKey;
    }

    NetworkPolicy(String str) {
        this.configurationKey = str;
    }

    public static NetworkPolicy fromKey(@Nullable String str) {
        for (NetworkPolicy networkPolicy : values()) {
            if (networkPolicy.getConfigurationKey().equals(str)) {
                return networkPolicy;
            }
        }
        throw new IllegalArgumentException("There is no network policy that matches the provided key.");
    }
}
