package com.okinc.liveness.lca.debugtool.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJwstQueryResultData implements LivenessResponse {
    public static final int $stable = 8;
    private final LcaJwstModelResult modelResult;
    private final String wsSessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaJwstQueryResultData copy$default(LcaJwstQueryResultData lcaJwstQueryResultData, String str, LcaJwstModelResult lcaJwstModelResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaJwstQueryResultData.wsSessionId;
        }
        if ((i & 2) != 0) {
            lcaJwstModelResult = lcaJwstQueryResultData.modelResult;
        }
        return lcaJwstQueryResultData.copy(str, lcaJwstModelResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstModelResult component2() {
        return this.modelResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstQueryResultData copy(@NotNull String str, @NotNull LcaJwstModelResult lcaJwstModelResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lcaJwstModelResult, "");
        return new LcaJwstQueryResultData(str, lcaJwstModelResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaJwstQueryResultData)) {
            return false;
        }
        LcaJwstQueryResultData lcaJwstQueryResultData = (LcaJwstQueryResultData) obj;
        return Intrinsics.EZpvd((Object) this.wsSessionId, (Object) lcaJwstQueryResultData.wsSessionId) && Intrinsics.EZpvd(this.modelResult, lcaJwstQueryResultData.modelResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstModelResult getModelResult() {
        return this.modelResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWsSessionId() {
        return this.wsSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.wsSessionId.hashCode() * 31) + this.modelResult.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaJwstQueryResultData(wsSessionId=" + this.wsSessionId + ", modelResult=" + this.modelResult + ")";
    }

    public LcaJwstQueryResultData(@NotNull String str, @NotNull LcaJwstModelResult lcaJwstModelResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lcaJwstModelResult, "");
        this.wsSessionId = str;
        this.modelResult = lcaJwstModelResult;
    }
}
