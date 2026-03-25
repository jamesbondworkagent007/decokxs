package com.reown.android.internal.common.modal.data.network.model;

import com.squareup.moshi.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class EnableAnalyticsDTO {
    public final boolean isAnalyticsEnabled;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EnableAnalyticsDTO copy$default(EnableAnalyticsDTO enableAnalyticsDTO, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = enableAnalyticsDTO.isAnalyticsEnabled;
        }
        return enableAnalyticsDTO.copy(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isAnalyticsEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnableAnalyticsDTO copy(@Json(name = "isAnalyticsEnabled") boolean z) {
        return new EnableAnalyticsDTO(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EnableAnalyticsDTO) && this.isAnalyticsEnabled == ((EnableAnalyticsDTO) obj).isAnalyticsEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Boolean.hashCode(this.isAnalyticsEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAnalyticsEnabled() {
        return this.isAnalyticsEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EnableAnalyticsDTO(isAnalyticsEnabled=" + this.isAnalyticsEnabled + ")";
    }

    public EnableAnalyticsDTO(@Json(name = "isAnalyticsEnabled") boolean z) {
        this.isAnalyticsEnabled = z;
    }
}
