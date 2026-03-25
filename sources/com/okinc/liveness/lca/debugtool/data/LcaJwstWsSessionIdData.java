package com.okinc.liveness.lca.debugtool.data;

import com.okinc.ok_kyc_core.data.lca.LcaJwstWsSessionIdOriginalData;
import com.okinc.ok_kyc_core.data.lca.LcaObfuscateData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJwstWsSessionIdData {
    public static final int $stable = LcaObfuscateData.$stable | LcaJwstWsSessionIdOriginalData.$stable;
    private final LcaObfuscateData obfuscateData;
    private final LcaJwstWsSessionIdOriginalData originalData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaJwstWsSessionIdData copy$default(LcaJwstWsSessionIdData lcaJwstWsSessionIdData, LcaJwstWsSessionIdOriginalData lcaJwstWsSessionIdOriginalData, LcaObfuscateData lcaObfuscateData, int i, Object obj) {
        if ((i & 1) != 0) {
            lcaJwstWsSessionIdOriginalData = lcaJwstWsSessionIdData.originalData;
        }
        if ((i & 2) != 0) {
            lcaObfuscateData = lcaJwstWsSessionIdData.obfuscateData;
        }
        return lcaJwstWsSessionIdData.copy(lcaJwstWsSessionIdOriginalData, lcaObfuscateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstWsSessionIdOriginalData component1() {
        return this.originalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaObfuscateData component2() {
        return this.obfuscateData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstWsSessionIdData copy(@NotNull LcaJwstWsSessionIdOriginalData lcaJwstWsSessionIdOriginalData, @NotNull LcaObfuscateData lcaObfuscateData) {
        Intrinsics.checkNotNullParameter(lcaJwstWsSessionIdOriginalData, "");
        Intrinsics.checkNotNullParameter(lcaObfuscateData, "");
        return new LcaJwstWsSessionIdData(lcaJwstWsSessionIdOriginalData, lcaObfuscateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaJwstWsSessionIdData)) {
            return false;
        }
        LcaJwstWsSessionIdData lcaJwstWsSessionIdData = (LcaJwstWsSessionIdData) obj;
        return Intrinsics.EZpvd(this.originalData, lcaJwstWsSessionIdData.originalData) && Intrinsics.EZpvd(this.obfuscateData, lcaJwstWsSessionIdData.obfuscateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaObfuscateData getObfuscateData() {
        return this.obfuscateData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstWsSessionIdOriginalData getOriginalData() {
        return this.originalData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.originalData.hashCode() * 31) + this.obfuscateData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaJwstWsSessionIdData(originalData=" + this.originalData + ", obfuscateData=" + this.obfuscateData + ")";
    }

    public LcaJwstWsSessionIdData(@NotNull LcaJwstWsSessionIdOriginalData lcaJwstWsSessionIdOriginalData, @NotNull LcaObfuscateData lcaObfuscateData) {
        Intrinsics.checkNotNullParameter(lcaJwstWsSessionIdOriginalData, "");
        Intrinsics.checkNotNullParameter(lcaObfuscateData, "");
        this.originalData = lcaJwstWsSessionIdOriginalData;
        this.obfuscateData = lcaObfuscateData;
    }
}
