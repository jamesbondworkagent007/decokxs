package com.amplifyframework.core.category;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes2.dex */
public enum CategoryType {
    ANALYTICS("analytics"),
    API("api"),
    AUTH("auth"),
    DATASTORE("dataStore"),
    HUB("hub"),
    LOGGING(RequestParameters.SUBRESOURCE_LOGGING),
    NOTIFICATIONS("notifications"),
    PREDICTIONS("predictions"),
    STORAGE("storage"),
    GEO("geo");

    private final String configurationKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getConfigurationKey() {
        return this.configurationKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.configurationKey;
    }

    CategoryType(String str) {
        this.configurationKey = str;
    }
}
