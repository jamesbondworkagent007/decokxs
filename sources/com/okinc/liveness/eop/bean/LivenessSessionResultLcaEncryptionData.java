package com.okinc.liveness.eop.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LivenessSessionResultLcaEncryptionData {
    public static final int $stable = 8;
    private String wsSessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LivenessSessionResultLcaEncryptionData copy$default(LivenessSessionResultLcaEncryptionData livenessSessionResultLcaEncryptionData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livenessSessionResultLcaEncryptionData.wsSessionId;
        }
        return livenessSessionResultLcaEncryptionData.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessSessionResultLcaEncryptionData copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LivenessSessionResultLcaEncryptionData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LivenessSessionResultLcaEncryptionData) && Intrinsics.EZpvd((Object) this.wsSessionId, (Object) ((LivenessSessionResultLcaEncryptionData) obj).wsSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWsSessionId() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.wsSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWsSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wsSessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessSessionResultLcaEncryptionData(wsSessionId=" + this.wsSessionId + ")";
    }

    public LivenessSessionResultLcaEncryptionData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wsSessionId = str;
    }
}
