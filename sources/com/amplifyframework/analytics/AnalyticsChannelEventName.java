package com.amplifyframework.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public enum AnalyticsChannelEventName {
    INVALID_PROPERTY_TYPE("invalid_property_type"),
    FLUSH_EVENTS("flushEvents");

    private final String hubEventName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.hubEventName;
    }

    AnalyticsChannelEventName(@NonNull String str) {
        Objects.requireNonNull(str);
        this.hubEventName = str;
    }

    public static AnalyticsChannelEventName fromString(@Nullable String str) {
        for (AnalyticsChannelEventName analyticsChannelEventName : values()) {
            if (analyticsChannelEventName.toString().equals(str)) {
                return analyticsChannelEventName;
            }
        }
        throw new IllegalArgumentException("Analytics category does not publish any Hub event with name = " + str);
    }
}
