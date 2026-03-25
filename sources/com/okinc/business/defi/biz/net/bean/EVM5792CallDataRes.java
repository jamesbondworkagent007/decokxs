package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EVM5792CallDataRes {
    public static final int $stable = 0;
    private final String callData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EVM5792CallDataRes copy$default(EVM5792CallDataRes eVM5792CallDataRes, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVM5792CallDataRes.callData;
        }
        return eVM5792CallDataRes.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792CallDataRes copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EVM5792CallDataRes(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EVM5792CallDataRes) && Intrinsics.EZpvd((Object) this.callData, (Object) ((EVM5792CallDataRes) obj).callData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.callData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EVM5792CallDataRes(callData=" + this.callData + ")";
    }

    public EVM5792CallDataRes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callData = str;
    }
}
