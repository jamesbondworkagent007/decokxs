package com.amplitude.experiment;

/* JADX INFO: loaded from: classes2.dex */
public enum VariantSource {
    LOCAL_STORAGE("storage"),
    INITIAL_VARIANTS("initial"),
    SECONDARY_LOCAL_STORAGE("secondary-storage"),
    SECONDARY_INITIAL_VARIANTS("secondary-initial"),
    FALLBACK_INLINE("fallback-inline"),
    FALLBACK_CONFIG("fallback-config"),
    LOCAL_EVALUATION("local-evaluation");

    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFallback() {
        return this == FALLBACK_INLINE || this == FALLBACK_CONFIG || this == SECONDARY_INITIAL_VARIANTS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }

    VariantSource(String str) {
        this.type = str;
    }
}
