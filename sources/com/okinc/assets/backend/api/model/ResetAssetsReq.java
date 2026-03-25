package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class ResetAssetsReq {
    public static final int $stable = 0;
    private final String ccy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ResetAssetsReq copy$default(ResetAssetsReq resetAssetsReq, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetAssetsReq.ccy;
        }
        return resetAssetsReq.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResetAssetsReq copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ResetAssetsReq(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResetAssetsReq) && Intrinsics.EZpvd((Object) this.ccy, (Object) ((ResetAssetsReq) obj).ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.ccy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResetAssetsReq(ccy=" + this.ccy + ")";
    }

    public ResetAssetsReq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }
}
