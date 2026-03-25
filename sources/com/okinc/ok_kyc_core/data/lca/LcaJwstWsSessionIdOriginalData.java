package com.okinc.ok_kyc_core.data.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaJwstWsSessionIdOriginalData {
    public static final int $stable = 0;
    private final String clientId;
    private final String requestId;
    private final String wsSessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaJwstWsSessionIdOriginalData copy$default(LcaJwstWsSessionIdOriginalData lcaJwstWsSessionIdOriginalData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaJwstWsSessionIdOriginalData.clientId;
        }
        if ((i & 2) != 0) {
            str2 = lcaJwstWsSessionIdOriginalData.requestId;
        }
        if ((i & 4) != 0) {
            str3 = lcaJwstWsSessionIdOriginalData.wsSessionId;
        }
        return lcaJwstWsSessionIdOriginalData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstWsSessionIdOriginalData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LcaJwstWsSessionIdOriginalData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaJwstWsSessionIdOriginalData)) {
            return false;
        }
        LcaJwstWsSessionIdOriginalData lcaJwstWsSessionIdOriginalData = (LcaJwstWsSessionIdOriginalData) obj;
        return Intrinsics.EZpvd((Object) this.clientId, (Object) lcaJwstWsSessionIdOriginalData.clientId) && Intrinsics.EZpvd((Object) this.requestId, (Object) lcaJwstWsSessionIdOriginalData.requestId) && Intrinsics.EZpvd((Object) this.wsSessionId, (Object) lcaJwstWsSessionIdOriginalData.wsSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWsSessionId() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.clientId.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.wsSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaJwstWsSessionIdOriginalData(clientId=" + this.clientId + ", requestId=" + this.requestId + ", wsSessionId=" + this.wsSessionId + ")";
    }

    public LcaJwstWsSessionIdOriginalData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.clientId = str;
        this.requestId = str2;
        this.wsSessionId = str3;
    }
}
