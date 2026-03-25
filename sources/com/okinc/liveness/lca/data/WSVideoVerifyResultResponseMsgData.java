package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class WSVideoVerifyResultResponseMsgData {
    public static final int $stable = 0;
    private final String status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSVideoVerifyResultResponseMsgData copy$default(WSVideoVerifyResultResponseMsgData wSVideoVerifyResultResponseMsgData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wSVideoVerifyResultResponseMsgData.status;
        }
        return wSVideoVerifyResultResponseMsgData.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSVideoVerifyResultResponseMsgData copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WSVideoVerifyResultResponseMsgData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSVideoVerifyResultResponseMsgData) && Intrinsics.EZpvd((Object) this.status, (Object) ((WSVideoVerifyResultResponseMsgData) obj).status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSVideoVerifyResultResponseMsgData(status=" + this.status + ")";
    }

    public WSVideoVerifyResultResponseMsgData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }
}
