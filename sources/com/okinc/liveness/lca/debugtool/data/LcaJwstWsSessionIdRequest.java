package com.okinc.liveness.lca.debugtool.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJwstWsSessionIdRequest {
    public static final int $stable = 0;
    private final String bizSessionId;
    private final String clientId;
    private final String pubKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaJwstWsSessionIdRequest copy$default(LcaJwstWsSessionIdRequest lcaJwstWsSessionIdRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaJwstWsSessionIdRequest.clientId;
        }
        if ((i & 2) != 0) {
            str2 = lcaJwstWsSessionIdRequest.bizSessionId;
        }
        if ((i & 4) != 0) {
            str3 = lcaJwstWsSessionIdRequest.pubKey;
        }
        return lcaJwstWsSessionIdRequest.copy(str, str2, str3);
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
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstWsSessionIdRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LcaJwstWsSessionIdRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaJwstWsSessionIdRequest)) {
            return false;
        }
        LcaJwstWsSessionIdRequest lcaJwstWsSessionIdRequest = (LcaJwstWsSessionIdRequest) obj;
        return Intrinsics.EZpvd((Object) this.clientId, (Object) lcaJwstWsSessionIdRequest.clientId) && Intrinsics.EZpvd((Object) this.bizSessionId, (Object) lcaJwstWsSessionIdRequest.bizSessionId) && Intrinsics.EZpvd((Object) this.pubKey, (Object) lcaJwstWsSessionIdRequest.pubKey);
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
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.clientId.hashCode() * 31) + this.bizSessionId.hashCode()) * 31) + this.pubKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaJwstWsSessionIdRequest(clientId=" + this.clientId + ", bizSessionId=" + this.bizSessionId + ", pubKey=" + this.pubKey + ")";
    }

    public LcaJwstWsSessionIdRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.clientId = str;
        this.bizSessionId = str2;
        this.pubKey = str3;
    }
}
