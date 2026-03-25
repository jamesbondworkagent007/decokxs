package com.okinc.liveness.lca.debugtool.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJwstQueryResultRequest {
    public static final int $stable = 0;
    private final String bizSessionId;
    private final String clientId;
    private final String wsSessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaJwstQueryResultRequest copy$default(LcaJwstQueryResultRequest lcaJwstQueryResultRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaJwstQueryResultRequest.clientId;
        }
        if ((i & 2) != 0) {
            str2 = lcaJwstQueryResultRequest.bizSessionId;
        }
        if ((i & 4) != 0) {
            str3 = lcaJwstQueryResultRequest.wsSessionId;
        }
        return lcaJwstQueryResultRequest.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bizSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstQueryResultRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LcaJwstQueryResultRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaJwstQueryResultRequest)) {
            return false;
        }
        LcaJwstQueryResultRequest lcaJwstQueryResultRequest = (LcaJwstQueryResultRequest) obj;
        return Intrinsics.EZpvd((Object) this.clientId, (Object) lcaJwstQueryResultRequest.clientId) && Intrinsics.EZpvd((Object) this.bizSessionId, (Object) lcaJwstQueryResultRequest.bizSessionId) && Intrinsics.EZpvd((Object) this.wsSessionId, (Object) lcaJwstQueryResultRequest.wsSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizSessionId() {
        return this.bizSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWsSessionId() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.clientId.hashCode() * 31) + this.bizSessionId.hashCode()) * 31) + this.wsSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaJwstQueryResultRequest(clientId=" + this.clientId + ", bizSessionId=" + this.bizSessionId + ", wsSessionId=" + this.wsSessionId + ")";
    }

    public LcaJwstQueryResultRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.clientId = str;
        this.bizSessionId = str2;
        this.wsSessionId = str3;
    }
}
