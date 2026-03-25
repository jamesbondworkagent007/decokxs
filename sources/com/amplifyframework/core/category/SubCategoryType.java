package com.amplifyframework.core.category;

/* JADX INFO: loaded from: classes2.dex */
public enum SubCategoryType {
    PUSH_NOTIFICATIONS("push"),
    INAPP_MESSAGING("inapp_messaging");

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

    SubCategoryType(String str) {
        this.configurationKey = str;
    }
}
