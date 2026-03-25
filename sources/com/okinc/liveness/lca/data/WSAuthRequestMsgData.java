package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSAuthRequestMsgData {
    public static final int $stable = 0;
    private final String bizSessionId;
    private final long timestamp;
    private final String wsSessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSAuthRequestMsgData copy$default(WSAuthRequestMsgData wSAuthRequestMsgData, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSAuthRequestMsgData.bizSessionId;
        }
        if ((i & 2) != 0) {
            str2 = wSAuthRequestMsgData.wsSessionId;
        }
        if ((i & 4) != 0) {
            j = wSAuthRequestMsgData.timestamp;
        }
        return wSAuthRequestMsgData.copy(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bizSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSAuthRequestMsgData copy(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WSAuthRequestMsgData(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WSAuthRequestMsgData)) {
            return false;
        }
        WSAuthRequestMsgData wSAuthRequestMsgData = (WSAuthRequestMsgData) obj;
        return Intrinsics.EZpvd((Object) this.bizSessionId, (Object) wSAuthRequestMsgData.bizSessionId) && Intrinsics.EZpvd((Object) this.wsSessionId, (Object) wSAuthRequestMsgData.wsSessionId) && this.timestamp == wSAuthRequestMsgData.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizSessionId() {
        return this.bizSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWsSessionId() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.bizSessionId.hashCode() * 31) + this.wsSessionId.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSAuthRequestMsgData(bizSessionId=" + this.bizSessionId + ", wsSessionId=" + this.wsSessionId + ", timestamp=" + this.timestamp + ")";
    }

    public WSAuthRequestMsgData(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.bizSessionId = str;
        this.wsSessionId = str2;
        this.timestamp = j;
    }
}
